import java.util.Arrays;
public class CyclicMissingnumber {// when we have given number 1 to n then use cyclic sort or find missing number from 1 to n
    public static void main(String[] args){
int []arr={1,3,0,4};

System.out.println(missing(arr));
    }
    static int missing(int[]arr){

        int i=0;
        while(i<arr.length) {
            int correct = arr[i];// storing the value present at index the it willl check if index 0 the value is 0 or not if its not 0 then swap with correct index which is 0
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        // case second if index is not equal to the number present at that index
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index){
return index;
            }
        }return i;
    }
    static void swap(int []arr,int first,int second){
        int temp=arr[first];
        arr[second]=arr[first];
        arr[first]=temp;
    }
}
