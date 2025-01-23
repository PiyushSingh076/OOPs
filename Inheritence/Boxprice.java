package Inheritence;

public class Boxprice extends Boxweight{
    double cost;

    public Boxprice(double cost) {
        this.cost = cost;
    }

    

    public Boxprice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight); // this is like this.l=l from super classes 
        this.cost = cost; // then u add the new one
    }

    public Boxprice(double  side,double weight,double cost){// see it simply like defining a constructor for boxprice
        // ull have all l w c but since parent class is there u can define like this
        super(side,weight);
        this.cost =cost;
    }
    //best eg to understand multilevel inheritence
    public Boxprice(double l,double h,double weight,double cost){
        super(l,h,weight); //initially showing error coz theres no function in boxweight that takes 3 arg 
        //so well create one in boxweight
        this.cost=cost;
    }
    //See this too (IMP)
    public Boxprice(Boxprice other){
        super(other);//gives u --l w h weight
        this.cost=other.cost;
    }
    
    
}
