class ArrayDemo2{
	public static void main(String[] args){
	int[] arr = {11,66,77,99,33,22};
		int Max = getMax(arr);
		System.out.println("最大值为:"+Max);
		int Min = getMin(arr);
		System.out.println("最小值为:"+Min);
	}
	public static int getMax(int[] arr){
		int max = arr[0];
		for(int i =1;i<arr.length;i++){
			if(arr[i] > max){
			max = arr[i];
			}
		}
		return max;
	}
	public static int getMin(int[] arr){
		int min = arr[0];
		for(int i =1;i<arr.length;i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}
}