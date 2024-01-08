/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.ArrayList;

/**
 *
 * @author Michelle
 */
public class personas {
    private String cedula;
    private String nombre;
    private String genero;
    public static ArrayList<personas> listapersonas = new ArrayList<>();
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public static ArrayList<personas> getListapersonas() {
        return listapersonas;
    }

    public static void setListapersonas(ArrayList<personas> listapersonas) {
        personas.listapersonas = listapersonas;
    }


    public personas(String cedula, String nombre, String genero) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.genero = genero;
    }
}
