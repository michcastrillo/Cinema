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
public class clientes {
    public static ArrayList<clientes> comprados = new ArrayList<>();
    public String nombre;
    public String genero;
    public String cedula;
    public int monto;
    public String fecha;
    public String hora;
    public String[] asientossele;

    public clientes(String nombre, String genero, String cedula, int monto, String fecha, String hora, String[] asientossele) {
        this.nombre = nombre;
        this.genero = genero;
        this.cedula = cedula;
        this.monto = monto;
        this.fecha = fecha;
        this.hora = hora;
        this.asientossele = asientossele;
    }

    public static ArrayList<clientes> getComprados() {
        return comprados;
    }

    public static void setComprados(ArrayList<clientes> comprados) {
        clientes.comprados = comprados;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String[] getAsientossele() {
        return asientossele;
    }

    public void setAsientossele(String[] asientossele) {
        this.asientossele = asientossele;
    }
    
    
}
