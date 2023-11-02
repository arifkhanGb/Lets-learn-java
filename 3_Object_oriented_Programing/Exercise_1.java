package ThirdPackage;

class person{
	private String name, address;
	private int age;
	
	//method to get Information of a person
	public void setInfo(String name, int age, String address) {
		this.name = name;// this is used to refer current class instance.
		this.age = age;
		this.address = address;
	}
	
	//Display the Person`s Info
	public void getInfo() {
		System.out.println("Name = "+name);
		System.out.println("Age = " +age);
		
	}
}

public class Exercise_1 {

	public static void main(String[] args) {
		person person1 = new person();
		
		System.out.println("first person");
		person1.setInfo("jack", 18, "london");
		person1.getInfo();
		System.out.println();
		
		System.out.println("second person");
		person person2 = new person();
		person2.setInfo("sparrow", 30, "paris");
		person2.getInfo();
		System.out.println();
		
		System.out.println("Third person");
		person person3 = new person();
		person3.setInfo("mick", 28, "newziland");
		person3.getInfo();
		
		

	}

}
