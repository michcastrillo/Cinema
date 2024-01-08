/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Michelle
 */
public class archivoclientes {
    public void InsertarEnArchivo(String datosUsuario) {
        try {
            File archivo = new File("Lista clientes.txt");
            BufferedWriter archi = new BufferedWriter(new FileWriter(archivo, true));
            archi.write(datosUsuario + "\r\n");
            archi.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo",
                    "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
