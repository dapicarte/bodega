package BookPoint.Bodega.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import BookPoint.Bodega.service.BodegaService;

@RestController
@RequestMapping("api/v1/bodega")
public class BodegaController {
    @Autowired
    private BodegaService bodegaService;
    
}
