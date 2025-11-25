class MainClass02{
	public static void div(int a, int b){
		int res = 0;
		System.out.println("a: "+a+" b: "+b);
		try{
			res = a/b;
		}	
		catch(ArithmeticException e){
			System.out.println("ArithmeticException handled...");
			e.printStackTrace();
		}

		System.out.println("res: "+res);

	}

	public static void main(String[] args) {
		System.out.println(" Program starts...");
		div(5,0);
		System.out.println("Program ends...");
	}
}