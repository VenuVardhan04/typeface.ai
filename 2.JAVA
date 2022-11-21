public class Main
{
    static int getFreq(String s1,String s2)
    {
       
        char ch = s2.charAt(s2.length()-1);
        int ctr=0;
        for(char curr:s1.toCharArray()){
            if(curr==ch)ctr++;
        }
        return ctr;
       
    }
public static void main(String[] args) {
System.out.println(getFreq("going to go to goa","go"));
}
}