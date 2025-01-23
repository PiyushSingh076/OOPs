package intro;

public class IntroToOops{
    public static void main(String[] args) {
        Student piyush= new Student(50,"Piyush");
        System.out.println(piyush.Name);// output is piyush

        Student ayush=new Student(60,"ayush"); // if u dont give the arguments here then greeting
        // will print Default that is Piyush
        ayush.changeName("boka");
        System.out.println(ayush.Name);// output is Ayush
        
        piyush.changeName("Singh");
        System.out.println(piyush.Name); //now it will be changed to singh
        
        Student random =new Student();
        random.greeting(); //prints hello aloha

        Student one =new Student();
        Student two=one;

        one.Name= "two";
        System.out.println(two.Name); // change in one reflected in two as well
    }
}
class Student{
    int marks;
    String Name;

    Student(int marks,String Name){ // these are constructors
        this.marks=marks; // this is the refrence to the current object of the class
        this.Name=Name;
    }

    Student (Student other){// we can pass other object to a constructor as well
        this.Name=other.Name;
        this.marks=other.marks;
    }
    Student(){
        //this is also used to call the constructor also like this
        this(13,"Aloha"); // this is calling the first constructor
    }

    void greeting(){
        System.out.println("Hello " + this.Name);
    }
    void changeName(String newName){
        Name= newName;
    }
}