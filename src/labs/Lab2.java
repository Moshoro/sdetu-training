package labs;

public class Lab2 {

	public static void main(String[] args) {
		Student stu1 = new Student("Janelle","321456789"); 
		Student stu2 = new Student("Thomas","45687956"); 
		Student stu3 = new Student("Elizabeth","615326574"); 
		
		stu1.enroll("Math151");
		stu1.enroll("Eng255");
		stu1.enroll("His211");
		
		stu1.showCourses();
//		stu1.checkBalace();
		stu1.pay(600);
//		stu1.checkBalace();
		System.out.println(stu1.toString());

	}

}

class Student{
	private String name;
	private String ssn;
	private static  int iD = 1000;
//	private String emailID;
	private String email;
	private String userID;
	public String phone;
	public String city;
	public String state;
	private String course = "";
	private static final int costofCourse = 800;
	private int balance = 0;
	
	public Student(String name, String ssn) {
		iD ++;
		this.name = name;
		this.ssn = ssn;
		setUserID();
		setEmail();
		
	}
	
	private void setEmail() {
		email = name.toLowerCase()+"."+ iD + "@email.com";
		System.out.println("Your email: " + email);
	}
	
	public void setUserID() {
		int max = 9000;
		int min = 1000;
		int random =(int) (Math.random() * (max - min) );
		random = random + min;
		userID =  iD +""+ random + ssn.substring(5);
		System.out.println(userID);
		
	}
	
	public void enroll(String course) {
		this.course = this.course + " " + course; 
		balance +=  costofCourse;;
		
	}

	public void pay(int amount) {
		System.out.println("Student Paid fees R" + amount);
		balance -= amount;
		
	}
	public void checkBalace() {
		System.out.println("Bala nce: R" + balance);
	}
	public void showCourses() {
		System.out.println(course);
	}

	@Override
	public String toString() {
		return "[Name: "+ name + " ]\n[Courses:" + course + "]\nBalance: " + balance +" ]";
	}

	
}
