package Interface_IMP;

public class Nicecar {
    //what this car will be able to do is it will be able to modify a particular part of it without changing 
    //the car itself
    //for that we make variables of each part of car 
    private Engine engine;
    //now this engine has multiple options and u can change easily as different kind of engines implement engine
    private Media player=new cdplayer();// now we created variables for car and we can now change them 
    //we can change and modify media and engine for that we created more classes that implements just engine and media
    

    public Nicecar() {
        engine =new powerengine();
        //by default at start engine will be power engine
    }

    public void start(){
        engine.start(); //if it is power engine poweer engine will be called if electric then that
    }

    public void stop(){
        engine.stop(); //if it is power engine poweer engine will be called if electric then that
    }
    public void startmusic(){
        player.start(); // now it stops music not engine 
    }

    public void upgrade(){
        this.engine =new electric(); //if u upgradE current engine it will become electric 
    }

    //SO NOW U WILL HAVE A CAR WHERE U CAN SEPARATELY PERFORM SO MUCH ACTIVITIES AND MODIFY THINGS
    //WITHOUT ACTUALLY DOING LIKE CREATE NEW CAR WITH NEW ENGINE OR SO
    //HOW THIS IS ACHIEVED ??
    //EARLIER U IMPLEMENTED CAR TO MEDIA ENGINE BRAKE ALL TOGETHER THEREFORE WHEN U CHANGE LETS SAY ENGINE U HAVE TO
    //CREATE A NEW OBJECT IF U STOPPED MUSIC ENGINE STOPS
    //BUT NOW U DONT IMPLEMENT ALL TOGETHER
    //U CREATE A VARIABLE ENGINE THAT IMPLEMETNS ONLY TO ENGINE MEDIA THAT IMPLEMENTS ONLY MEDIA 
    //SO NOW IF U HAVE TO CHANGE ENGINE U CAN WITHOUT CHNAGING OTHER THINGS
}
