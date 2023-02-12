package uaslp.objetos.list.arraylist;

public class ArrayListIterator {
    private ArrayList currentArray;
    ArrayListIterator(ArrayList first){
        currentArray = first;
    }
    public boolean hasLeghtYet(){
        return currentArray!=null;
    }
    //creo que el string que se usaba en las listas no es necesario, debido al private String []array;
}
