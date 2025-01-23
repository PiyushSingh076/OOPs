package Interface_IMP.Interface2;

public class Main2 implements A,B {
    //u have to implement both gree and fun sice b extens a

    @Override
    public void fun() {
        
    }

    @Override
    public void greet() {
       
    }
    public static void main(String[] args) {
        Main2 obj=new Main2();
        A.greeting();//use class name for static as we know 
    }


}
