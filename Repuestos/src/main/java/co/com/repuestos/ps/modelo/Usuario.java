package co.com.repuestos.ps.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Table
@Entity
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Usuario {
    public Usuario() {

    }
    @Id
    @Column(name = "ID", nullable = false)
    private int id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "apellido", nullable = false)
    private String apellido;
    @Column(name = "email", nullable = true)
    private String email;
    @Column(name = "contrasena", nullable = false)
    private String contrasena;
    @Column(name = "color", nullable = true)
    private Date fechaRegistro;


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
