public class SearchintwoDarray {
    public static void main(String[] args)
    {
        int[][] arr={{22,33,44,55,56},{77,88,5,66,88}};
       int target=5;

        System.out.println( linearsearch(arr,target));
    }
    static int linearsearch(int[][]arr,int target)

    {
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                if(arr[row][col]==target)
                {
                    return arr[row][col];
                }
            }
        }return -1;
    }
}
