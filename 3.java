import java.util.*;

class Main
{

static boolean topsyTurvy(char[] str)
{

for (int i = 0; i < str.length; i++)
{
if (str[i] == '2' || str[i] == '4' ||
str[i] == '5' ||
str[i] == '7')
{
return false;
}
}
return true;
}


public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    int temp=0,curr=0;
 
for(int i=0;i<input-1;){
      if(topsyTurvy(Integer.toString(curr).toCharArray())){
        i++;
        temp=curr;
      }
      curr++;
    }

   
System.out.println(temp);
}
}
