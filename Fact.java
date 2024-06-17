import java.util.Scanner;
class Fact{
	public static void main(String []args){
		int fact = 1;
		int i =1;

		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		while(i>num){
			fact=fact*i;
			i--;
			System.out.print("factorial "+num+"is: "+fact );
			

		}
	}
}