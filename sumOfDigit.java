import java.util.Scanner;

class question14{
		public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number:-");
		int n = in.nextInt();
		int orgn = n;
		int sum = 0,r;
		while(n!=0){
			r = n%10;
			sum = sum +r;
			n=n/10;
		}
		System.out.print("Sum of the Digits of " + orgn + ":- " + sum);
	}
}