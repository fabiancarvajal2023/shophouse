package com.fabian.backend.shophouse.promocion;

import com.fabian.backend.shophouse.promocion.database.dao.PromocionDao;
import com.fabian.backend.shophouse.promocion.database.modelo.Promocion;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/promocion")
@RequiredArgsConstructor
public class PromocionController {

    @Autowired
    private PromocionDao promocionDao;

    @GetMapping("")
    public List<Promocion> getTodos() {
        return promocionDao.getTodos();
    }
}
