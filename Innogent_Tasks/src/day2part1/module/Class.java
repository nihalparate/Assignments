package day2part1.module;

public class Class {

	private Integer id;
	private Character name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Character getName() {
		return name;
	}

	public void setName(char name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Class [id=" + id + ", name=" + name + "]";
	}

}
