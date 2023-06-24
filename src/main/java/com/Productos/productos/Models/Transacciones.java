package com.Productos.productos.Models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Transacciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombreUsuario", length = 100, nullable = false)
    private String nombreUsuario;
    @Column(name = "numeroCuenta", length = 100, nullable = false)
    private String numeroCuento;
    @Column(name = "monto", length = 100, nullable = false)
    private double monto;
    @Column(name = "descripcion", length = 100, nullable = false)
    private String descripcion;
    @Column(name = "tipo", length = 100, nullable = false)
    private String tipo;
    @Column(name = "cuentaOrigen", length = 100, nullable = false)
    private String cuentaOrigen;
    @Column(name = "cuentaDestino", length = 100, nullable = false)
    private String cuentaDestino;
}
