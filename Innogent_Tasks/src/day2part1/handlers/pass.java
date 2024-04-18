package day2part1.handlers;

//import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.List;

import day2part1.module.Student;

public class pass {

	public static List<Student> StudentPassed(List<Student> studentList, Character gender, Integer age, Integer classId,
			Integer pincode, String city) {
		List<Student> rankStudent = Rank.StudentRanking(studentList);
		List<Student> passedStudent = FilterData.passStuFilterByGenderAgeClass(rankStudent, age, classId, gender);
		List<Integer> studentId = FilterData.passStuIdByCityPincode(city, pincode);
		List<Student> student = new ArrayList<Student>();
		for (Student s : passedStudent) {
			if (studentId.contains(s.getId())) {
				student.add(s);
			}
		}
		return student;

	}
}
