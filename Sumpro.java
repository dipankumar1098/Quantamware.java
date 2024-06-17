class Sumpro{
	public static void main(String args[]){
		int n,sum=0,product=1,digit;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		n=Sc.nextInt();
		while(n>0)
		{
			digit=n%10;
			if(digit%2==0){
				sum=sum+digit;
			}
			else{
				product=product*digit;
			}
			n=n/10;
			System.out.println("sum="+sum+"product="+product);
		}
	}
}