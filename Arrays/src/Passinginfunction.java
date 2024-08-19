import java.util.Arrays;
// array is mutable we can change the value in array
public class Passinginfunction {
    public static void main(String[] args)
    {
        int[] num = {34,45,67,89};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));

    }
    static void change(int[] arr)
    {
        arr[0]=99;
    }
    //the refrence variable num is pointing towards the ob ject
    //and the copy of the reference variable arr is also pointing towards the same object
}
