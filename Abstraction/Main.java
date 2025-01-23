package Abstraction;

public class Main {
    public static void main(String[] args) {
        //abstract methods do not provide implementation just definition

        Son son=new Son(30);
        son.career("Piyush");;
        son.partner();

        // parent mom=new parent(30); //we cannot create parent object

        parent dad=new Son(30); //but this is allowed as we know if something is overriden then 
        //TYPE OF OBJECT DETERMINES WHAT TO ACTUALLY ACCESS
        
    }
}
