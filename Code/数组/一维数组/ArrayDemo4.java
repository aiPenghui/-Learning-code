import java.util.Scanner;
class ArrayDemo4{
	public static void main(String[] args){
		String[] arr = {"星期一","星期二","星期三","星期四","星期五","星期六","星期天"};
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入0-6:");
		int value = sc.nextInt();
		indexValue(arr,value);
		}
	public static void indexValue(String[] arr,int value){
		for(int i = 0;i<arr.length;i++){
			if(i==value){
				System.out.println("今天是:"+arr[i]);
			}
		}
	}
}