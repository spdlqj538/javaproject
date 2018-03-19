
public class Student {
	private int number;
	private String name;
	private int age;
	
	Student() {
		number = 100;
		name = "New Student";
		age = 18;
	}

		@Override
		public String toString() {
			return "Student ['number='+ number +,' name =' + name +', age= '+ age +']";
		}


}
