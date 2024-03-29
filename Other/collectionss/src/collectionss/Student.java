package collectionss;

public class Student implements Comparable<Student> {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("{id: %d, name: %s}", this.id, this.name);
	}

	@Override
	public int compareTo(Student that) {
		// TODO Auto-generated method stub
		// 오름 차순 정렬
		return Integer.compare(this.id, that.id);
	}

}
