package BookPoint.Bodega.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import BookPoint.Bodega.model.Bodega;
import BookPoint.Bodega.repository.BodegaRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class BodegaService {
    @Autowired
    private BodegaRepository bodegaRepository;

    public Bodega crear(Bodega bodega) {
        return bodegaRepository.save(bodega);
    }
}
