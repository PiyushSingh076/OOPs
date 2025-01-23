package Polymorphism;

public class Shapes {
    public void area(){// NEEDED FOR ACCESING
        System.out.println("im shapes");
    }

    // final public void area(){// FINAL PREVENTS OVERRIDING AND INHERITENCE
    //     System.out.println("im shapes");
    // }
   
    static void greeting(){
        System.out.println("in in box");
    }

    int perimeter(int l,int b){
        return l+b;
    }


    int perimeter(int side){
        return 2*side;
    }

    int perimeter(double side, int length){
        return (int)side*length;
    }

    public static void main(String[] args) {
        Shapes shape1=new Shapes();
        Shapes shape2=new Shapes();

        //contructor OVERLOADING
        int a= shape1.perimeter(5);
        int b=shape1.perimeter(4,5); //this is staitc polymorphism/compile time polymorphism
        int c=shape1.perimeter(20.3,4);  //same name different types of arguments

    }
}
