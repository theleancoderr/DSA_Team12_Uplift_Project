import java.util.Scanner;

class Day2_P4_Yash{
	public static void main(String[] args) {
		int input, len=0, sum=0, rem;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		input = scan.nextInt();
		int t = input, s = input;
		
		while(t>0){
			t=t/10;
			len++;
		}

		while(s>0){
			int mul=1;
			rem = s%10;
			for(int i =1; i<=len; i++){
				mul= mul*rem;
			}
			sum =sum+mul;
			s=s/10;
		}
		if(sum==input){
			System.out.print("true");
		}
		else{
			System.out.print("false");
		}
	}
}