package com.fabian.backend.shophouse.tipoidentificacion;

import com.fabian.backend.shophouse.tipoidentificacion.database.dao.TipoIdentificacionDao;
import com.fabian.backend.shophouse.tipoidentificacion.database.model.TipoIdentificacion;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tipoidentificacion")
@RequiredArgsConstructor
public class TipoIdentificaionController {

    @Autowired
    private TipoIdentificacionDao tipoIdentificacionDao;


    @GetMapping("")
    public List<TipoIdentificacion> getTiposIdentificacion() {
        return tipoIdentificacionDao.getTiposIdentificacion();
    }

    @GetMapping("/{id}")
    public TipoIdentificacion getTipoIdentificacion(@PathVariable("id") Integer id)
    {
        return tipoIdentificacionDao.getTipoIdentificacion(id);
    }
}
