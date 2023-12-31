package com.fabian.backend.shophouse.producto;

import com.fabian.backend.shophouse.producto.database.dao.ProductDao;
import com.fabian.backend.shophouse.producto.database.modelo.Producto;
import com.fabian.backend.shophouse.util.AppConstants;
import lombok.RequiredArgsConstructor;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/producto")
@RequiredArgsConstructor
public class ProductoController {
    private String FILE_PATH = AppConstants.ROOT_FOLDER + File.separator + "producto";

    @Autowired
    private ProductDao productDao;


    @GetMapping("")
    public List<Producto> buscarTodos() {
        return productDao.buscarTodos();
    }

    @GetMapping("/{nombre}")
    public List<Producto> buscarPorNombre(@PathVariable String nombre) {
        return productDao.buscarPorNombre(nombre);
    }

    @GetMapping("/categoria/{categoriaId}")
    public List<Producto> buscarPorCategoria(@PathVariable Integer categoriaId) {
        return productDao.buscarPorCategoria(categoriaId);
    }

    @GetMapping("/categoria/{categoriaId}/{nombre}")
    public List<Producto> buscarPorCategoriaYNombre(@PathVariable Integer categoriaId, @PathVariable String nombre) {
        return productDao.buscarPorCategoriaYNombre(categoriaId, nombre);
    }

    @GetMapping("/imagen/{filename}")
    public ResponseEntity<byte[]> getImage(@PathVariable("filename") String filename) {
        byte[] image = new byte[0];
        try {
            image = FileUtils.readFileToByteArray(new File(FILE_PATH + File.separator + filename));
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(image);
    }
}
