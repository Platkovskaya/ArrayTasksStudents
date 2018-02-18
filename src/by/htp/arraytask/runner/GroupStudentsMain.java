package by.htp.arraytask.runner;

import by.htp.arraytask.model.Group;
import by.htp.arraytask.model.Student;

public class GroupStudentsMain {

	public static void main(String[] args) {

		Group group1 = new Group("Management");

		Student s1 = new Student("Ivan", 24, 2011);
		Student s2 = new Student("Nikita", 19, 2013);
		Student s3 = new Student("Irina", 34, 2015);
		Student s4 = new Student("Masha", 18, 2014);
		Student s5 = new Student("Ivan", 31, 2011);

		Student s6 = new Student("Masha", 18, 2011);
		Student s7 = new Student("Ivan", 19, 2014);
		Student s8 = new Student("Katya", 28, 2015);
		Student s9 = new Student("Gosha", 22, 2012);
		Student s10 = new Student("Ivan", 18, 2011);

		Student s11 = new Student("Pavel", 25, 2011);
		Student s12 = new Student("Olga", 19, 2014);
		Student s13 = new Student("Irina", 26, 2015);
		Student s14 = new Student("Dima", 18, 2011);
		Student s15 = new Student("Vika", 19, 2012);

		Student[] mStudent = new Student[] { s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15 };

		group1.setStudentsToGroup(mStudent);
		group1.showStudent();
		group1.showAverageAge();
		group1.showEnrolledInSomeYear(2015);
		group1.showMostPopularYear();
		group1.showStudentsWithBubbleSort();
		group1.showStudentsWithInsertionSorting();
		group1.showStudentsWithSortingChoice();
	}
}
