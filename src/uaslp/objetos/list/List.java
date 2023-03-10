package uaslp.objetos.list;

import uaslp.objetos.list.linkedlist.LinkedListIterator;
//import uaslp.objetos.list.linkedlist.Node;

public interface List {//Esta T se refiere a esta clase, solo se llama asi por lo genral es un standar
    void setAt(int index,String data);
    void removeAll();
    void removeAllWithValue(String data);
    void remove(int index);
    void addAtTail(String data);
    void addAtFront(String data);
    String getAt(int index);
    int getSize();
    Iterator getIterator();
    boolean isEmpty();

}
