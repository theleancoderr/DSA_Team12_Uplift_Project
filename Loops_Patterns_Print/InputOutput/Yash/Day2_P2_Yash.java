import java.util.Scanner;

class Day2_P3_Yash{
    static void printPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=2*n-1;j++){
                if(j<=i){
                    System.out.print(j);
                }
                else if(2*n-j<=i){
                    System.out.print(2*n-j);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int inputRow;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        inputRow = scan.nextInt();
        printPattern(inputRow);
    }
}
