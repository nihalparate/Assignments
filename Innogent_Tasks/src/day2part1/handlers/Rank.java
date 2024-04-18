package day2part1.handlers;

import java.util.List;
import java.util.LinkedList;
import java.util.Collection;
import java.util.stream.Collectors;

import day2part1.module.Student;

public class Rank {

	public static List<Student> StudentRanking(List<Student> studentList) {

		List<Student> student = studentList.stream().sorted((a, b) -> (b.getMarks()).compareTo(a.getMarks()))
				.collect(Collectors.toList());

		Integer studentlen = student.size();
		for (int i = 0; i < studentlen; i++) {
			if (i == 0) {
				student.get(i).setStatus("First");
			} else if (i == 1) {
				student.get(i).setStatus("Second");
			} else if (i == 2) {
				student.get(i).setStatus("Third");
			} else if (student.get(i).getMarks() > 50) {
				student.get(i).setStatus("Pass");
			} else {
				student.get(i).setStatus("Fail");
			}
		}
		return student;
	}
}
