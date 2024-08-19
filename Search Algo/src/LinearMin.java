public class LinearMin {
    public static void main(String[] args) {


    int[] arr={11,22,33,44,55,66,77,88,99};

    int ans=linearsearch( arr);
        System.out.println(ans);
}
static int linearsearch(int[] arr)
{
    int ans =arr[0];
    for(int i=1; i<arr.length;i++)
    {
        if(arr[i]<ans)// for max value change the sign >
        {
            ans=arr[i];

        }
    }return ans;

}
}
