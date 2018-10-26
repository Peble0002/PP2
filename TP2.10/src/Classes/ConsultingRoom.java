/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Mata
 */
public class ConsultingRoom {
    private Patient patient;
    private int id;
    private boolean state;
    private String type;

    public ConsultingRoom(int id, boolean state, String type) {
        this.id = id;
        this.state = state;
        this.type = type;
    }
    
    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    



    public ConsultingRoom(Patient paciente, int id, boolean estado) {
        this.patient = paciente;
        this.id = id;
        this.state = estado;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient paciente) {
        this.patient = paciente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEstado() {
        return state;
    }

    public void setEstado(boolean estado) {
        this.state = estado;
    }
    
    
    
}
