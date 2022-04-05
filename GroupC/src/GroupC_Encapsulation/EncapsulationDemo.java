package GroupC_Encapsulation;

public class EncapsulationDemo {
	
	
	private int age = 25;
	private int salary = 160000;
	
	public int getAge() {
		return age;
		
	}

	public void setAge(int age) {
		
		if(age > 18) {
			this.age = age;
		
		}
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

	}

}
