/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

/**
 *
 * @author LabingXEON
 */
public class Empleado {
    private int cc;
    private String nombre;
    private String lugar_nacimiento;


    public Empleado(int cc, String nombre, String lugar_nacimiento) {
        this.cc = cc;
        this.nombre = nombre;
        this.lugar_nacimiento = lugar_nacimiento;
        
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    
    
    
}
