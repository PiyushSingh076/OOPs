package Interface_IMP;

public class electric implements Engine {
    //separate classes in same interface
    @Override
    public void start() {
        System.out.println("electric engine start");
    }

    @Override
    public void stop() {
        System.out.println("electric engine stop");
    }

    @Override
    public void acc() {
        System.out.println("electric engine stop");
    }

}
