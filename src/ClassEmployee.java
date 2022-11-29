class employee{
	int id;
	String firstName;
	String lastName;
	double salary;
	
	employee(int i,String f,String l,int s){
		id=i;
		firstName=f;
		lastName=l;
		salary=s;
	}
	int getID() {
	return id;
    }
	String getFirstName() {
		return firstName;
	}
	String getLastName() {
		return lastName;
	}
	String getName() {
		return firstName+" "+lastName;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(int s) {
		salary=s;
	}
	double getAnnualSalary() {
		return 12*salary;
	}
	double raiseSalary(double percent) {
		return salary=(salary*percent/100)+salary;
		
	}
	public String toString() {
		return "Employee[id="+id+",firstName="+firstName+",lastName="+lastName+",Salary="+salary+"]";
		}
}
public class ClassEmployee {
	public static void main(String args[]) {
		employee E1=new employee(1,"Jhansy","K",30000);
		double AnualSalary;
		double RaiseSalary;
		System.out.println(E1.getID());
		System.out.println(E1.getFirstName());
		System.out.println(E1.getLastName());
		System.out.println(E1.getSalary());
		System.out.println(E1);
		AnualSalary=E1.getAnnualSalary();
		System.out.println(AnualSalary);
		RaiseSalary=E1.raiseSalary(12.5);
		System.out.println(RaiseSalary);
		E1.setSalary(4000);
		System.out.println(E1);
		
				
		
		
	}
}
