package generics.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student piyush =new Student(76, 87);
        Student ayush=new Student(34,23);

        Student[] arr=new Student[2];
        arr[0]=piyush; 
        arr[1]=ayush;
        
        Arrays.sort(arr,(a,b)->a.marks-b.marks);//if we dont use comparable then we can use this

        System.out.println(arr[0].marks);  //we set arr[0] as piyush but it returns rahuls marks as thats 
        //small... so for sorting and all now we can do if we have cpmpare to class

        // if(ayush>piyush){//however this is not allowed so whats allowed 
        //     System.out.println("piyush");
        // }

        if(ayush.compareTo(piyush)<0){//< 0 means is rahuls marks is less
            System.out.println("piyush marks is more");
        }
    }

}
