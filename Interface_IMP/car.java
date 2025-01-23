package Interface_IMP;

public class car implements Engine,brake,Media {
    //now we need to create a car so we need it to have engine, brake , media so we have to extend all 3
    //previously we were not allowed now we can

    //HERE CAR DESCRIBES THE ENGINE SO IF ENGINE WE HAVE TO CHANGE CHANGE CAR ITSELF
    //IN NICECAR EACH PART ENGINE AND ALL ARE IMPLEMENTED BY VARIABLE SO IF WE NEED TO CHANGE CHANGE VARIABLE AND NOT CAR
    
    @Override
    public void brake() {
        System.out.println("I brake liek a  normal car");
    }

    @Override
    public void start() {
       System.out.println("i start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("i stop like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("i accelerate like a normal car");
    }
    

}


//in car if we have to change something we have to change the entire car itself by making new car and defining engine differnetly
//but we can create a class nicecar which will have ,ultiple features lets see hwo