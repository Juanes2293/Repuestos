package co.com.repuestos.ps.modelo;

import lombok.Data;

import java.util.Date;
@Data
public class Repuesto {

    public Repuesto(){

    }

    //Numeros no Decimales int, long
   long prueba;
   private long id;
   private int color;

    //Campos alfanumericos
   private String nombre;
   private String marca;
   private String modelo;

    //Campos decimales double, float, bigDecimal: Se usa para operacion financiera:
   private double precio;

    //Fechas con date
   private Date fechaInventario;

   private boolean venceElProducto;



}
