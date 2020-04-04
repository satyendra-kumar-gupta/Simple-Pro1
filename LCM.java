import java.util.*;
class LCM{
	public static void main(String args[]){
	System.out.println("Enter the size of array:");
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int[] arr=new int[n];
	System.out.println("Enter the element in array");
	for(int i=0; i<n; i++){
		arr[i]=scan.nextInt();
	}
//	int a=scan.nextInt();
//	int b=scan.nextInt();
	System.out.println("Your Answer is:");
	System.out.println(lcm2(arr));
	
	}	
	
	public static int lcm1(int a,int b){
	int lcm=0;
	for(lcm=a>b?a:b; lcm<=a*b; lcm=lcm+(a>b?a:b))
	{
		if(lcm%a==0 && lcm%b==0)
		break;
	}
	
	return lcm;
	}
	
	public static int lcm2(int[] arr){
		int temp=arr[0];
		for(int i=1; i<arr.length; i++){
			temp=lcm1(temp,arr[i]);
		}
		return temp;
	}
}