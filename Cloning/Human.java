package Cloning;

public class Human implements Cloneable {//i u want to clone an object in that method u have to implement Cloneable
    int age;
    String name;    
    int[] arr;
    public Human(int age, String name,int[] arr) {
        this.age = age;
        this.name = name;
        this.arr=arr;
    }
    public Human(Human other){
        this.age=other.age;
        this.name=other.name;
        this.arr=other.arr;

    }
    // @Override
    // public Object clone() throws CloneNotSupportedException{
    //     //what does this mean??--> if we don not implement CLonable interface then it will throw this exception
        
    //     return super.clone();//protected native Object clone() throws CloneNotSupportedException; 
    //     //if something ure using in function that throws exception u must specify that then

    //     //IT WAS SHALLOW COPYING
    //     //In shallow copying for cloned object it creates new variables for primitive and assign it the value
    //     //but for object eg array it just point sto the original array of original object
    // }

    public Object clone() throws CloneNotSupportedException{
        Human twin=(Human)super.clone();//this is shallow coying

        //make a deep copy(shallow copying + Modification = deep copying)
        twin.arr=new int[twin.arr.length];
        for(int i=0;i<twin.arr.length;i++){
            twin.arr[i]=this.arr[i];
        }
        return twin;
    }
}
