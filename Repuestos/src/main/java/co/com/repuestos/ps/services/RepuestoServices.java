package co.com.repuestos.ps.services;

import co.com.repuestos.ps.modelo.Repuesto;
import co.com.repuestos.ps.repository.RepuestoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepuestoServices implements IRepuestoServices {

    @Autowired
    RepuestoRepository repuestoRepository;

    public Repuesto consultar(Long id) throws Exception {

        if (id < 0) {
            throw new Exception("El numero ID no puede ser menor a 0");
        }
        if (id == null){
            throw new Exception("No envio el numero esperado");

        }

        return repuestoRepository.findById(id);
    }

    public Repuesto guardar(Repuesto repuesto) throws Exception{
        if (repuesto.getNombre()== null || repuesto.getNombre().equals("")){
            throw new Exception("El nombre no debe estar vacio");
        }

        if (repuesto.getModelo()== null || repuesto.getModelo().equals("")){
            throw new Exception("El modelo no debe estar vacio");
        }

        return new Repuesto();
    }

    @Override
    public Repuesto actualizar (Repuesto persona) throws Exception{
        return null;
    }

    @Override
    public Repuesto borrar (long id) throws Exception{
        return null;
    }

    @Override
    public List<Repuesto> buscarTodos() throws Exception{
        return null;
    }

}
