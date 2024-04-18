package day2part1.module;

public class Address {
	private Integer id;
	private Integer pin_code;
	private String city;
	private Integer student_id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPin_code() {
		return pin_code;
	}
	public void setPin_code(Integer pin_code) {
		this.pin_code = pin_code;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getStudent_id() {
		return student_id;
	}
	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", pin_code=" + pin_code + ", city=" + city + ", student_id=" + student_id + "]";
	} 
	

}
