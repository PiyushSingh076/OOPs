package Interface_IMP;
//these are just as abstract class 
public interface Engine {

    //In interfaces theres no such hierarchy and its nothing like it can access only immediate above class

    static final int price = 70000; // u dont hev to put static final it already is by default
    void start();
    void stop();
    void acc();
}
