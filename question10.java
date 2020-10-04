import java.util.Scanner;

class question10{
		public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number:-");
		int n = in.nextInt();
		int m=1;
		for(int i=1;i<=n;i++){
			m=m*i;
		}
		System.out.print("Factorial of " + n + ":-" + m);
	}
}