import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55,66,77,88,99};
        int n=22;
        int ans=linearsearch( arr,n);
        System.out.println(ans);
    }
    static int linearsearch(int[] arr,int n)
    {
        if (arr.length==0)
        {
            return -1;

        }
        for(int i=0; i<arr.length;i++)
        {
            int element=arr[i];
            if(element==n)
            {
                return i;//if we want to display element either of displaying the index use element or arr[i]
            }
        }return -1;

    }
}
