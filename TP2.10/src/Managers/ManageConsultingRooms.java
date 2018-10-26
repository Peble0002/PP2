/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;
import DataStructures.DoubleLinkedList;
import DataStructures.DoubleLinkedNode;
import Classes.ConsultingRoom;
import Classes.Patient;
import DataStructures.BinaryHeap;
/**
 *
 * @author Mata
 */

public class ManageConsultingRooms {
    public DoubleLinkedList<ConsultingRoom> listNum = new DoubleLinkedList<>();
    public BinaryHeap<Patient> heapVector = new BinaryHeap<>();

    public ManageConsultingRooms() {
        this.listNum = new DoubleLinkedList<ConsultingRoom>();
    }
    


    public BinaryHeap<Patient> getHeapVector() {
        return heapVector;
    }
    
    

    public DoubleLinkedList<ConsultingRoom> getListNum() {
        return listNum;
    }

    public void setListNum(DoubleLinkedList<ConsultingRoom> listNum) {
        this.listNum = listNum;
    }
    
    public String attendHeap(int room){
        Patient patient = getHeapVector().extract();
        String atend = "Atendiendo a "+getHeapVector().extract().getNombre()+" Consultorio: "+room;
        attend(room,patient );
        return atend;
    }
    public void insertHeap(Patient patient){
        getHeapVector().create(patient);
    }
    public void insertRed(int x){
        x =x + 2;
        for (int i = 0; i < x; i++) {
            ConsultingRoom room = new ConsultingRoom(i, false,"R");
            
            this.getListNum().insert(room);
        } 
    }
    
    public void insert(int x){
        x =x + 2;
        for (int i = 0; i < x; i++) {
            ConsultingRoom room = new ConsultingRoom(i, false,null);
            
            this.getListNum().insert(room);
        }
    }
    public void showRooms(){
        getListNum().setCurrent(getListNum().getHead().getNext());
        while (getListNum().getCurrent().getNext() != null) {            
            
            System.out.println(getListNum().getCurrent().getElement().getId());
            getListNum().setCurrent(getListNum().getCurrent().getNext());
        }
    }
       
    
    public void attend(int idRoom, Patient patient){
        ConsultingRoom room = returnRoom(idRoom);
        if (room.isEstado()) {
            System.out.println("Esta atendiendo a alguien");
        }else{
            room.setPatient(patient);
            System.out.println("Atendiendo a: "+patient.getNombre()+" Consultorio: "+room.getId());
        }
        
    }
    
    
    public ConsultingRoom returnRoom(int id){
        getListNum().setCurrent(getListNum().getHead().getNext());
  
        
        ConsultingRoom room = null;
        while (getListNum().getCurrent().getNext() != null) {            
            if (getListNum().getCurrent().getElement().getId()==id) {
                room= getListNum().getCurrent().getElement();
                System.out.println(room.getId());
            }
                getListNum().setCurrent(getListNum().getCurrent().getNext());
            
        }
        if (room == null) {
            System.out.println("No se encuentra");
        }
        return room;
      
    }
    
}
