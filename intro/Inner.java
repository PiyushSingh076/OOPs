package intro;

public class Inner {//this outsie class cant be static as one inner class is dependent on it means obj has to be created
    stati class Test{//inner class
        String name;
        public Test(String name){
            this.name=name;
        }
        //we can change the ibuilt function by overriding
        @Override
        public String toString() {
            return name; 
            //without overriding prints Inner$Test@4617c264
            //now name
        }
        
    }

    public static void main(String[] args) {
        Test a=new Test("piyush");//error for class Inner not if its static class test
        //1.if test class was not inside anything then it wont happen as it doesn t depend on anything
        //2. if test was static then also
        //3.if its simply class test--> error as we have to create object for Inner too
        System.out.println(a);//directly printing a -->Inner$Test@4617c264
    }
}


//when we put a class inside a outer class then inner class is dependent on the outer class and it requires 
//an object of the outer class as well

//If innner class is static then it wont be dependent on object of outer class

//System.out.println--> System is class out is variable println is method