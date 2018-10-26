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
public class File {
    private EnumColor state;
    private String symptom;
    private int number;

    public File(EnumColor state, String padecimiento, int numero) {
        this.state = state;
        this.symptom = padecimiento;
        this.number = numero;
    }

    public EnumColor getState() {
        return state;
    }

    public void setState(EnumColor state) {
        this.state = state;
    }

    
    

    public String getPadecimiento() {
        return symptom;
    }

    public void setPadecimiento(String padecimiento) {
        this.symptom = padecimiento;
    }

    public int getNumero() {
        return number;
    }

    public void setNumero(int numero) {
        this.number = numero;
    }
    
    
    
}
