package Inheritence;

public class Main {
    public static void main(String[] args) {
        Box box1=new Box(4.6,7.9,1.2);
        // System.out.println(box1.l+" "+ box1.h); u cant acces l as it is private 

        Boxweight box2=new Boxweight(1,2,2,3);
        System.out.println(box2.h+""+box2.w);  //child class can access parent class
        // but if somethings private it cannot
        
        Box box3=new Boxweight(2,3 ,4,5); //IMP
        //System.out.println(box3.weight); //here type of the refrence variable is Box and Box cannot access weight 
        //only what Box has can be accesed by box3(box3 is box type)

        //Boxweight box4= new Box(); //object is parent class now ... but if object  itself is parent class 
        //how will u call the constructor of child class

        Boxweight box5=new Boxweight();
        System.out.println(box5.w); //now refrence variable Boweight has acces to w

        Boxprice box6=new Boxprice(10,20,10,22);
        System.out.println(box6.cost);

        Boxprice box7 =new Boxprice(box6); // Compile time polymorphism 
        System.out.println(box7.weight);
        System.out.println(box7.cost); //printing box 6 weight and price

        //super gives u parent class properties and the extra ones that u added in child add urself

        Boxweight boxx =new Boxweight();
        boxx.greeting(); //You can inherit bubt can not override the one in main class that only u can use 
        //u cant override and use in child class
    }

}
