package day2part1.handlers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import day2part1.module.Address;
import day2part1.module.Class;
import day2part1.module.Student;

public class operations {
	public static List<Student> studentList = new ArrayList<Student>(100);
	public static List<Class> classList = new ArrayList<Class>(100);
	public static List<Address> addressList = new ArrayList<Address>(100);

	public static void main(String[] args) throws IOException {
//			upload the csv data files
		uploadData.uploadStudent(new File("C:\\Users\\DELL\\Desktop\\student.csv"));
		uploadData.uploadClass(new File("C:\\Users\\DELL\\Desktop\\Class.csv"));
		uploadData.uploadAddress(new File("C:\\Users\\DELL\\Desktop\\Address.csv"));

		// Filter By Gender
		// List<Student> gender = FilterData.filterByGender(studentList, 'F');
		// gender.forEach(System.out::println);

		// Filter By City
		// List<Student> city = FilterData.filterByCity("indore");
		// city.forEach(System.out::println);

		// Filter By Pincode
		// List<Student> pincode = FilterData.filterByPincode(452002);
		// pincode.forEach(System.out::println);

		// Filter By Age
		// List<Student> filterage = FilterData.filterByAge(studentList,11);
		// filterage.forEach(System.out::println);

//	       Filter By Class
		// List<Student> c= FilterData.filterByClass('A');
		// c.forEach(System.out::println);

//			1.Find all students of pincode X(ex X = 482002). I can pass different filters like gender, age, class
		// List<Student> pincode = FilterData.filterByPincode(482002);
		// pincode.forEach(System.out::println);

		// Pincode Filtered by gender
		// List<Student> Gender = FilterData.filterByGender(studentList, 'F');
		// Gender.forEach(System.out::println);

//	             // Pincode Filtered by Age
		// List<Student> age = FilterData.filterByAge(pincode, 22);
		// age.forEach(System.out::println);

//		;	2.Find all students of city ex X = Indore. I can pass different filters like gender, age, class
//			List<Student> city = FilterData.getByCity("indore", 'F', 10, 1);
//	              city.forEach(System.out::println);

//			3.marks < 50 failed else passed
//			Give ranks to highest mark achievers.
//			Highest marks - First
//			Third Highest marks - third
//			Rest of all pass / fail
		// List<Student> rank = Rank.StudentRanking(studentList);
		// rank.forEach(System.out::println);

//			4.Get the passed students. I can pass different filters like gender, age, class, city, pincode
		// List<Student> passedStudent = pass.StudentPassed(studentList, 'F', 11, 1,
		// 442002,"indore");
		// passedStudent.forEach(System.out::println);

//			5.Get the failed students. I can pass different filters like gender, age, class, city, pincode
		// List<Student> failedStudent = failedStudent.getFailStudent(studentList, 'F',
		// 35, 3, "mumbai", 482002);
		// failedStudent.forEach(System.out::println);

//			6.Find all student of class X (ex X = A).  I can pass different filters like gender, age, class, city, pincode
		// List<Student> classStudent = ClassStudent.getStudentByClass(studentList, 'A',
		// 'F', 35, "indore", 452002);
		// classStudent.forEach(System.out::println);

//			7.It should fail if student record is having age > 20.
		// List<Student> failedStudentByAge = Failed.failStudentByAge(20);
		// failedStudentByAge.forEach(System.out::println);

//			8.I should be able to delete student. After that it should delete the respective obj from Address & Student.
		// System.out.println(deleteStudent(1));
		// studentList.forEach(System.out::println);
		// addList.forEach(System.out::println);

//			9.I should be able to delete student. After that it should delete the respective obj from Address & Student.

//			10	If there is no student remaining in that class. Class should also be deleted.
//			System.out.println(deleteClass());
//			classList.forEach(System.out::println);

//			11	I should be able to read paginated students.
//			like : read female students first 1-9
//			like : read female students first 7-8 order by name	
//			like : read female students first 1-5 order by marks
//			like : read female students first 9-50 order by marks
//		 getSortedStudentByOrder(studentList, 'F', 1, 4, "marks",
//		 false).forEach(System.out::println);;

		// List<Student> (studList, Character gender, int start, int end, String sortBy,
		// boolean ReverseOrder)

	}

}
