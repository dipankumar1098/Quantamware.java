class Ascii{
	public static void main(String []args){
		char ch;
		System.out.print("Enter any charcacter");
		Scanner r =newScanner(System.in);
		ch=r.next().charAt(0);
		int a =ch;
		System.out.println("Ascii value of "+ch+" is"+a);
	}


}
