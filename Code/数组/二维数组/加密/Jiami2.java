//�������¼��İ�
import java.util.Scanner;
class Jiami2{
	public static void main(String[] args){
		//��������¼��
		Scanner sc = new Scanner(System.in);
		//��ʾ�û���Ҫ������
		System.out.println("������С��(8λ)������:");
		//�����������ڽ���¼���ֵ
		int number = sc.nextInt();
		//���ù���
		String ruslut = jiaMi(number);
		//������
		System.out.println("���ܽ��Ϊ:"+ruslut);
	}
	/*
		���ܣ�
			��һ������¼������ַ�������
			���Ҽ���:
				ÿ������5
				ÿ����ȡ��10
				��һλ�����һλ�໥����λ��
	*/
	public static String jiaMi(int number){
		//����һ��8λ������
		int[] arr = new int[8];
		//����һ����������
		int index = 0;
		//������ת��������
		while(number > 0){
			arr[index] = number % 10;
			index++;
			number /= 10;
		}
		//�������е�����5����ȡ��10
		for(int x = 0; x<index;x++){
			arr[x] += 5;
			arr[x] %=10;
		}
		//�ѵ�һλ�������һλ����
		int temp = arr[0];
		arr[0] = arr[index-1];
		arr[index-1] = temp;
		
		//����һ�����ַ���
		String s = "";
		//��������
		for(int i = 0;i < index;i++){
			//���������ַ���ƴ��
			s+=arr[i];
		}
		//�����ַ���
		return s;
	}
}