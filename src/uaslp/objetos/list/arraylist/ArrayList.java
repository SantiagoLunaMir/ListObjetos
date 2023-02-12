package uaslp.objetos.list.arraylist;

public class ArrayList {
    private static final int INITIAL_SIZE=2;
    private String []array;//data.lenght para el tam de arreglo
    private int size;//cantidad de datos de arreglo
    private ArrayList first;

    public ArrayList(){
        array = new String[INITIAL_SIZE];
    }

    private void increaseSize(){
        String []newArray=new String[array.length*2];
        //System.arraycopy(array, 0, newArray, 0, array.length);//Forma eficiente
        for (int i=0;i<array.length;i++){
            newArray[i]=array[i];
        }
        array=newArray;
    }
    public int getSize(){
        return size;
    }
    public String getAt(int index){
        return array[index];
    }
    public void addAtTail(String data){
        if(size== array.length){
            increaseSize();
        }
        array[size]=data;
        size ++;
    }
    public void addAtFront(String data){

        String []newArray=new String[array.length+1];
        newArray[0]=data;
        for(int i=0;i< array.length;i++){
            newArray[i+1]=array[i];
        }
        size ++;
        if(size>= array.length){
            increaseSize();
        }
        array=newArray;
    }
    public void  setAt(int index,String data){
        if(index<=array.length){
            array[index]=data;
        }
    }
    public void removeAll(){
        size=0;
        for (int i=0;array[i]!=null;i++){
            array[i]=null;
        }
        System.out.println("Eliminado todo el arreglo");
        size=0;
    }
    public void removeAllWithValue(String data){
        boolean found=false;
        for(int i=0;i<array.length;i++){
            if(array[i]!=null){
                if(array[i].compareTo(data)==0)
                    size --;
                if(array[i].compareTo(data)==0||found==true){
                    found=true;
                    array[i]=array[i+1];
                }

            }
        }
        if(found==false){
            System.out.println("No se encontro la informacion");
        }
    }
    public void remove(int index){
        boolean found=false;
        if(index>array.length){
            System.out.println("No existe");
            return;
        }
        array[index]=null;
        size --;
    }
    public ArrayListIterator getIterator(){
        return new ArrayListIterator(first);
    }
}
