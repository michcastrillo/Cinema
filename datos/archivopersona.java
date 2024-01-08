/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import objetos.*;
/**
 *
 * @author Michelle
 */
public class archivopersona {
    public void InsertarEnArchivo(String datosUsuario) {
        try {
            File archivo = new File("Lista personas.txt");
            BufferedWriter archi = new BufferedWriter(new FileWriter(archivo, true));
            archi.write(datosUsuario + "\r\n");
            archi.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo",
                    "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public ArrayList<personas> LeerDesdeArchivoObjeto() {
        try {
            File archivo = new File("Lista personas.txt");
            BufferedReader archi = new BufferedReader(new FileReader(archivo));
            while (archi.ready()) {
                String[] separar = new String[3];
                separar = archi.readLine().split(",");
                personas.listapersonas.add(new personas(separar[0], separar[1], separar[2]));
            }
            archi.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer del arhivo", "Mensaje de error",
                    JOptionPane.ERROR_MESSAGE);
        }
        return personas.listapersonas;
    }
   
}
