import java.util.*;
public class Day2_P5_Yash
{
     public static void main(String args[])
     {
     	int inputrows, binary = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        inputrows = scan.nextInt();
        System.out.println("Enter binary number: ");
        int sum = 0,p = 0;
        while(inputrows>0)
        {
          binary = scan.nextInt();
          p = 0;
          sum = 0;
          while(binary>0)
          {
              sum += Math.pow(2,p)*(binary%10);
              p = p + 1;
              binary = binary / 10;  
          }
          System.out.println(sum);
          inputrows = inputrows - 1;
         }   
    }
}