import java.util.Scanner;
import java.util.Arrays;
public class Arraybasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Syntax
       // datatype[] variable name = new Datatype[size];
        int []a =new int[5];//initializing the array

        System.out.println(a[3]);// it has by default 0 values stored in array
        //int is a datatype
        //a is a reference variable which is in stack memory
        // new is used to create the object in heap memory
        //new int[5] is creating the object in heap memory


       int []rollno={10,20,30,40};// initializing the array
        System.out.println(rollno[0]);// refrence variable roll no is pointing towards the heap
        System.out.println(rollno[2]);
        System.out.println(rollno[3]);
        rollno[3]=23;// changing the number at the index 3
        System.out.println(rollno[3]);
        int[]b;//declaration of array.b is defined in the stack.
        b=new int[5];//initialisation :actually the object is created in memory(heap)

// array of object

        String[] arr= new String[5];
        System.out.println(arr[2]);//it have by default null value present in array
        // input using for loop
     int i;
         for( i=0; i<arr.length;i++)
          {
               arr[i]=sc.next();
          }
        System.out.println(Arrays.toString(arr));// print the number in the proper array format with comma and bracket
       // for( i=0; i<arr.length;i++)
     //   {
       //     System.out.print(arr[i]);
        //}

        // this is known as for each loop
          for(String num:arr)// for every element in the array ,print the element
          {
              System.out.println(num+"  ");// here num represent element of the array
          }

// modify
        arr[0]="sandip";
          System.out.println(Arrays.toString(arr));
    }
}
