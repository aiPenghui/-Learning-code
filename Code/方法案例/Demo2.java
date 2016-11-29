class Demo2{
	public static void main(String[] args){
		eq(33,22);
		eq(33,33);
	}
	public static void eq(int a,int b){
		if(a==b){
			System.out.println("相等");
		}else{
			System.out.println("不相等");
		}
	}
}