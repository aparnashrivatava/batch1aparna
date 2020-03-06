

public class person 
{
String first_name;
String last_name;
char gender;
int age;
double weight;


public String getFirst_name() {
	return first_name;
}


public void setFirst_name(String first_name) {
	this.first_name = first_name;
}


public String getLast_name() {
	return last_name;
}


public void setLast_name(String last_name) {
	this.last_name = last_name;
}


public char getGender() {
	return gender;
}


public void setGender(char gender) {
	this.gender = gender;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public double getWeight() {
	return weight;
}


public void setWeight(double weight) {
	this.weight = weight;
}


public static void main (String args[])
{
	person p=new person();
	
	p.setFirst_name("Divya");
	p.setLast_name("Bharathi");
	p.setAge(20);
	p.setGender('F');
	p.setWeight(85.55);
	
	System.out.println("Person Details:\n_____________________");
	System.out.println("First Name:" + p.getFirst_name());
	System.out.println("Last Name:" + p.getLast_name());
	System.out.println("Gender:" + p.getGender());
	System.out.println("Age:" + p.getAge());
	System.out.println("Weight:" + p.getWeight());
	
	
	
}

}
