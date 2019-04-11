package chapter09;
/* J09_14.java    */
/* Example of Argumented Method */

class Student09 {
	public int  Roll;	
	protected String Name;
	private float Mark;	

  public Student09() {
	  System.out.println("Default constructor Student09() called");
  }
	 
	public Student09(int Roll, String Name, float Mark) {
		this.Roll = Roll;
		this.Name = Name; 
		this.Mark = Mark;
	}

	void setData(int Roll, String Name, float Mark) {
		this.Roll = Roll;
		this.Name = Name; 
		this.Mark = Mark;
	}

	void display(){
		System.out.println("Roll is : " + this.Roll);                 
		System.out.println("Name is : " + this.Name);                 
		System.out.println("Mark is : " + this.Mark) ;
	}
}  

public class J09_14 {
	public static void main(String args[]){
		Student09 ritu = new Student09(101, "Ritu", 85);	// Creating object
//		ritu.display();	
		
		Student09 mamun = new Student09();	
		mamun.setData(102, "Mamunur Rashid", 55.5f);

		ritu.display();	
		mamun.display();
	
		Student09 faisal = new Student09(101, "Faisal", 85);	// Creating object
//		
	}
} 
