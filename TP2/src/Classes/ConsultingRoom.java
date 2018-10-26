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

    public ConsultingRoom(int id, boolean estado) {
        this.id = id;
        this.state = estado;
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
