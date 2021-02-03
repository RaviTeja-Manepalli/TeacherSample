package Entity;

public class Teacher {
	private String name;
	private String subject;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Teacher(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}

	public Teacher() {

	}

	@Override
	public int hashCode() {

		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Teacher teacher = (Teacher) obj;
		return (name != teacher.name);
	}

}
