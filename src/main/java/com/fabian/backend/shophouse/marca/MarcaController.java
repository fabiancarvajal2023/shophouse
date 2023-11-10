package com.fabian.backend.shophouse.marca;

import com.fabian.backend.shophouse.marca.database.dao.MarcaDao;
import com.fabian.backend.shophouse.marca.database.model.Marca;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/marca")
@RequiredArgsConstructor
public class MarcaController {

    @Autowired
    private MarcaDao marcaDao;

    @GetMapping("")
    public List<Marca> getMarcas() {
        return marcaDao.getMarcas();
    }

    @GetMapping("/buscar/{nombre}")
    public List<Marca> getMarcaPorNombre(@PathVariable("nombre") String nombre) {
        return marcaDao.getMarcaPorNombre(nombre);
    }
}
