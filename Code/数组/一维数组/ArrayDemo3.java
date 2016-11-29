class ArrayDemo3{
	public static void main(String[] args){
		int[] arr = {44,33,22,11,10};
		reverse(arr);
		printArray(arr);
	}
	public static void reverse(int[] arr){
		for(int start = 0,end = arr.length-1;start<=end;start++,end--){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
	}
	public static void printArray(int[] arr){
		System.out.print("[");
		for(int i = 0;i<arr.length;i++){
			if(i==arr.length-1){
				System.out.print(arr[i]+"]");
			}else{
				System.out.print(arr[i]+", ");
			}
			
		}
	}
	
	
}