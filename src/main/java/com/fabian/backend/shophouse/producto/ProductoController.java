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


    @GetMapping("/{page}/{limit}")
    public List<Producto> buscarTodos(@PathVariable int page, @PathVariable int limit) {
        return productDao.buscarTodos(page, limit);
    }

    @GetMapping("/{nombre}/{page}/{limit}")
    public List<Producto> buscarPorNombre(@PathVariable String nombre, @PathVariable int page, @PathVariable int limit) {
        return productDao.buscarPorNombre(nombre, page, limit);
    }

    @GetMapping("/categoria/{categoriaId}/{page}/{limit}")
    public List<Producto> buscarPorCategoria(@PathVariable Integer categoriaId, @PathVariable int page, @PathVariable int limit) {
        return productDao.buscarPorCategoria(categoriaId, page, limit);
    }

    @GetMapping("/categoria/{categoriaId}/{nombre}/{page}/{limit}")
    public List<Producto> buscarPorCategoriaYNombre(@PathVariable Integer categoriaId, @PathVariable String nombre, @PathVariable int page, @PathVariable int limit) {
        return productDao.buscarPorCategoriaYNombre(categoriaId, nombre, page, limit);
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
