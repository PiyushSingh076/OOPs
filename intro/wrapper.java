package intro;


public class wrapper {
    public static void main(String[] args) {
        //using primitive as object
        // final int a=10; //Integer is wrapper class that contains int and all

        // a=3;
        

        final int[] arr={1,2,3}; 
        arr[2]=10; // final only prevents the primitive data type tp change 
        //for non primitive u can change the value but u cannot reassign it 
        //EG
        //arr=new int[2]; //this u cant do
        
        final Temp rand=new Temp("Piyush");
        //rand =new Temp("Ayush"); //showing error under rand coz u cant reassign a final object
        
        //Garbage COllection
        Temp obj;
        for(int i=0;i<1000000000;i++){// for larger number this will happen
            obj=new Temp("Tandim");// as loop runs obj acts points to new OBJECT

           // obj.finalize();// we cant tell it to free the memory but we can tell how to free the memory

        }
    }
}
class Temp{
    final int num=10;
    String name;
    Temp(String name){
        this.name=name;
    }
    @Override// itself comes when u type finalize
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("Object is destroyed");
    }
}