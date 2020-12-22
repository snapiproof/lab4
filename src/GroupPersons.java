import java.util.ArrayList;

public class GroupPersons extends Person implements Add2GroupPerson{
	private String name;
	public GroupPersons(String name) {
		super(name);
		this.name = name;
	}
	public GroupPersons(String name, Person person1, Person person2) {
		super(name);
		this.name = name;
		persons.add(person1);
		persons.add(person2);
	}
	private ArrayList persons = new ArrayList();
	public void add2groupPerson(Person person) {
		persons.add(person);

	}

}