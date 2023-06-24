package com.Productos.productos.Models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;
    @Column(name = "identificacion", length = 100, nullable = false)
    private String identificacion;
    @Column(name = "email", length = 100, nullable = false)
    private String email;
    @Column(name = "clave", length = 100, nullable = false)
    private String clave;
    @Column(name = "numeroCuenta", length = 10, nullable = false)
    private String numeroCuenta;
}
