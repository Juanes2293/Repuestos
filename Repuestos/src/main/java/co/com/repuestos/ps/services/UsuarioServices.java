package co.com.repuestos.ps.services;

import co.com.repuestos.ps.modelo.Usuario;
import co.com.repuestos.ps.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServices implements IUsuarioServices {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario consultar(int id) throws Exception {

        if (id < 0){
            throw new Exception("El numero ID no puede ser menor a 0");
        }
        return UsuarioRepository.findById(id);
    }

    public Usuario guardar(Usuario usuario) throws Exception{
        if(Usuario.getNombre()== null || usuario.getNombre().equals("")){
            throw new Exception("El nombre no debe estar vacio");
        }
        if(Usuario.getApellido()== null || usuario.getApellido().equals("")){
            throw new Exception("El apellido no debe estar vacio");
        }
        if(Usuario.getContrasena()== null || usuario.getContrasena().equals("")){
            throw new Exception("La contraseña no debe estar vacia");
        }
        return new Usuario();
    }

    @Override
    public Usuario actualizar(Usuario persona) throws Exception {
        return null;
    }

    @Override
    public Usuario borrar(int id) throws Exception {
        return null;
    }

    @Override
    public List<Usuario> buscarTodos() throws Exception {
        return null;
    }
}
