package faangm;

import java.util.Objects;

public class Student implements Comparable<Student> {
	int rollNo;
	String name;
	
	public Student(String name,int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(rollNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollNo == other.rollNo;
	}

	@Override
	public int compareTo(Student o) {
//		return this.name.compareTo(that.name);
		return this.rollNo - o.rollNo;
	}
}
