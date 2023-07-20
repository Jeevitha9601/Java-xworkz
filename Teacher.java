class Teacher{
	String subject;
	int age;
	String name;
	String syllabus;
	String students;
	
	Teacher(){
		
	}
	public static void main(String[] args){
		Teacher teacher=new Teacher();
		System.out.println(teacher.subject);
		System.out.println(teacher.age);
		System.out.println(teacher.syllabus);
		System.out.println(teacher.name);
		System.out.println(teacher.students);
		
		teacher.subject="science";
		teacher.age=22;
		teacher.name="jeevitha";
		teacher.syllabus="state";
		teacher.students="32 Students";
		System.out.println(teacher.subject);
		System.out.println(teacher.age);
		System.out.println(teacher.syllabus);
		System.out.println(teacher.name);
		System.out.println(teacher.students);
		
		Teacher teacher1=new Teacher();
		System.out.println(teacher1.subject);
		System.out.println(teacher1.age);
		System.out.println(teacher1.syllabus);
		System.out.println(teacher1.name);
		System.out.println(teacher1.students);
		
		teacher1.subject="Maths";
		teacher1.age=30;
		teacher1.name="mamatha";
		teacher1.syllabus="CBSC";
		teacher1.students="54 Students";

		System.out.println(teacher1.subject);
		System.out.println(teacher1.age);
		System.out.println(teacher1.syllabus);
		System.out.println(teacher1.name);
		System.out.println(teacher1.students);

		
	}
}