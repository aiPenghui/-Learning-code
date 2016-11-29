class Demo1{
	public static void main(String[] args){
		int FunctionSum = sum(55,6);
		System.out.println(FunctionSum);
		int FunctionSum2 = sum(55,6,8);
		System.out.println(FunctionSum2);
	}
	public static int sum(int a,int b){
		return a+b;
	}
	public static int sum(int a,int b,int c){
		return a+b+c;
	}
}