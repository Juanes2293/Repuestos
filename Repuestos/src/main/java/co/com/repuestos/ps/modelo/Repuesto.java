package co.com.repuestos.ps.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Table
@Entity
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Repuesto {

    public Repuesto(){

    }

    //Numeros no Decimales int, long
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "color", nullable = false)
    private int color;

    //Campos alfanumericos
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "marca", nullable = true)
    private String marca;
    @Column(name = "modelo", nullable = true)
    private String modelo;

    //Campos decimales double, float, bigDecimal: Se usa para operacion financiera:
    @Column(name = "precio", nullable = false)
    private double precio;

    //Fechas con date
    @Column(name = "fechainventario", nullable = true)
    private Date fechaInventario;
    @Column(name = "venceelproducto", nullable = true)
    private boolean venceElProducto;

}
