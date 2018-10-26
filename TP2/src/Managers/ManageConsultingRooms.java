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
    BinaryHeap<Patient> heapVector = new BinaryHeap<>();
    
    

    public DoubleLinkedList<ConsultingRoom> getListNum() {
        return listNum;
    }

    public void setListNum(DoubleLinkedList<ConsultingRoom> listNum) {
        this.listNum = listNum;
    }
    
    
    public void insert(int x){
        for (int i = 0; i < x; i++) {
            ConsultingRoom room = new ConsultingRoom(i, false);
            this.getListNum().insert(room);
        }
    }
    
    public void attend(int x, Patient patient){
        ConsultingRoom room = returnRoom(x);
        if (room.isEstado()) {
            System.out.println("Esta atendiendo a alguien");
        }else{
            room.setPatient(patient);
            System.out.println("Atendiendo a: "+patient.getNombre()+"Consultorio: "+room.getId());
        }
        
    }
    
    public ConsultingRoom returnRoom(int id){
        getListNum().setCurrent(getListNum().getHead().getNext());
        DoubleLinkedNode<ConsultingRoom> tempNode = getListNum().getHead().getNext();
        
        ConsultingRoom room = null;
        while (tempNode != null) {            
            if (getListNum().getCurrent().getElement().getId()==id) {
                room= getListNum().getCurrent().getElement();
            }else{
                getListNum().setCurrent(getListNum().getCurrent().getNext());
            }
        }
        if (room == null) {
            System.out.println("No se encuentra");
        }
        return room;
      
    }
    
}
