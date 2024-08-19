
public class SearchInRange {
    public static void main(String[] args) {


    int[] arr={11,22,33,44,55,66,77,88,99};
    int n=55;
    int ans=linearsearch( arr,n,1,5);
        System.out.println(ans);
}
static int linearsearch(int[] arr,int n,int start,int end) {
    if (arr.length == 0) {
        return -1;

    }
    for ( int i = 0; i <=end; i++) {
        int element = arr[i];
        if (element == n) {
            return i;//if we want to display element either of displaying the index use element or arr[i]
        }
    }
    return -1;

}
}
