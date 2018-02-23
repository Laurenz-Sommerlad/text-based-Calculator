
public class Person {

	public int alter;
	public String name;
	public String vorName;
	
	public Person(int alter, String name, String vorName) {
		this.alter = alter;
		this.name = name;
		this.vorName = vorName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) {
			return false;
		}
		Person person2 = (Person) obj;
		return this.alter == person2.alter && this.name.equals(person2.name) && this.vorName.equals(person2.vorName);
	}
}
