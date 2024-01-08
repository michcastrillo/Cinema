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
public class Matriz {
    public static ArrayList<Matriz> intento = new ArrayList<>();
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;

    public Matriz(String A, String B, String C, String D, String E, String F, String G, String H, String I) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.E = E;
        this.F = F;
        this.G = G;
        this.H = H;
        this.I = I;
    }

    public static ArrayList<Matriz> getIntento() {
        return intento;
    }

    public static void setIntento(ArrayList<Matriz> intento) {
        Matriz.intento = intento;
    }

    public String getA() {
        return A;
    }

    public void setA(String A) {
        this.A = A;
    }

    public String getB() {
        return B;
    }

    public void setB(String B) {
        this.B = B;
    }

    public String getC() {
        return C;
    }

    public void setC(String C) {
        this.C = C;
    }

    public String getD() {
        return D;
    }

    public void setD(String D) {
        this.D = D;
    }

    public String getE() {
        return E;
    }

    public void setE(String E) {
        this.E = E;
    }

    public String getF() {
        return F;
    }

    public void setF(String F) {
        this.F = F;
    }

    public String getG() {
        return G;
    }

    public void setG(String G) {
        this.G = G;
    }

    public String getH() {
        return H;
    }

    public void setH(String H) {
        this.H = H;
    }

    public String getI() {
        return I;
    }

    public void setI(String I) {
        this.I = I;
    }
}
