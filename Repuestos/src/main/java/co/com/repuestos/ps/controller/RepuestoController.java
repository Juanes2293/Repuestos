package co.com.repuestos.ps.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class RepuestoController {

    @GetMapping
    public String getRepuesto(@pathVariable ("id") int id){
        return null;
    }

    @PostMapping
    public String saveRepuesto(){
        return null;
    }

    @PutMapping
    public String updateRepuesto(){
        return null;
    }

    @DeleteMapping
    public String deleteRepuesto(){
        return null;
    }
}
