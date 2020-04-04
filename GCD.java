import java.util.*;
public class GCD{
	public static void main(String args[])
	{
		//System.out.println("Enter the two value");
		System.out.println("enter the size of array");
		Scanner scan=new Scanner(System.in);
		//int a=scan.nextInt();
		//int b=scan.nextInt();
                int n=scan.nextInt();
                int ar1[]=new int[n];
		System.out.println("Enter the value in array");
		for(int i=0; i<n; i++){
                 ar1[i]=scan.nextInt();
                }
                System.out.println("Your Answer is:");
		System.out.println(gcdr(ar1));
	}

	public static int gcd(int a, int b)
       {
		if(a==0)
		return b;
		
		if(b==0)
		return a;

                return gcd(b, a%b);

	}
     	public static int gcdr(int[] ar1){

	int temp=ar1[0];
        for(int i=1; i<ar1.length; i++)
	{
         temp=gcd(temp, ar1[i]);
        }
         return temp;
	}
     
      
   
}