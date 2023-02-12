import uaslp.objetos.list.linkedlist.Node;
import uaslp.objetos.list.linkedlist.LinkedList;
import uaslp.objetos.list.linkedlist.LinkedListIterator;
import uaslp.objetos.list.arraylist.ArrayList;
import uaslp.objetos.list.arraylist.ArrayListIterator;
public class Main {
    public static void main(String[] args) {
        ArrayList lista= new ArrayList();
        lista.addAtTail("hola");//F8 debugeo
        lista.addAtTail("adios");//stack trace indica en que linea es posiblemente el error
        lista.addAtTail("adios2");
        lista.addAtTail("Kagabonga");
        lista.addAtTail("Yo ser tu padre");
        System.out.println(lista.getSize());
        for(int i=0;i< lista.getSize();i++){
            System.out.println(lista.getAt(i));
        }
        System.out.println("-------------------");
        lista.setAt(2,"no se que hago");
        for(int i=0;i< lista.getSize();i++){
            System.out.println(lista.getAt(i));
        }
        System.out.println("-------------------");

        lista.remove(4);
        for(int i=0;i< lista.getSize();i++){
            System.out.println(lista.getAt(i));
        }
        System.out.println("-------------------");
        lista.removeAllWithValue("adios");
        for(int i=0;i< lista.getSize();i++){
            System.out.println(lista.getAt(i));
        }
        System.out.println("-------------------");
        lista.addAtFront("Minion");
        for(int i=0;i< lista.getSize();i++){
            System.out.println(lista.getAt(i));
        }
        System.out.println("-------------------");
        lista.removeAll();
        for(int i=0;i< lista.getSize();i++){
            System.out.println(lista.getAt(i));
        }
       /* LinkedList linkedList=new LinkedList();
        System.out.println(linkedList.getSize());
        LinkedListIterator iterator = linkedList.getIterator();
        while(iterator.hasNext()){
            String data = iterator.next();
        }
        linkedList.addAtFront("15");
        linkedList.addAtTail("23");
        linkedList.addAtTail("21");
        linkedList.addAtFront("13");
        linkedList.addAtTail("16");
        linkedList.addAtTail("56");
        linkedList.addAtFront("18");
        System.out.println(linkedList.getSize());
        System.out.println("------------");
        for(int i=0;i< linkedList.getSize();i++){
            System.out.println(i+"  "+linkedList.getAt(i));
        }
        System.out.println("------------");
        linkedList.remove(0);
        for(int i=0;i< linkedList.getSize();i++){
            System.out.println(i+"  "+linkedList.getAt(i));
        }
        System.out.println("------------");
        linkedList.setAt(5,"45");
        for(int i=0;i< linkedList.getSize();i++){
            System.out.println(i+"  "+linkedList.getAt(i));
        }
        System.out.println("------------");
        System.out.println(linkedList.getAt(2));
        System.out.println("------------");
        linkedList.removeAllWithValue("18");
        for(int i=0;i< linkedList.getSize();i++){
            System.out.println(i+"  "+linkedList.getAt(i));
        }
        System.out.println("------------");
        System.out.println(linkedList.getSize());
        System.out.println("------------");
        System.out.println(linkedList.getIterator());
        System.out.println("------------");
        linkedList.removeAll();
        for(int i=0;i< linkedList.getSize();i++){
            System.out.println(i+"  "+linkedList.getAt(i));
        }
        System.out.println("------------");

        */

    }
}