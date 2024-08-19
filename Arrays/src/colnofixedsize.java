public class colnofixedsize {
    public static void main(String[] args)
    {
        int[][] arr= {
                {2, 3, 4, 5},
                {2, 3, 4},
                {2, 3}
    };
        for(int row=0 ;row < arr.length;row++)
        {
        for(int col=0;col<arr[row].length;col++) {

                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
}}
