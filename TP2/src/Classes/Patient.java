/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Time;

/**
 *
 * @author Mata
 */
public class Patient implements Comparable<Patient>{
    private String name;
    private String fechaNacimiento;
    private File file;
    private String detail;
    private Time time;

    public Patient(String nombre, String fechaNacimiento, File ficha, String detalle) {
        this.name = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.file = ficha;
        this.detail = detalle;
    }

    public Patient(String nombre, String fechaNacimiento, File ficha, String detalle, Time tiempo) {
        this.name = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.file = ficha;
        this.detail = detalle;
        this.time = tiempo;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String nombre) {
        this.name = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public File getFicha() {
        return file;
    }

    public void setFicha(File ficha) {
        this.file = ficha;
    }

    public String getDetalle() {
        return detail;
    }

    public void setDetalle(String detalle) {
        this.detail = detalle;
    }

    public Time getTiempo() {
        return time;
    }

    public void setTiempo(Time tiempo) {
        this.time = tiempo;
    }

    @Override
    public String toString() {
        return "Patient{" + "name=" + name + ", fechaNacimiento=" + fechaNacimiento + ", file=" + file + ", detail=" + detail + ", time=" + time + '}';
    }
    
	@Override
	public int compareTo(Patient element) {
		if (this.getFicha().getState().getPriority()<element.getFicha().getState().getPriority()) {
			return -1;
		} else if (this.getFicha().getState().getPriority()==element.getFicha().getState().getPriority()) {
			return 0;
		} else {
			return 1;
		}
	}   
    
    
}
