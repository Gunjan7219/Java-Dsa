import java.lang.String;
public class LinearSearch2 {
    public static void main(String[] args)
    {
        String name="Gunjan";
        char target='n';
        boolean ans =linearsearch(name,target);
        System.out.println(ans);
    }
    static boolean linearsearch(String name, char target)
    {
        if(name.length()==0)
        {
            return false;
        }
       for(int i=0;i<name.length();i++)
       {
           if(target== name.charAt(i))
           {
               return true;
           }
       }return false;
    }
}
