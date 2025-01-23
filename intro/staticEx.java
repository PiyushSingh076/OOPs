package intro;

//static function: u can use this function without creating object of that class therefore main function is static
//as main is the first thing when we run a java program ...if not static we would need an object .... 
public class staticEx {
    static Human hu=new Human(100);
    Human hu4=new Human(300);//executes at last
    public static void main(String[] args) {
        Human piyush =new Human(20,"Piyush",10000,false);
        Human Singh=new Human(30,"Singh",20000,false);
        Human hu2 =new Human(200);
        
        
        // POPULATION DOES NOT EXIST IN PIYUSH
        //so it will check does it exis in Human yes it does so increase that by 1 whenever an object is created

        System.out.println(piyush.population); //gives 2 
        System.out.println(Human.population);//still prints 2 so it doesnot need an object just needs class
        //convention - class name.population 

        staticEx funn=new staticEx();
        funn.fun2();//works fine
        fun();

    }
    static Human hu3=new Human(400); //will be executed before psvm

    static void fun(){

        //greeting(); //error under greeting as it needs an object since it depends on an object

        staticEx obj=new staticEx();
        obj.greeting();  //created its object
    }

    void greeting(){
        // fun();//static runs without object or being refrenced
        System.out.println("Hello");
    }

    void fun2(){
        greeting(); //here it shows no error coz its inside a non static class so that means somehow fun2's object will
        //be definitely created inside main
    }
}

