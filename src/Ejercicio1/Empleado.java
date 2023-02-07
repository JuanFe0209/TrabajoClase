package Ejercicio1;

import java.util.Date;

public class Empleado {



    private static String nombreEmpleado;
    private String apellidoEmpleado;
    private String generoEmpleado;
    private Date fechaNacimiento;
    private Date fechaIngreso;
    private double salario;

    public static void setnombreEmpleado(String juan) {
    }

    public static void setapellidoEmpleado(String rojas) {
    }

    public static void setgeneroEmpleado(String masculino) {
    }

    public String InformaciónEmpleado(){
        return "La información del empleado es la siguiente:" + " " + "Nombre Completo:" + nombreEmpleado + " " + apellidoEmpleado + " " + "Genero:" + " " + generoEmpleado + " " + "Fecha de nacimiento:" + " "+ fechaNacimiento + " " + "Fecha de ingreso a la empresa:" + " " + fechaIngreso;
    }
    public double Prestaciones(){
        return ;
    }



    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
       this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;

    }
    public String getGeneroEmpleado() {
        return generoEmpleado;
    }

    public void setGeneroEmpleado(String generoEmpleado) {
        this.generoEmpleado = generoEmpleado;
    }
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

}
