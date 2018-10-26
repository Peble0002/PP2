package Main;

import Classes.EnumColor;
import Classes.File;
import Classes.Patient;
import DataStructures.BinaryHeap;
import DataStructures.DoubleLinkedList;
import Managers.ManageConsultingRooms;

public class Main {
	public static void main(String[] args) {
		BinaryHeap<Patient> heapVector = new BinaryHeap<>();
                File ficha1 = new File(EnumColor.YELLOW, "Dolor de Cabeza", 1);
                File ficha2 = new File(EnumColor.GREEN, "Dolor de Cabeza", 2);               
                Patient x = new Patient("Pedro", "1999", ficha2, "Dolor");
                heapVector.create(x);
                Patient x1 = new Patient("Juan Amarillo", "2000", ficha1, "Dolor");
		heapVector.create(x1);
                x.compareTo(x1);
                Patient x2 = new Patient("Juan Verde", "2001", ficha2, "Dolor");
		heapVector.create(x1);                
                
//                heapVector.extract();
////                System.out.println(x.compareTo(x1));
//		System.out.println("\n\nCREATES");
//		System.out.println(heapVector.toString());
////		
//		System.out.println("\n\nEXTRACTED");
//		System.out.println(heapVector.extract().toString());
//		
//		System.out.println("\n\nPRINTED");
//		System.out.println(heapVector.toString());
//                
              ManageConsultingRooms managment =new ManageConsultingRooms();
              managment.insert(6);
              managment.showRooms();
              managment.returnRoom(4);
              managment.attend(2, x2);
              

                
	}
}