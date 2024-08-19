import java.util.*;
public class Multiarraylist {
    public static void main (String [] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for (int i=0;i<3;i++)
        {
            list.add(new ArrayList<>());// for creating the 3 ARRAY list
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                list.get(i).add(sc.nextInt());// to get input
            }

        }
        System.out.println(list);
    }
}
