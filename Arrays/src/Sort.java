public class Sort {
    public static void main(String[] args){
        int []arr=new int[]{34,64,2,3,87};
        fun(arr);

    }
    static void fun (int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
