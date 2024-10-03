package Question_2;
import java.util.*;
public class Students implements Comparable<Students>{
	
	private int roll;
	private String name;
	private String city;
	private double marks;
	
	public Students() {
		this(0,"John","Paris",0);
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

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
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

	@Override
	public int hashCode() {
		return Objects.hash(city, marks, name, roll);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return Objects.equals(city, other.city)
				&& Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)
				&& Objects.equals(name, other.name) && roll == other.roll;
	}


	
	

}
