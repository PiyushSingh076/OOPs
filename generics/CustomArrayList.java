package generics;

import java.util.Arrays;

//how arraylist doesnt need size
//when u enter suppose 10 elements internally it creates new array of size double
//copies old arr into new and then fill the rest 20 and this keeps on repeating
public class CustomArrayList {
    
    //we cant directly modify arraylist we use get or add method this is what we leanrt in privat
    //private items cannot be accessed directly we need methods and functions
    private int[] data;
    private int DEFAULT_SIZE=1;
    private int size=0;
    public CustomArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        int[] temp=new int[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data =temp;
    }

    private boolean isFull() {
        return size==data.length;
    }
// Explanation of the Decrement Operator (--):
// Prefix Decrement (--size): This operator first decrements the value of size by 1 and then uses the decremented value.
// Postfix Decrement (size--): This operator uses the current value of size and then decrements it by 1.
    public int remove(){//returns removed value
        int removed=data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size();
    }

    public void set(int index,int value){
        data[index]=value;
    }

    
    @Override
    public String toString() {
        return Arrays.toString(data) ;
    }

    public static void main(String[] args) {
        CustomArrayList list=new CustomArrayList();// out data array is integer type so it will take only integer
        // list.add(3);
        for(int i=0;i<10;i++){
            list.add(i);
        }
        

        System.out.println(list);
    }   
}
