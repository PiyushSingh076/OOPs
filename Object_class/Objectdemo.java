package Object_class;

public class Objectdemo {
    //since every class bydefault extends object class lets override some function
    int num;
    String s;
    
    public Objectdemo(int num,String s) {
        this.num = num;
        this.s=s;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
       
       // return super.equals(obj);
       return this.num==((Objectdemo)obj).num; //this obj here is Object type whereas our this is Object demo type so 
       //we have to cast

       //prints hello now
    }

    @Override
    protected void finalize() throws Throwable { //GARBAGE COLLECTOR
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        //GIVES NUMBER REPRESENTATION OF AN OBJECT eg forobj 1523554304
        
        // return super.hashCode();
        return num; //we can modify this hashcode to return number too
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString(); //sTRING REPRESENTATION
    }
    
    public static void main(String[] args) {
        Objectdemo obj =new Objectdemo(60,"piyush");
        Objectdemo obj2=new Objectdemo(60,"piyush");
        System.out.println(obj.hashCode()); //1523554304
        System.out.println(obj2.hashCode()); //1175962212

        if(obj==obj2){// checks if both point to same object
            System.out.println("yelo"); 
        }
        //both  GIVES NO OUTPUT

        if(obj.equals(obj2)){ //checks the content actually
            System.out.println("hello");
        }

        //EQUALS IS DEFINED SUCH AS IT RETURNS FALSE
        //WE CAN MODIFY IT TO RETURN AFTER CHECKING NUM LETS SEE

    }

}
