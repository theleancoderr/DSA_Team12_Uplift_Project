import java.util.Scanner;

class Day2_P1_Yash{
	static void printFibnocci(int n){
		int a = 0, b = 1, c;
		for(int i=0; i<=n; i++){
			for(int j=0; j<=i;j++){
				System.out.print(a +" ");
				c = a + b;
				a = b;
				b = c;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int inputRow;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		inputRow = scan.nextInt();
		printFibnocci(inputRow);
	}
}