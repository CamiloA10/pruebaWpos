package com.Productos.productos.Repository;

import com.Productos.productos.Models.Transacciones;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TransaccionRepository extends JpaRepository<Transacciones, Long>{

}
