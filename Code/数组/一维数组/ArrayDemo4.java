import java.util.Scanner;
class ArrayDemo4{
	public static void main(String[] args){
		String[] arr = {"����һ","���ڶ�","������","������","������","������","������"};
		Scanner sc = new Scanner(System.in);
		System.out.println("������0-6:");
		int value = sc.nextInt();
		indexValue(arr,value);
		}
	public static void indexValue(String[] arr,int value){
		for(int i = 0;i<arr.length;i++){
			if(i==value){
				System.out.println("������:"+arr[i]);
			}
		}
	}
}