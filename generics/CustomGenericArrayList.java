package generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {// now this T can be int string anything so its like X
    

    private Object[] data; //this array is object type it can contain anything but when well fetch
    //something from it then we have to cast it to T
    private int DEFAULT_SIZE=1;
    private int size=0;
    public CustomGenericArrayList(){ 
        this.data=new Object[DEFAULT_SIZE];// cannot create T type array it has to be object type
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        Object[] temp=new Object[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data =temp;
    }

    private boolean isFull() {
        return size==data.length;
    }

    public T remove(){//returns removed value
        T removed = (T)data[--size];  //since data is object type we have to cast it
        return removed;
    }
    public T get(int index){
        return (T)data[index];
    }
    public int size(){
        return size();

    }

    public void set(int index,T value){
        data[index]=value;
    }

    
    @Override
    public String toString() {
        return Arrays.toString(data) ;
    }

    public static void main(String[] args) {
        CustomGenericArrayList<Integer> list=new CustomGenericArrayList<>();
        list.add(23);
        System.out.println(list);
        //list.add("piyush");//Type safety(if its made for integer then u cant String)
        //In arraylist without generic it allows every data type
        
        
    }
}
