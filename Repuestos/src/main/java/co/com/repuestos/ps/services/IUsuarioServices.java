package co.com.repuestos.ps.services;

import co.com.repuestos.ps.modelo.Usuario;
import java.util.List;
public interface IUsuarioServices {
    Usuario guardar(Usuario usuario) throws Exception;
    Usuario consultar(int id) throws Exception;
    Usuario actualizar(Usuario persona) throws Exception;
    Usuario borrar(int id) throws Exception;
    List<Usuario> buscarTodos() throws Exception;
}
