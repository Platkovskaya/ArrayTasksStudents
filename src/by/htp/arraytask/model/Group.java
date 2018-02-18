package by.htp.arraytask.model;

public class Group {

	private String nameOfGroup;
	private Student[] studentsInGroup = new Student[15];

	public Group(String nameOfGroup) {
		this.nameOfGroup = nameOfGroup;
	}

	public void setNameOfGroup(String nameOfGroup) {
		this.nameOfGroup = nameOfGroup;
	}

	public String getNameOfGroup() {
		return nameOfGroup;
	}

	public void setStudentsToGroup(Student[] studentsToGroup) {
		if (studentsToGroup.length < 5 || studentsToGroup.length > 15) {
			throw new RuntimeException("✖   Group '" + nameOfGroup + "' should consist of '5' to '15' students!");
		}
		this.studentsInGroup = studentsToGroup;
	}

	public Student[] getStudentsInGroup() {
		return studentsInGroup;
	}

	public void showStudent() {
		checkCountInGroup();

		for (int i = 0; i < studentsInGroup.length; i++) {
			System.out.println(studentsInGroup[i]);
		}

	}

	public void showAverageAge() {
		checkCountInGroup();
		int summOfAge = 0;
		for (int i = 0; i < studentsInGroup.length; i++) {
			summOfAge += studentsInGroup[i].getAgeOfStudent();
		}
		int averageAge = summOfAge / studentsInGroup.length;
		System.out.println("\n☆ Average age in group '" + getNameOfGroup() + "' is: '" + averageAge + "'.");

	}

	public void showEnrolledInSomeYear(int year) {
		checkCountInGroup();
		int countOfStudents = 0;
		for (int i = 0; i < studentsInGroup.length; i++) {
			if (studentsInGroup[i].getYearOfEnrollment() == year) {
				countOfStudents++;
			}
		}
		System.out.println("\n☆ In '" + year + "' was enrolled: '" + countOfStudents + "' students.");
	}

	public void showMostPopularYear() {
		checkCountInGroup();
		int savedYear = 0;
		int savedCount = 0;
		for (int i = 0; i < studentsInGroup.length; i++) {
			int currentYear = studentsInGroup[i].getYearOfEnrollment();
			int currentCount = 1;

			for (int j = i + 1; j < studentsInGroup.length; j++) {
				if (studentsInGroup[i].getYearOfEnrollment() == currentYear) {
					currentCount++;
				}
			}
			if (currentCount > savedCount) {
				savedYear = currentYear;
				savedCount = currentCount;
			}
		}
		System.out.println("\n☆ Most count of students('" + savedCount + "') was enrolled in '" + savedYear + "'.");
	}

	public void showStudentsWithBubbleSort() {

		Student[] sortedStudents = studentsInGroup;

		for (int i = sortedStudents.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (sortedStudents[j].getAgeOfStudent() > sortedStudents[j + 1].getAgeOfStudent()) {
					Student tmp = sortedStudents[j];
					sortedStudents[j] = sortedStudents[j + 1];
					sortedStudents[j + 1] = tmp;
				}
			}

		}
		System.out.println("\n☆ Group '" + getNameOfGroup() + "' will be displayed with 'bubble sort' by age:");
		for (int i = 0; i < sortedStudents.length; i++) {
			System.out.println(getStudentsInGroup()[i].toString());
		}

	}

	public void showStudentsWithInsertionSorting() {
		Student[] sortedStudents = studentsInGroup;
		for (int j = 1; j <= sortedStudents.length - 1; j++) {
			Student tmp = sortedStudents[j];
			for (int i = j - 1; i >= 0 && sortedStudents[i].getAgeOfStudent() < tmp.getAgeOfStudent(); i--) {
				sortedStudents[i + 1] = sortedStudents[i];
				sortedStudents[i] = tmp;
			}

		}

		System.out.println("\n☆ Group '" + getNameOfGroup() + "' will be displayed with 'insert sort' by age:");
		for (int i = 0; i < sortedStudents.length; i++) {
			System.out.println(getStudentsInGroup()[i].toString());
		}
	}

	public void showStudentsWithSortingChoice() {
		
		Student[] sortedStudents = studentsInGroup;
		
		for (int min = 0; min < sortedStudents.length - 1; min++) {
			int tmp = min;
			for (int j = min + 1; j < sortedStudents.length; j++) {
				if (sortedStudents[j].getAgeOfStudent() < sortedStudents[tmp].getAgeOfStudent()) {
					tmp = j;
				}
			}
			Student sTmp = sortedStudents[min];
			sortedStudents[min] = sortedStudents[tmp];
			sortedStudents[tmp] = sTmp;
		}

		System.out.println("\n☆ Group '" + getNameOfGroup() + "' will be displayed with 'sorting choice' by age:");
		for (int i = 0; i < sortedStudents.length; i++) {
			System.out.println(getStudentsInGroup()[i].toString());
		}
	}

	private void checkCountInGroup() {
		if (studentsInGroup[0] == null) {
			throw new RuntimeException("✖ Group '" + nameOfGroup + "' is empty!");
		}
	}

}
