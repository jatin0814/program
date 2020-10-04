import java.util.Scanner;

class question15{
		public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number:-");
		int n = in.nextInt();
		int orgn = n;
		int sum=0,r;
		while(n!=0){
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		if(orgn == sum)
			System.out.print(orgn + " is Armstrong number");
		else
			System.out.print(orgn + " is not Armstrong number");

	}
}