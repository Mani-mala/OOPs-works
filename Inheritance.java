class Person 
{
	    String name = "Mani";
	    int age = 25;
}
class Employee extends Person
{
	    String jobTitle = "Software Developer";
	    void display()
	    {
	        System.out.println("Name: " + name);      
	        System.out.println("Age: " + age);         
	        System.out.println("Job Title: " + jobTitle); 
	    }
public class Inheritance {
	    public static void main(String[] args) {
	        Employee emp = new Employee();
	        emp.display();
	    }
	}

}
