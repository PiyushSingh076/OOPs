package Interface_IMP;
//Interface contains abstract methods,but it will allow MULTIPLE INHERTENCE
//variables in interfaces are static and final it doesnt allow u to do anything
//WHY FINAL --> IN INTERFACE IF U CREATE A VARIABLE THEN U HAVE TO CREATE ITS CONSTRUCTOR BUT THATS NOT POSSIBLE 
//IN ABSTRACT OF INTERFACE THEREFORE VARIABLES ARE FINAL AND STATIC

public class Main {

    //SUPPOSE FOR CARS U HAVE DIFFERENT CLASSES LIKE ENGINE MEDIA BRAKE AND IF U CREATE A CAR
    //U MUST OVERRIDE SO CREATE ABSTRACT CLASSES FOR ALL BUT IT DOESNT ALLOW MULTIPLE INHERITENCE
    //SO WE CREATE INTERFACE IN SUCH CASES

    public static void main(String[] args) {
        car car=new car();
        car.acc();
        car.stop();//overriding(which method to run is determined at runtime)

        //here also as if what to actually access depends on object type 

        Media carmedia=new car();//both engine and media has stop function
        carmedia.stop(); //still printing engines stop statement (ISSUE)

        //So well create separate classes for them 
        electric el=new Engine();//not allowed engine does not have a body of its own
        Engine en=new electric();//allowed since elctric implements engine so its like elctric is giving body to 
        //engine interface
        Engine en2=new Engine();//not allowed as engien does not have a body of its own hence creating
        //its object makes no sense
        Nicecar nicecar=new Nicecar();

        nicecar.start();//by default it will get power engine
        nicecar.stop();
        nicecar.startmusic();
        nicecar.upgrade(); //now it becomes electric car
        nicecar.start();


    }

}
// LinkedList Class and Queue Interface
// The LinkedList class is a doubly linked list implementation of the List and Deque interfaces. Since
//  Deque (Double Ended Queue) extends the Queue interface, LinkedList inherits the ability to function as a queue.
