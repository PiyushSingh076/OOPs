package intro;
//well see how to initialize a static variable
public class StaticBlock {
    //we can use static block
    static int a=4;
    static int b;

    //will only run once when the first obj is created ie when the class is leaodedm for the first time
    static{
        //static block
        //1. will run for the first time only
        //2.second object it will not run
        System.out.println("Im in static block");
        b=a*5;
    }
    public static void main(String[] args) {
        StaticBlock obj=new StaticBlock(); //when we do this it will run all thr static part first b
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        //simply if the other class is also static we can create its object but only once
        StaticBlock.b+=3;
        

        StaticBlock obj2=new StaticBlock(); //this time im in static block wont be printed 
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }
}
