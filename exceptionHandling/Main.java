package exceptionHandling;

public class Main {
    //keywors try, catch, finally, throws, throw, e.getMessage(), 

    public static void main(String[] args) {
        //to show exception
        int a=5;
        int b=0;
        try{
            int c=a/b;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally{//always execute
            System.out.println("this is always exexute");
        }
        
    }
    static int divide(int a,int b) throws ArithmeticException { //when u know a method may throw particular exception
        //eg2. nullpointexception
        if(b==0){
            throw new ArithmeticException("plz do not divide by zero"); // print
        }
        return a/b;
    }
}
