package co.com.repuestos.ps.services;

import co.com.repuestos.ps.modelo.Usuario;
import co.com.repuestos.ps.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServices implements IUsuarioServices {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario consultar(Long id) throws Exception {

        if (id < 0){
            throw new Exception("El numero ID no puede ser menor a 0");
        }
        if (id == null){
            throw new Exception("No envio el numero esperado");

        }

        Optional<Usuario> usuarioOpt = usuarioRepository.findById(id);

        if (!usuarioOpt.isPresent()){
            throw new Exception("No se encontro el Usuario");
        }

        return usuarioOpt.get();
    }

    public Usuario guardar(Usuario usuario) throws Exception{
        if(usuario.getNombre()== null || usuario.getNombre().equals("")){
            throw new Exception("El nombre no debe estar vacio");
        }
        if(usuario.getApellido()== null || usuario.getApellido().equals("")){
            throw new Exception("El apellido no debe estar vacio");
        }
        if(usuario.getContrasena()== null || usuario.getContrasena().equals("")){
            throw new Exception("La contraseña no debe estar vacia");
        }
        return new Usuario();
    }

    @Override
    public Usuario actualizar(Usuario persona) throws Exception {
        return null;
    }

    @Override
    public Usuario borrar(Long id) throws Exception {
        return null;
    }

    @Override
    public List<Usuario> buscarTodos() throws Exception {
        return null;
    }
}
