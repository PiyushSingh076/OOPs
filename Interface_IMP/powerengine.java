package Interface_IMP;

public class powerengine implements Engine{

    @Override
    public void acc() {
        System.out.println("electric engine stop");
        
    }

    @Override
    public void start() {
        System.out.println("Power engine start");
        
    }

    @Override
    public void stop() {
        
        System.out.println("power engine stop");
    }

}
