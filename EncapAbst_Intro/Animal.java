package EncapAbst_Intro;

// Definition: Abstraction is the concept of hiding the complex implementation details 
// and showing only the essential features of the object. It reduces 
// complexity by allowing the user to interact with the object at a higher level,
//  without needing to understand the internal workings
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void makeSound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof");
    }
}

// In the example above, the Animal class is abstract and defines an abstract method makeSound(). 
// The Dog class extends Animal and provides an implementation for makeSound().
//  This allows the user to interact with the Dog class without needing to know how the sound is produced.

