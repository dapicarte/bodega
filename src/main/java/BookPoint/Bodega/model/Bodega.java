package BookPoint.Bodega.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bodega")
public class Bodega {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idBodega;

    @Column(nullable = false)
    private String nombreBodega;

    @Column(nullable = false)
    private Integer capacidadMax;
    
    @Column(nullable = false)
    private boolean activa;

    @Column(nullable = true)
    private Long idSucursal;

    @Column(nullable = true)
    private Long idInventario;
}
