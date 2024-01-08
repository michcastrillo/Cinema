/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import java.io.File;
import objetos.*;
import datos.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


/**
 *
 * @author Michelle
 */
public class desapersonas {
   public void ModificarColab(String cedula, String nombre,String genero) {
        for (int i = 0; i < personas.listapersonas.size(); i++) {
            if (cedula.equals(personas.listapersonas.get(i).getCedula())) {
                    if (!nombre.equals("")) {
                        personas.listapersonas.get(i).setNombre(nombre);
                    }
                    personas.listapersonas.get(i).setGenero(genero);     
            }
        }
        guardarProducto();
    }
    public boolean comprobarcedula(String cedula){
        boolean comprobar = true;
        for (int i = 0; i < personas.listapersonas.size(); i++) {
            if (cedula.equals(personas.listapersonas.get(i).getCedula())){
                comprobar = false;
            }
        }
        return comprobar;
    }
    public boolean comprobarnombre(String nombre){
        boolean comprobar = true;
        for (int i = 0; i < personas.listapersonas.size(); i++) {
            if (nombre.equals("")){
                comprobar = false;
            }
        }
        return comprobar;
    }
    public void guardarProducto() {
        limpiarArchivo();
        archivopersona guardar = new archivopersona();
        String datos = "";
        for (int i = 0; i <= personas.listapersonas.size() - 1; i++) {
            String cedula = personas.listapersonas.get(i).getCedula();
            String nombre = personas.listapersonas.get(i).getNombre();
            String genero = personas.listapersonas.get(i).getGenero();
            datos = cedula + "," + nombre + "," + genero;
            guardar.InsertarEnArchivo(datos);
        }
        
    }

    
    archivopersona archivop = new archivopersona();
    public DefaultComboBoxModel cargarCedulas() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        ArrayList<personas> listaCedulas = archivop.LeerDesdeArchivoObjeto();
        for (personas fila : listaCedulas) {
            model.addElement(fila.getCedula());
        }
        return model;
    }

    //Metodo para eliminar lo que hay en el archivo
    public void limpiarArchivo() {
        try {
            File archivo = new File("Lista personas.txt");
            archivo.delete();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el archivo",
                    "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
    }

            
}
