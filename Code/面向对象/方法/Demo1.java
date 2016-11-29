class Student{
	public void show(){
		System.out.println("Œ“∞Æ—ßœ∞£°");
	}
}

class ArgsTest{
	public void method(Student s){
		s.show();
	}
}

class Demo1{
	public static void main(String[] args){
		ArgsTest a = new ArgsTest();
		Student s = new Student();
		a.method(s);
	}
}