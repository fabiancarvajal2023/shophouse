package com.fabian.backend.shophouse.categoria;

import com.fabian.backend.shophouse.categoria.database.dao.CategoriaDao;
import com.fabian.backend.shophouse.categoria.database.modelo.Categoria;
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
@RequestMapping("/api/v1/categoria")
@RequiredArgsConstructor
public class CategoriaController {
    private String FILE_PATH = AppConstants.ROOT_FOLDER + File.separator + "categoria";
    @Autowired
    private CategoriaDao categoriaDao;


    @GetMapping("")
    public List<Categoria> getCategorias() {
        return categoriaDao.getCategorias();
    }

    @GetMapping("/buscar/{nombre}")
    public List<Categoria> getCategoriaPorNombre(@PathVariable("nombre") String nombre) {
        return categoriaDao.getcategoriaPorNombre(nombre);
    }

    @GetMapping("/imagen/{filename}")
    public ResponseEntity<byte[]> getImage(@PathVariable("filename") String filename) {
        byte[] image = new byte[0];
        try {
            image = FileUtils.readFileToByteArray(new File(FILE_PATH +File.separator+ filename));
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(image);
    }
}
