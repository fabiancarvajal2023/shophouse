package com.fabian.backend.shophouse.ventas.database.dao;

import com.fabian.backend.shophouse.cliente.database.dao.ClienteRepository;
import com.fabian.backend.shophouse.cliente.database.model.Cliente;
import com.fabian.backend.shophouse.producto.database.dao.ProductoRepository;
import com.fabian.backend.shophouse.producto.database.modelo.Producto;
import com.fabian.backend.shophouse.ventas.database.modelo.ProductoVenta;
import com.fabian.backend.shophouse.ventas.database.modelo.Venta;
import com.fabian.backend.shophouse.ventas.modelo.ProductoVentaRequest;
import com.fabian.backend.shophouse.ventas.modelo.VentaRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class VentaDaoImpl implements VentaDao {

    private final VentaRepository ventaRepository;
    private final ProductoVentaRepository productoVentaRepository;
    private final ClienteRepository clienteRepository;
    private final ProductoRepository productoRepository;

    @Override
    @Transactional
    public boolean save(VentaRequest ventaRequest) {

        Optional<Cliente> cliente = clienteRepository.findById(ventaRequest.getCliente());
        if(cliente.isPresent())
        {
            Venta venta = new Venta(-1L,ventaRequest.getFecha(),cliente.get(),ventaRequest.getVentaTotal(),ventaRequest.getVentaTotalCompra());
            Venta saveVenta = ventaRepository.save(venta);
            for(ProductoVentaRequest ventaProductoRequest :ventaRequest.getProductoVenta()){
                Optional<Producto> producto = productoRepository.findById(ventaProductoRequest.getProducto());
                if(producto.isPresent()){
                    ProductoVenta productoVenta = new ProductoVenta(-1L,saveVenta,producto.get(), ventaProductoRequest.getCantidad(), ventaProductoRequest.getPrecioVenta(), ventaProductoRequest.getPrecioCompra());
                    productoVentaRepository.save(productoVenta);
                }
                else{
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
