package com.myexample.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myexample.demo.models.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
