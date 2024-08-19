import java.util.*;
public class Arraylistexample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         ArrayList<Integer> list =new ArrayList<>();
         //Array list is a dynamic allocation we can store any amount of elements in arraylist
         list.add(45);// is used to add elements in array
        list.add(459);
        list.add(746);
        list.add(87);
        list.add(30);
        list.add(24);
        list.add(20);

        System.out.println(  list.contains(20));// it will give true and if it not contain the value given then it will return false
        System.out.println(list);
        list.set(0,23);//it will update the 0 index with 23
        list.remove(3);// it will remove index number 3
        System.out.println(list);

        //input
        for(int i=0;i<5;i++)
        {
            list.add(sc.nextInt());
        }
        // get any item at any index
        for(int i=0;i<5;i++)
        {
            System.out.println(list.get(i));//pass the index here ,list[index] synatx will not work here to get the element present at the index
        }
    }
}
