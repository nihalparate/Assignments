package day2part1.handlers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import day2part1.module.Address;
import day2part1.module.Class;
import day2part1.module.Student;

public class uploadData {
	public static void uploadStudent(File file) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = "";

		// skipping the first line
		line = br.readLine();

		while ((line = br.readLine()) != null) {
			String[] studentArr = line.split(",");
			Student student1 = new Student();
			student1.setId(Integer.parseInt(studentArr[0]));
			student1.setName(studentArr[1]);
			student1.setClass_id(Integer.parseInt(studentArr[2]));
			student1.setMarks(Integer.parseInt(studentArr[3]));
			student1.setGender(studentArr[4].toCharArray()[0]);
			student1.setAge(Integer.parseInt(studentArr[5]));
			operations.studentList.add(student1);
		}

//			studentList.stream().forEach(System.out::println);

		br.close();
	}

	public static void uploadClass(File file) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(file));

		// skipping the first line
		String line = br.readLine();

		while ((line = br.readLine()) != null) {
			String[] classArr = line.split(",");
			Class classes = new Class();
			classes.setId(Integer.parseInt(classArr[0]));
			classes.setName(classArr[1].toCharArray()[0]);
			operations.classList.add(classes);
		}
//			classList.stream().forEach(System.out::println);
		br.close();
	}

	public static void uploadAddress(File file) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(file));

		// skipping the first line
		String line = br.readLine();

		while ((line = br.readLine()) != null) {
			String[] addArr = line.split(",");
			Address add = new Address();
			add.setId(Integer.parseInt(addArr[0]));
			add.setPin_code(Integer.parseInt(addArr[1]));
			add.setCity(addArr[2]);
			add.setStudent_id(Integer.parseInt(addArr[3]));
			operations.addressList.add(add);
		}

//			addressList.stream().forEach(System.out::println);
		br.close();
	}
}
