package intro;
//Static: the properties that are not directly related to object
public class Human {
    int age ;
    String name;
    int salary;
    boolean married;
    static long population; // doesnt depend on object
    static void message(){
       // System.out.println(this.age);//cant use "this" in static ...in statci u cant use non static stuff 
    }
    public Human(int age, String nam, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population+=1; // use human as it doesnt depend on a particular object
    }
    public Human(int n){
        System.out.println(n);
    }

    public static void main(String[] args) {
       // Singleton s=new Singleton(); error if we call like this
       
       Singleton s= Singleton.getInstance(); 

       Singleton s2= Singleton.getInstance(); //in getInstance fun since now its not null it returns the
       // same instance that has obs

       Singleton s3= Singleton.getInstance(); // same "instance"
    }
}
