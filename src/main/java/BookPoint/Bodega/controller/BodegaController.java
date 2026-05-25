package BookPoint.Bodega.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import BookPoint.Bodega.model.Bodega;
import BookPoint.Bodega.model.BodegaDTO;
import BookPoint.Bodega.service.BodegaService;

@RestController
@RequestMapping("api/v1/bodega")
public class BodegaController {
    @Autowired
    private BodegaService bodegaService;
    
    @PostMapping
    public Bodega crearBodega(@RequestBody Bodega bodega) {
        return bodegaService.crearBodega(bodega);
    }

    @GetMapping
    public List<Bodega> listarBodegas() {
        return bodegaService.listarBodegas();
    }

    @GetMapping("/{id}/detalle")
    public BodegaDTO obtenerDetalle(@PathVariable Long id) {
        return bodegaService.obtenerBodegaDTO(id);
    }
}
