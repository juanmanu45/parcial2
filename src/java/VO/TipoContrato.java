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
public class TipoContrato {
    
    private int id;
    private int cc_emple;
    private int cesantias;
    private int sueldoBase;
    private int auxTrasporte;
    private int interesCesantias;
    private int vacaciones;
    private int salud;
    private int pension;
    private int sena;
    private int ICBF;
    private int cajaComp;
    private int salario;

    public TipoContrato(int id, int cc_emple, int cesantias, int sueldoBase, int auxTrasporte, int interesCesantias, int vacaciones, int salud, int pension, int sena, int ICBF, int cajaComp, int salario) {
        this.id = id;
        this.cc_emple = cc_emple;
        this.cesantias = cesantias;
        this.sueldoBase = sueldoBase;
        this.auxTrasporte = auxTrasporte;
        this.interesCesantias = interesCesantias;
        this.vacaciones = vacaciones;
        this.salud = salud;
        this.pension = pension;
        this.sena = sena;
        this.ICBF = ICBF;
        this.cajaComp = cajaComp;
        this.salario= salario;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCc_emple() {
        return cc_emple;
    }

    public void setCc_emple(int cc_emple) {
        this.cc_emple = cc_emple;
    }

    public int getCesantias() {
        return cesantias;
    }

    public void setCesantias(int cesantias) {
        this.cesantias = cesantias;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getAuxTrasporte() {
        return auxTrasporte;
    }

    public void setAuxTrasporte(int auxTrasporte) {
        this.auxTrasporte = auxTrasporte;
    }

    public int getInteresCesantias() {
        return interesCesantias;
    }

    public void setInteresCesantias(int interesCesantias) {
        this.interesCesantias = interesCesantias;
    }

    public int getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(int vacaciones) {
        this.vacaciones = vacaciones;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getPension() {
        return pension;
    }

    public void setPension(int pension) {
        this.pension = pension;
    }

    public int getSena() {
        return sena;
    }

    public void setSena(int sena) {
        this.sena = sena;
    }

    public int getICBF() {
        return ICBF;
    }

    public void setICBF(int ICBF) {
        this.ICBF = ICBF;
    }

    public int getCajaComp() {
        return cajaComp;
    }

    public void setCajaComp(int cajaComp) {
        this.cajaComp = cajaComp;
    }
    
    
}
