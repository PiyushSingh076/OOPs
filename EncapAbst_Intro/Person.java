package EncapAbst_Intro;
// Definition: Encapsulation is the concept of bundling the data (variables) 
// and methods (functions) that operate on the data into a single unit, or class. It also involves restricting
//  direct access to some of an object's 
//  components, which is a means of preventing unintended interference and misuse of the data.
public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}
//In the example above, the Person class encapsulates the name 
//and age fields, providing PUBLIC METHODS TO ACCESS AND MODIFY them while keeping the fields themselves private.

//data hiding is subset of encapsulation

