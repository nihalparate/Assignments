package day2part1.handlers;

import java.util.List;

import day2part1.module.Student;

public class Failed {
	public static List<Student> studentList = operations.studentList;

	public static List<Student> failStudentByAge(Integer age) {
		return studentList.stream().filter(a -> a.getAge() > age).peek(s -> s.setStatus("fail")).toList();
	}
//
//	public static List<Student> getFailedStudent = operations.studentList;
//
//	public static List<Student> getFailedStudent(Integer age, String gender, Integer classId, String city,
//			Integer pincode) {
//		return studentList.stream().filter(s -> s.getAge() > age && s.getGender().equals(gender)
//				&& s.getClass_id().equals(classId) && s.getCity().equals(city) && s.getPincode().equals(pincode))
//				.toList();

	}

