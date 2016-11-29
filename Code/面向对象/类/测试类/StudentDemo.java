/*
	学生类:
		属性:
			姓名,年龄,地址.
		行为:
			吃饭,学习,睡觉.
*/
//学生类
class Student{
	//姓名
	String name;
	//年龄
	int age;
	//地址
	String address;
	
	//吃饭
	public void eat(){
		System.out.println("吃饭");
	} 
	//学习
	public void study(){
		System.out.println("学习");
	}
	//睡觉
	public void sleep(){
		System.out.println("睡觉");
	}
}

//测试学生类
class StudentDemo{
	public static void main(String[] args){
		//创建学生对象
		Student s = new Student();
		
		//给姓名赋值
		s.name = "林青霞";
		//给年龄赋值
		s.age = 27;
		//给地址赋值
		s.address = "南昌";
		
		//输出学生属性
		System.out.println(s.name+"---"+s.age+"---"+s.address);
		
		//调用学生行为
		s.eat();
		s.study();
		s.sleep();
	}	
}