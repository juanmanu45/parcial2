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
public class Relacion_laboral {
    
   private int cedula_emple;
   private int id_rela;
   private String estatus;
   private String fecha_ingre;
   private String depto;
   private String puesto;
   private String turno;
   private String tipo_sueldo;
   private String tipo_regimen;

    public Relacion_laboral(int cedula_emple, int id_rela, String estatus, String fecha_ingre, String depto, String puesto, String turno, String tipo_sueldo, String tipo_regimen) {
        this.cedula_emple = cedula_emple;
        this.id_rela = id_rela;
        this.estatus = estatus;
        this.fecha_ingre = fecha_ingre;
        this.depto = depto;
        this.puesto = puesto;
        this.turno = turno;
        this.tipo_sueldo = tipo_sueldo;
        this.tipo_regimen = tipo_regimen;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getTipo_sueldo() {
        return tipo_sueldo;
    }

    public void setTipo_sueldo(String tipo_sueldo) {
        this.tipo_sueldo = tipo_sueldo;
    }

    public String getTipo_regimen() {
        return tipo_regimen;
    }

    public void setTipo_regimen(String tipo_regimen) {
        this.tipo_regimen = tipo_regimen;
    }
   
    public int getCedula_emple() {
        return cedula_emple;
    }

    public void setCedula_emple(int cedula_emple) {
        this.cedula_emple = cedula_emple;
    }

    public int getId_rela() {
        return id_rela;
    }

    public void setId_rela(int id_rela) {
        this.id_rela = id_rela;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getFecha_ingre() {
        return fecha_ingre;
    }

    public void setFecha_ingre(String fecha_ingre) {
        this.fecha_ingre = fecha_ingre;
    }
   
   
    
}
