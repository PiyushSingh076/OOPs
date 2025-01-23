package Interface_IMP.Interface2;

public interface A {
    void fun();
    //static interface methods must have a body as we cant override statuc stuff
    static void greeting(){
        System.out.println("hey piyush");
    }
}
