/*
	ѧ����:
		����:
			����,����,��ַ.
		��Ϊ:
			�Է�,ѧϰ,˯��.
*/
//ѧ����
class Student{
	//����
	String name;
	//����
	int age;
	//��ַ
	String address;
	
	//�Է�
	public void eat(){
		System.out.println("�Է�");
	} 
	//ѧϰ
	public void study(){
		System.out.println("ѧϰ");
	}
	//˯��
	public void sleep(){
		System.out.println("˯��");
	}
}

//����ѧ����
class StudentDemo{
	public static void main(String[] args){
		//����ѧ������
		Student s = new Student();
		
		//��������ֵ
		s.name = "����ϼ";
		//�����丳ֵ
		s.age = 27;
		//����ַ��ֵ
		s.address = "�ϲ�";
		
		//���ѧ������
		System.out.println(s.name+"---"+s.age+"---"+s.address);
		
		//����ѧ����Ϊ
		s.eat();
		s.study();
		s.sleep();
	}	
}