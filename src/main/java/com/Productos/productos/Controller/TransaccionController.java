package com.Productos.productos.Controller;

import com.Productos.productos.Models.Transacciones;
import com.Productos.productos.Repository.TransaccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transacciones")
public class TransaccionController {

    @Autowired
    private TransaccionRepository transaccionRepository;

    @GetMapping
    public List<Transacciones> obtenerTodasLasTransacciones() {
        return transaccionRepository.findAll();
    }

    @GetMapping("/{id}")
    public Transacciones obtenerTransaccionPorId(@PathVariable Long id) {
        return transaccionRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Transacciones crearTransaccion(@RequestBody Transacciones transaccion) {
        return transaccionRepository.save(transaccion);
    }

    @PutMapping("/{id}")
    public Transacciones actualizarTransaccion(@PathVariable Long id, @RequestBody Transacciones transaccionActualizada) {
        Transacciones transaccion = transaccionRepository.findById(id).orElse(null);
        if (transaccion != null) {
            transaccion.setTipo(transaccionActualizada.getTipo());
            transaccion.setCuentaOrigen(transaccionActualizada.getCuentaOrigen());
            transaccion.setCuentaDestino(transaccionActualizada.getCuentaDestino());
            transaccion.setMonto(transaccionActualizada.getMonto());
            return transaccionRepository.save(transaccion);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void eliminarTransaccion(@PathVariable Long id) {
        transaccionRepository.deleteById(id);
    }

}
