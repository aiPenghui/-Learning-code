/*
	学生类:
		属性:
			姓名,年龄,性别。
		行为:
			吃饭,学习,睡觉。
*/
class Student{
	//姓名
	String name;
	//年龄
	int age;
	//性别
	String sex;
	
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