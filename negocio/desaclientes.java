/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import objetos.*;
import datos.*;

/**
 *
 * @author Michelle
 */
public class desaclientes {
    public void ModificarClientes(String cedula, String nombre,String genero) {
        for (int i = 0; i < clientes.comprados.size(); i++) {
            if (cedula.equals(clientes.comprados.get(i).getCedula())) {
                    if (!nombre.equals("")) {
                        clientes.comprados.get(i).setNombre(nombre);
                    }
                    clientes.comprados.get(i).setGenero(genero);     
            }
        }
        guardarClientes();
    }
    public void guardarClientes() {
        limpiarArchivo();
        archivoclientes guardar = new archivoclientes();
        String datos = "";
        for(int p=0;p<clientes.comprados.size();p++){
            String cedulaA = clientes.comprados.get(p).getCedula();
            int precio = clientes.comprados.get(p).getMonto();
            String nprecio = Integer.toString(precio);
            String today = clientes.comprados.get(p).getFecha();
            String hour = clientes.comprados.get(p).getHora();
            String silla = Arrays.toString(clientes.comprados.get(p).getAsientossele());
            datos = cedulaA + "," + silla + "," + nprecio + ","+ today + ","+hour;
            guardar.InsertarEnArchivo(datos);
        }
        
    }
    public void limpiarArchivo() {
        try {
            File archivo = new File("Lista clientes.txt");
            archivo.delete();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el archivo",
                    "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
    }
    desapersonas  desa = new desapersonas();
    public void recibircedula(String cedula){
        boolean compro = desa.comprobarcedula(cedula);
        boolean confi = comprobartodas(cedula);
        if(compro==false){
            if(confi==true){
              comprobarcedula(cedula);  
            }else{
                JOptionPane.showMessageDialog(null, "Usted ya ha hecho una compra", "Mensaje de error",
                   JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Usted no se encuentra registrado", "Mensaje de error",
                   JOptionPane.ERROR_MESSAGE);
        } 
    }
    String n= "";String g= "";String c="";
    public void comprobarcedula(String cedula){
        
        for (int i = 0; i < personas.listapersonas.size(); i++) {
            if (cedula.equals(personas.listapersonas.get(i).getCedula())) {
                n= personas.listapersonas.get(i).getNombre();
                g= personas.listapersonas.get(i).getGenero();
                c= personas.listapersonas.get(i).getCedula();
            }
        }
        recibirasiento(cedula);
    }
    public boolean comprobartodas(String cedula){
        boolean confi = true;
        for(int w=0;w<clasepersonas.listacomcedu.size();w++){
            if(cedula.equals(clasepersonas.listacomcedu.get(w).getCed())){
                confi = false;
            }
        }
        return confi;
    }
    String str[];
    int monto=0;
    public void recibirasiento(String cedula){
        ArrayList<String> asiento = new ArrayList<>();
        String ccomas = JOptionPane.showInputDialog("Indique codigos de asiento separados por coma(max 5 reservas)");
        if(ccomas != null){
            if(!ccomas.equals("")){
                String[]separar = ccomas.split(",");
                int cuanto= separar.length;
                if(cuanto<=5){
                    for (int i = 0; i < Matriz.intento.size(); i++) {
                        int suma =0;
                        for(int j=0;j<cuanto;j++){
                            int uno=0;int dos=0;int tres=0;int cuatro=0;int cinco=0;int seis=0;int siete=0;int ocho=0;int nueve=0;
                            if (separar[suma].equals(Matriz.intento.get(i).getA())) {
                                String a = Matriz.intento.get(i).getA();
                                if(a!="X"){
                                    asiento.add(a);
                                    claseAsientos.listareservados.add(new claseAsientos(a));
                                    Matriz.intento.get(i).setA("X");
                                    if(i==4||i==5||i==6||i==7){
                                        uno =5000;
                                    }else if(i==1||i==2||i==3||i==0){
                                        uno = 3000;
                                    }
                                }
                            }
                            else if (separar[suma].equals(Matriz.intento.get(i).getB())) {
                                String a = Matriz.intento.get(i).getB();
                                if(a!="X"){
                                    asiento.add(a);
                                    claseAsientos.listareservados.add(new claseAsientos(a));
                                    Matriz.intento.get(i).setB("X");
                                    if(i==4||i==5||i==6||i==7){
                                        dos= 5000;
                                    }else if(i==1||i==2||i==3||i==0){
                                        dos= 3000;
                                    }
                                }
                            }
                            else if (separar[suma].equals(Matriz.intento.get(i).getC())) {
                                String a = Matriz.intento.get(i).getC();
                                if(a!="X"){
                                    asiento.add(a);
                                    claseAsientos.listareservados.add(new claseAsientos(a));
                                    Matriz.intento.get(i).setC("X");
                                    if(i==4||i==5||i==6||i==7){
                                        tres= 5000;
                                    }else if(i==1||i==2||i==3||i==0){
                                        tres= 3000;
                                    }
                                }
                            }
                            else if (separar[suma].equals(Matriz.intento.get(i).getD())) {
                                String a = Matriz.intento.get(i).getD();
                                if(a!="X"){
                                    asiento.add(a);
                                    claseAsientos.listareservados.add(new claseAsientos(a));
                                    Matriz.intento.get(i).setD("X");
                                    if(i==4||i==5||i==6||i==7){
                                        cuatro= 5000;
                                    }else if(i==1||i==2||i==3||i==0){
                                        cuatro = 3000;
                                    }
                                }
                            }
                            else if (separar[suma].equals(Matriz.intento.get(i).getE())) {
                                String a = Matriz.intento.get(i).getE();
                                if(a!="X"){
                                    asiento.add(a);
                                    claseAsientos.listareservados.add(new claseAsientos(a));
                                    Matriz.intento.get(i).setE("X");
                                    if(i==4||i==5||i==6||i==7){
                                        cinco = 5000;
                                    }else if(i==1||i==2||i==3||i==0){
                                        cinco = 3000;
                                    }
                                }
                            }
                            else if (separar[suma].equals(Matriz.intento.get(i).getF())) {
                                String a = Matriz.intento.get(i).getF();
                                if(a!="X"){
                                    asiento.add(a);
                                    claseAsientos.listareservados.add(new claseAsientos(a));
                                    Matriz.intento.get(i).setF("X");
                                    if(i==4||i==5||i==6||i==7){
                                        seis=5000;
                                    }else if(i==1||i==2||i==3||i==0){
                                        seis=3000;
                                    }
                                }
                            }
                            else if (separar[suma].equals(Matriz.intento.get(i).getG())) {
                                String a = Matriz.intento.get(i).getG();
                                if(a!="X"){
                                    asiento.add(a);
                                    claseAsientos.listareservados.add(new claseAsientos(a));
                                    Matriz.intento.get(i).setG("X");
                                    if(i==4||i==5||i==6||i==7){
                                        siete= 5000;
                                    }else if(i==1||i==2||i==3||i==0){
                                        siete=3000;
                                    }
                                }
                            }
                            else if (separar[suma].equals(Matriz.intento.get(i).getH())) {
                                String a = Matriz.intento.get(i).getH();
                                if(a!="X"){
                                    asiento.add(a);
                                    claseAsientos.listareservados.add(new claseAsientos(a));
                                    Matriz.intento.get(i).setH("X");
                                    if(i==4||i==5||i==6||i==7){
                                        ocho=5000;
                                    }else if(i==1||i==2||i==3||i==0){
                                        ocho=3000;
                                    }
                                }
                            }
                            else if (separar[suma].equals(Matriz.intento.get(i).getI())) {
                                String a = Matriz.intento.get(i).getI();
                                if(a!="X"){
                                    asiento.add(a);
                                    claseAsientos.listareservados.add(new claseAsientos(a));
                                    Matriz.intento.get(i).setI("X");
                                    if(i==4||i==5||i==6||i==7){
                                        nueve= 5000;
                                    }else if(i==1||i==2||i==3||i==0){
                                        nueve= 3000;
                                    }
                                }
                            }
                            monto= monto+uno+dos+tres+cuatro+cinco+seis+siete+ocho+nueve;
                            suma = suma+1;
                        }  
                    }
                    int sixe = asiento.size();
                    if(sixe>=1){
                        str = asiento.toArray(new String[0]);
                        clasepersonas.listacomcedu.add(new clasepersonas(cedula));
                        crearobjeto();
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "No ha ingresado datos correctos", "Mensaje de error",
                            JOptionPane.ERROR_MESSAGE);
                    }       
                }else{
                    JOptionPane.showMessageDialog(null, "No se permiten más de 5 campos", "Mensaje de error",
                        JOptionPane.ERROR_MESSAGE);
                }    
            }else{
                JOptionPane.showMessageDialog(null, "Campo vacio", "Mensaje de error",
                   JOptionPane.ERROR_MESSAGE);
            }        
        }else{
            JOptionPane.showMessageDialog(null, "Se ha cancelado", "Mensaje de error",
                JOptionPane.ERROR_MESSAGE);
        }            
            
        
    }
    public void crearobjeto(){
        String fecha = LocalDate.now() + " "; 
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("HH:mm");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread hilo = new Thread(runnable);
        hilo.start();
        String HoraActual = formateador.format(LocalDateTime.now());
        clientes.comprados.add(new clientes(n,g,c,monto,fecha,HoraActual,str));
        JOptionPane.showMessageDialog(null, "Compra realizada con exito, su monto es: "+monto);
        monto = 0;
        guardarClientes();
    }
}
