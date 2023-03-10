package uaslp.objetos.list.linkedlist;

import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.Navigable;

public class LinkedListIterator extends Object implements Iterator {//no se sugiere mas de una interfaz por classe
    private Node currentNode;
    LinkedListIterator(Node head){
        currentNode=head;
    }
    public boolean hasNext(){
        return currentNode!=null;
    }
    public String next() {
        String data =  currentNode.data;
        currentNode =  currentNode.next;
        return data;
    }

    public boolean hasPrevious() {
        return currentNode != null;
    }

    public String previous() {
        String data = currentNode.data;
        currentNode = currentNode.previous;
        return data;
    }
    public Node getCurrentNode() {
        return currentNode;
    }
}
