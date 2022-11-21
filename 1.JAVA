public class Main
{
    static int toThree(int n)
    {
       
        StringBuffer sb = new StringBuffer();
        while (n > 0)
        {
           
            sb.append(Integer.toString(n%3));
            n = n / 3;
           
        }
        return Integer.parseInt(sb.reverse().toString());
       
    }
public static void main(String[] args) {
System.out.println(toThree(10));
}
}