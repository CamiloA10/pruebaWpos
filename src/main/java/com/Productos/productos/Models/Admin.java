package com.Productos.productos.Models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Admin {
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
}
