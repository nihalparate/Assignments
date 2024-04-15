package innogent.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class task2 {
 public static void main(String[] args) {
	  	List<Employee> employeeList = new ArrayList<Employee>();
         
		 employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		 employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		 employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		 employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		 employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		 employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		 employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		 employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		 employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		 employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		 employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		 employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		 employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		 employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		 employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		 employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		 employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
	
		 // Q1:- How many male and female employees are there in the organization?
      
		// countMaleAndFeamle(employeeList);
		 
		//Q2:-
		// Set<String> new_Set = getDistinctDepartment(employeeList);
		// new_Set.forEach(d-> System.out.println(d));
		  
		 //Q3:-
		 //getAvgMaleFemale(employeeList);
		 
		 //Q4:-
		 //Employee e = highestEmployee(employeeList);
		 //System.out.println(e);
		 
		 //Q5:-
		 //List<Employee>emp =  getEmpOf2015(employeeList);
		 //emp.forEach(e-> System.out.println(e));
		 
		 //Q6:-
		 
		 //Q7:-
		  //Map<String,Double> emp =getDeptAvgSalary(employeeList);
		  //emp.entrySet().forEach(a-> System.out.println(a));
		 
		 //Q8:-
		// Employee e = getYoungestEmployee(employeeList);
	    //System.out.println(e);
		 
		 //Q9:-
		// getEmpByGenderInSalesMarketing(employeeList);
		 
		 //Q10:-
		// Map<String,Double> emp = getAvgSalOfMaleAndFemale(employeeList);
		// emp.entrySet().forEach(a-> System.out.println(a));
		 
		 //Q11:-
		// Map<String,List<String>>emp = getEmpByDept(employeeList);
		// emp.entrySet().forEach(a-> System.out.println(a));
		 
		 //Q12:-
		 //getAvgAndTotalSal(employeeList);
		 
		 //Q13:-
		 //getYoungEmployee(employeeList);
		 
		 //Q14:-
		Employee e = getOldestEmployee(employeeList);
		System.out.println(e);
 }
         // Q1:- How many male and female employees are there in the organization?

        public static void countMaleAndFeamle(List<Employee> employees) {
		Long maleCount = employees.stream().filter(s -> s.getGender().equals("Male")).count();
		Long femaleCount = employees.stream().filter(s -> s.getGender().equals("Female")).count();

		System.out.println("Total Male Count: " + maleCount);
		System.out.println("Total Female Count: " + femaleCount);
        }
        
        // Q2:- Print the name of all departments in the organization?
       static List<String> allDept = new ArrayList<String>();
       public static Set<String> getDistinctDepartment(List<Employee> employees) {
	   return employees.stream().map(Employee::getDepartment).collect(Collectors.toSet());
		      
       }
       
       //Q3:-What is the average age of male and female employees?
       public static void getAvgMaleFemale(List<Employee> employees) {
    	Double maleAge = employees.stream().filter(e->e.getGender().equals("Male")).collect(Collectors.averagingLong(Employee::getAge));
   		Double femaleAge = employees.stream().filter(e->e.getGender().equals("Female")).collect(Collectors.averagingLong(Employee::getAge));
   		
   		System.out.println("Male Average Age: "+maleAge);
   		System.out.println("Female Average Age: "+femaleAge);

       }
       
       //Q4:-Get the details of highest paid employee in the organization?
       public static Employee highestEmployee(List<Employee> employees) {
   		return employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
   		 
   	}

       //Q5:-
      // Get the names of all employees who have joined after 2015?
        public static List<Employee> getEmpOf2015(List<Employee> employees) {
   		List<Employee> employee = employees.stream().filter(e -> e.getYearOfJoining() == 2015)
   				.collect(Collectors.toList());

   		return employee;
   	}

//       //Q6:-
//       //Count the number of employees in each department?
//       public static Map<String, Integer> getEmpCountInDept(List<Employee> employees) {
////   		Set<String> allDept = getDistinctDepartment(employees);
////   		Map<String, Integer> mapping = allDept.stream().collect(Collectors.toMap(dept -> dept, dept -> 0));
//   		Map<String, Integer> mapping = new HashMap <String, Integer>();
//
//   		employees.stream().forEach(e -> {
//   			mapping.put(e.getDepartment(), mapping.getOrDefault(e.getDepartment(), 0) + 1);
//   		});
//
//   		return mapping;
//   	}
        
      //Q7:-
      //  What is the average salary of each department?
        public static Map<String, Double> getDeptAvgSalary(List<Employee> employees) {
    	Map<String, Double> mapping = new HashMap<String, Double>();
    	mapping = employees.stream().collect(
    				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
    		return mapping;

        }
        
        //Q8:-
        //Get the details of youngest male employee in the product development department?
        public static Employee getYoungestEmployee(List<Employee> employees) {
    		return employees.stream().min(Comparator.comparingInt(Employee::getAge)).orElse(null);
        }
        
        //Q9:-
        //How many male and female employees are there in the sales and marketing team?
        public static void getEmpByGenderInSalesMarketing(List<Employee> employees) {
    		Map<String, Long> salesDept = employees.stream().filter(e -> e.getDepartment().equals("Sales And Marketing"))
    				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
    		System.out.println(salesDept);
    	}
           
        //Q10:-
        //What is the average salary of male and female employees?
        public static Map<String, Double> getAvgSalOfMaleAndFemale(List<Employee> employees) {
    		return employees.stream()
    				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        }
        
        //Q11:-
        //List down the names of all employees in each department?
        public static Map<String, List<String>> getEmpByDept(List<Employee> employees) {
    		return employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
    				Collectors.mapping(Employee::getName, Collectors.toList())));
    	}
        
        //Q12:- What is the average salary and total salary of the whole organization?																								
    	public static void getAvgAndTotalSal(List<Employee> employees) {
    		Double avgSal = employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));
    		Double totalSal = employees.stream().collect(Collectors.summingDouble(Employee::getSalary));
    		System.out.println("Average Salary =" + avgSal);
    		System.out.println("Total Salary =" + totalSal);
    	}

      //Q13:-  13	Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years?																								
    	public static void getYoungEmployee(List<Employee> employees) {
    		List<Employee> young25 = new LinkedList<Employee>();
    		List<Employee> old25 = new LinkedList<Employee>();
    		employees.stream().forEach(e -> {
    			if (e.getAge() <= 25)
    				young25.add(e);
    			else
    				old25.add(e);
    		});
    		young25.forEach(System.out::println);
    		System.out.println();
    		old25.forEach(System.out::println);
    	}
    	
    	//Q14:-14	Who is the oldest employee in the organization? What is his age and which department he belongs to?																								
    	public static Employee getOldestEmployee(List<Employee> employees) {
    		return employees.stream().max(Comparator.comparingInt(Employee::getAge)).orElse(null);
    	}


}

