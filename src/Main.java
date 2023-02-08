import uaslp.objetos.list.LinkedList;
import uaslp.objetos.list.LinkedListIterator;
//import uaslp.objetos.list.Node;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
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
    }
}