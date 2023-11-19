package com.fabian.backend.shophouse.promocion.database.dao;

import com.fabian.backend.shophouse.promocion.database.modelo.Promocion;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@RequiredArgsConstructor
public class PromocionDaoImpl implements PromocionDao {
    private final PromocionRepositorio promocionRepositorio;
    @Override
    public List<Promocion> getTodos() {
        return promocionRepositorio.findAll();
    }
}
