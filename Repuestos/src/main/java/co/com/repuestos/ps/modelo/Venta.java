package co.com.repuestos.ps.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Table
@Entity
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Venta {

}
