package Abstraction;

public class Son extends parent {
    //Implementation has to be done by SON

    public Son(int age){
        super(age);
    }
    @Override
    void career(String name) {
        System.out.println("I am going to be doctor");
    }

    @Override
    void partner() {
        System.out.println("I love xyz");  
    }
    
}
