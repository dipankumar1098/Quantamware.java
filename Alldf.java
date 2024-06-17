class Alldf
{
	public static void main(String []args){
		int sum=0;
		
		for(int i=123;i>0;sum=sum+(i%10),i=i/10);
			
		System.out.println(sum);
	}
}