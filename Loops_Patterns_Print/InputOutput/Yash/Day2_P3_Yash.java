import java.util.Scanner;

class Day2_P3_Yash{
	static void printPattern(int n){
		int track=1;
		for(int i=1; i<=n; i++){
			for(int j=n; j>=i;j--){
				System.out.print(j+ " ");
				track++;
			}
			track=1;
			for(int k =2; k<(2*i)-1; k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int inputRow;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		inputRow = scan.nextInt();
		printPattern(inputRow);
	}
}