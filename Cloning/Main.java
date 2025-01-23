package Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //if something ure using in function that throws exception u must specify that then
        Human Piyush =new Human(20,"Piyush",new int[]{1,2,2,2,2});
        Human twin=new Human(Piyush);
        //we can do this other way too

        Human twin2=(Human)Piyush.clone(); 
        System.out.println(twin2.name); //throws exception if interface not implemented
        twin2.arr[0]=100;
        // twin.arr[0]=100;
        System.out.println(Piyush.arr[0]);
        System.out.println(twin2.arr[0]);
        System.out.println(twin.arr[0]);//both twin and twin2 changes arr of  Piyush too
        //this is shallow copying but aftr deep copying twin2 doesnt change Piyush arr

    }
}
