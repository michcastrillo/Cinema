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
public class claseAsientos {
    private String reservados;
    public static ArrayList<claseAsientos> listareservados = new ArrayList<>();

    public String getReservados() {
        return reservados;
    }

    public void setReservados(String reservados) {
        this.reservados = reservados;
    }

    public static ArrayList<claseAsientos> getListareservados() {
        return listareservados;
    }

    public static void setListareservados(ArrayList<claseAsientos> listareservados) {
        claseAsientos.listareservados = listareservados;
    }

    public claseAsientos(String reservados) {
        this.reservados = reservados;
    }
}
