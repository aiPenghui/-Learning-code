import java.util.Scanner;
class Demo4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入行数:");
		int h = sc.nextInt();
		System.out.println("请输入列数:");
		int l = sc.nextInt();
		xing(h,l);
	}
	public static void xing(int h,int l){
		for(int i = 0;i<h;i++){
			for(int j = 0;j<l;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
 }