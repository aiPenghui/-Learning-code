//导入键盘录入的包
import java.util.Scanner;
class Jiami2{
	public static void main(String[] args){
		//创建键盘录入
		Scanner sc = new Scanner(System.in);
		//提示用户按要求输入
		System.out.println("请输入小于(8位)的数字:");
		//创建对象用于接收录入的值
		int number = sc.nextInt();
		//调用功能
		String ruslut = jiaMi(number);
		//输出结果
		System.out.println("加密结果为:"+ruslut);
	}
	/*
		功能：
			把一串键盘录入的数字放入数组
			并且加密:
				每个数加5
				每个数取余10
				第一位和最后一位相互交换位置
	*/
	public static String jiaMi(int number){
		//定义一个8位的数组
		int[] arr = new int[8];
		//定义一个索引变量
		int index = 0;
		//把数字转换成数组
		while(number > 0){
			arr[index] = number % 10;
			index++;
			number /= 10;
		}
		//把数组中的数加5并且取余10
		for(int x = 0; x<index;x++){
			arr[x] += 5;
			arr[x] %=10;
		}
		//把第一位数和最后一位交换
		int temp = arr[0];
		arr[0] = arr[index-1];
		arr[index-1] = temp;
		
		//定义一个空字符串
		String s = "";
		//遍历数组
		for(int i = 0;i < index;i++){
			//把数组用字符串拼接
			s+=arr[i];
		}
		//返回字符串
		return s;
	}
}