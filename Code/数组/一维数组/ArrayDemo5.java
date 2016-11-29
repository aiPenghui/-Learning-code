class ArrayDemo5{
	public static void main(String[] args){
		int[] arr = {100,303,200,400};
		index(arr,200);
		index(arr,100);
	}
	public static void index(int[] arr,int value){
		for(int i = 0; i< arr.length;i++){
			if(arr[i]==value){
				System.out.println("Ë÷ÒýÖµÎª:"+i);
			}
		}
	}
	
}