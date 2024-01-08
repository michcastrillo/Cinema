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
public class clasepersonas {
    private String ced;
    public static ArrayList<clasepersonas> listacomcedu = new ArrayList<>();

    public clasepersonas(String ced) {
        this.ced = ced;
    }

    public String getCed() {
        return ced;
    }

    public void setCed(String ced) {
        this.ced = ced;
    }

    public static ArrayList<clasepersonas> getListacomcedu() {
        return listacomcedu;
    }

    public static void setListacomcedu(ArrayList<clasepersonas> listacomcedu) {
        clasepersonas.listacomcedu = listacomcedu;
    }
    
}
