// Copyright (c) Andrea Salazar Abigail Cárdenas, Alec Demian Santana Celaya, 
// Carlos Ariel Angulo Campos, Josue Emamnuel Flores Carballo, 
// Jesus Alejandro Izaguirre Gil. Licensed under the MIT Licence.
// See the LICENSE file in the repository root for full license text.
package implementaciones;

import com.itson.dominio.Regimen;
import com.itson.dominio.RegimenEstado;
import com.itson.dominio.Usuario;
import interfaces.IConexionBD;
import interfaces.IPersistencia;
import interfaces.IRegimenDAO;
import interfaces.IRegimenEstadoDAO;
import interfaces.IUsuariosDAO;
import java.util.List;


public class Persistencia implements IPersistencia{

    private IRegimenDAO regimenDAO;
    private IRegimenEstadoDAO regimenEstadoDAO;
    private IUsuariosDAO usuariosDAO;

    public Persistencia() {
        IConexionBD conexion = new ConexionBD();
        regimenDAO = new RegimenDAO();
        regimenEstadoDAO = new RegimenEstadoDAO(conexion);
        usuariosDAO = new UsuariosDAO(conexion);
    }
    
    
    @Override
    public void guardarRegimen(Regimen regimen) throws Exception {
        regimenDAO.guardar(regimen);
    }

    @Override
    public Regimen consultarRegimen() throws Exception {
        return regimenDAO.consultar();
    }

    @Override
    public void agregarRegimenEstado(RegimenEstado regimenEstado) throws Exception {
        regimenEstadoDAO.agregar(regimenEstado);
    }

    @Override
    public void actualizarRegimenEstado(RegimenEstado regimenEstado) throws Exception {
        regimenEstadoDAO.actualizar(regimenEstado);
    }

    @Override
    public RegimenEstado consultarRegimenEstado(Integer idRegimenEstado) throws Exception {
        return regimenEstadoDAO.consultar(idRegimenEstado);
    }

    @Override
    public void eliminarRegimenEstado(Integer idRegimenEstado) throws Exception {
        regimenEstadoDAO.eliminar(idRegimenEstado);
    }

    @Override
    public RegimenEstado consultarRegimenEstadoPorEntrenador(Integer idEntrenador) throws Exception {
        return regimenEstadoDAO.consultarPorEntrenador(idEntrenador);
    }

    @Override
    public List<RegimenEstado> consultarTodosRegimenEstado() throws Exception {
        return regimenEstadoDAO.consultarTodos();
    }

    @Override
    public void agregarUsuario(Usuario usuario) throws Exception {
        usuariosDAO.agregar(usuario);
    }

    @Override
    public void eliminarUsuario(Integer idUsuario) throws Exception {
        usuariosDAO.eliminar(idUsuario);
    }

    @Override
    public void actualizarUsuario(Usuario usuario) throws Exception {
        usuariosDAO.actualizar(usuario);
    }

    @Override
    public Usuario consultarUsuario(Integer idUsuario) throws Exception {
        return usuariosDAO.consultar(idUsuario);
    }

    @Override
    public Usuario consultarUsuario(String nombre) throws Exception {
        return usuariosDAO.consultar(nombre);
    }

    @Override
    public List<Usuario> consultarTodosUsuarios() throws Exception {
        return usuariosDAO.consultarTodos();
    }

    @Override
    public List<Usuario> consultarEntrenadores() throws Exception {
        return usuariosDAO.consultarEntrenadores();
    }
     @Override
    public void actualizarRegimen(Regimen regimen) throws Exception {
        regimenDAO.actualizar(regimen);
    }
}
