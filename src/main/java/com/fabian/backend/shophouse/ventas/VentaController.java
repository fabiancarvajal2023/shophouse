package com.fabian.backend.shophouse.ventas;

import com.fabian.backend.shophouse.ventas.database.dao.VentaDao;
import com.fabian.backend.shophouse.ventas.modelo.VentaRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/venta")
@RequiredArgsConstructor
public class VentaController {

    @Autowired
    private VentaDao ventaDao;

    @PostMapping("/registrar")
    public boolean save(@RequestBody VentaRequest ventaRequest) {
        return ventaDao.save(ventaRequest);
    }
}
