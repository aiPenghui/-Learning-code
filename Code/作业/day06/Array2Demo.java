class Array2Demo{
	public static void main(String[] args){
		int[][] arr = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		price(arr);
	}
	public static void price(int[][] arr){
		int sum = 0;
		for(int i = 0;i<arr.length;i++){
			for(int x = 0;x<arr[i].length;x++){
				sum += arr[i][x];
			}
		}
		System.out.println("年度销售额为:"+sum);
	}
}
