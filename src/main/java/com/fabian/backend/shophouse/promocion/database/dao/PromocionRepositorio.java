package com.fabian.backend.shophouse.promocion.database.dao;

import com.fabian.backend.shophouse.promocion.database.modelo.Promocion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromocionRepositorio extends JpaRepository<Promocion,Integer> {
}