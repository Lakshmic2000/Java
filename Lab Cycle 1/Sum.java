import java.util.Scanner;
class sum
{
  public static void main(String arg[]){
   Scanner s = new Scanner(System.in);
   System.out.println("enter the numbers:");
   int num = s.nextInt();
   int sum = 0;
   for(int i=0; i<=num;i++)
    {
     sum=sum+i;
     
    }
   System.out.println("sum of  numbers is:"+sum);
  }
}
   