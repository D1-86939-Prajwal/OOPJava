package Question1;

public class Students implements Comparable<Students>{
	
	private int roll;
	private String name;
	private String city;
	private double marks;
	
	public Students() {
		this(0,"abc","def",0);
	}
	
	public Students(int roll, String name, String city, double marks) {
		this.roll = roll;
		this.setName(name);
		this.setCity(city);
		this.setMarks(marks);
	}

	@Override
	public String toString() {
		return "Students [roll=" + roll + ", name=" + getName() + ", city=" + getCity() + ", marks=" + getMarks() + "]";
	}

	@Override
	public int compareTo(Students o) {
 		return this.roll - o.roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

}
