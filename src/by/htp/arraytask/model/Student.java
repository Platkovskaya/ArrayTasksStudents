package by.htp.arraytask.model;

public class Student {
	private String nameOfStudent;
	private int ageOfStudent;
	private int yearOfEnrollment;

	public Student(String nameOfStudent, int ageOfStudent, int yearOfEnrollment) {
		this.nameOfStudent = nameOfStudent;
		this.ageOfStudent = ageOfStudent;
		this.yearOfEnrollment = yearOfEnrollment;
	}

	public void setNameOfStudent(String nameOfStudent) {
		this.nameOfStudent = nameOfStudent;
	}

	public String getNameOfStudent() {
		return nameOfStudent;
	}

	public void setAgeOfStudent(int ageOfStudent) {
		this.ageOfStudent = ageOfStudent;
	}

	public int getAgeOfStudent() {
		return ageOfStudent;
	}

	public void setYearOfEnrollment(int yearOfEnrollment) {
		this.yearOfEnrollment = yearOfEnrollment;
	}

	public int getYearOfEnrollment() {
		return yearOfEnrollment;
	}
	
	 public String toString() {
	        return "Student: Name Of Student - '" + nameOfStudent + "' , Age Of Student - '" + ageOfStudent + "' , Year Of Enrollment - '" + yearOfEnrollment + "'";
	    }

}
