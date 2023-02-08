package uaslp.objetos.list;

public class LinkedList {
    private Node head=null;
    private Node tail=null;
    private int size=0;
    public void setAt(int index,String data){
        int i=0;
        Node temp=head;
        while(temp!=null&&i!=index){
            temp=temp.next;
            i++;
        }
        if(temp==null){
            System.out.println("No habia con ese index");
            return;
        }
        if(index==i){
            temp.data=data;
            System.out.println("Escrito data:"+temp.data);
        }
    }
    public void removeAll(){
        Node actual=head;
        while(actual!=null){
            Node nextNode=actual.next;
            actual.previous=null;
            actual.next=null;
            actual.data=null;
            actual=nextNode;
        }
        head=null;
        tail=null;
        size =0;
        System.out.println("Eliminada toda la lista");
    }
    public void removeAllWithValue(String data){
        Node temp=head;
        while(temp!=null&&temp.data.compareTo(data)==0){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("No se encontro algo con ese valor");
            return;
        }

        if(temp.previous!=null){
            temp.previous.next=temp.next;
        }else{
            head=temp.next;
        }
        if(temp.next!=null){
            temp.next.previous=temp.previous;
        }
        size --;
        System.out.println("Eliminado correctamente en base al valor");
    }
    public void remove(int index){
        Node temp=head;
        int i=0;
        while(temp!=null&&i!=index){
            temp=temp.next;
            i++;
        }
        if(temp==null){
            System.out.println("No se encontro");
            return;
        }
        if(temp.previous!=null){
            temp.previous.next=temp.next;
        }else{
            head=temp.next;
        }
        if(temp.next!=null){
            temp.next.previous=temp.previous;
        }
        System.out.println("Eliminado con ese iterador");
        size --;
    }
    public void addAtTail(String data){
        Node node = new Node();
        node.data=data;
        node.previous = tail;
        if(head==null){
            head=node;
            tail=node;
        }else{
            tail.next=node;
        }
        tail=node;
        node.next=null;
        size++;
        System.out.println("Agregado a la cola");
    }
    public void addAtFront(String data){
        Node node = new Node();
        node.data=data;
        node.next=head;
        if(head==null){
            head=node;
            tail=node;
        }else{
            head=node;
            node.next.previous=node;
        }
        size++;
        System.out.println("Agregado al frente");
    }
    public String getAt(int index){
       if(index > size || index < 0){
           System.out.println("esta vacia o exede el tamaño de la lista");
           return null;
       }
       Node currentNode=head;
       for(int currentIndex =0;currentIndex<index;currentIndex++){
           currentNode=currentNode.next;
       }
          System.out.println("Se encontro la informacion");
          return currentNode.data;

    }

    public int getSize(){
        return size;
    }
    public LinkedListIterator getIterator(){
        return new LinkedListIterator(head);
    }

}
