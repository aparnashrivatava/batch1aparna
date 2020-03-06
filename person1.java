import java.util.Scanner;



public class person1
{
	String first_name;
	String last_name;
	String gender;
	int age;
	double weight;
	int phone_no;
	
	//using enumeration
	
	enum xyz
	{
		M,F;
	}
	xyz g;
	
	
	/*void test_gender()
	{
		this.G=G;
	}*/
	//on applying getters and setters

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


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
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

	person1()
	{
	first_name=null;
	last_name=null;
	gender=" ";
	age=0;
	weight=0.00;
	}
	
	person1(String first_name,String last_name,String gender,int age,double weight)
	{
	    this.first_name=first_name;
	    this.last_name=last_name;
	    this.gender=gender;
	    this.age=age;
	    this.weight=weight;
	}
	
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" First Name?");
		first_name=sc.next();
		System.out.println("Last Name?");
		last_name=sc.next();
		System.out.println("Age?");
		age=sc.nextInt();
		System.out.println("Gender?");
		g=xyz.valueOf(sc.next());
		
		System.out.println("Weight?");
		weight=sc.nextFloat();
		System.out.println("Phone?");
		phone_no=sc.nextInt();
		
		
	}
	
    void display()
    {
    	//Scanner sc=new Scanner(System.in);
    	 System.out.println("Person Details:\n__________");
         System.out.println("First Name:"+first_name);
         System.out.println("Last Name:"+last_name);
         System.out.println("Gender:"+g);
         System.out.println("Age:"+age);
         System.out.println("Weight:"+weight);
         System.out.println("Phone_no:"+phone_no);
    }

}
	
	



