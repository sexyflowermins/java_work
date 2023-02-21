package ch04;

public class Course {
	private int courserId;
	private String name;
	private String description;

	public Course(int courserId, String name, String description) {
		this.courserId = courserId;
		this.name = name;
		this.description = description;
	}

	public int getCourserId() {
		return courserId;
	}

	public void setCourserId(int courserId) {
		this.courserId = courserId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
