import java.util.*;
public class linear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int arr[]=new int[size];
        System.out.println("enter the key");
        int key = sc.nextInt();

        System.out.println("Enter the elements in array");

       int i;
        for( i=0;i<size;i++){
            arr[i]=sc.nextInt();

            }

        if(key==arr[i]){
            System.out.println("number found at index"+arr[i]);

        }



    }
}
