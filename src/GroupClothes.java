import java.util.ArrayList;

public class GroupClothes extends Clothes implements ActGroupClothes {
	private String name;
	public GroupClothes(String name) {
		super(name);
		this.name = name;
	}
	public GroupClothes(String name, Clothes clothes1, Clothes clothes2, Clothes clothes3, Clothes clothes4, Clothes clothes5, Clothes clothes6) {
		super(name);
		this.name = name;
		groupClothes.add(clothes1);
		groupClothes.add(clothes2);
		groupClothes.add(clothes3);
		groupClothes.add(clothes4);
		groupClothes.add(clothes5);
		groupClothes.add(clothes6);
	}
	protected ArrayList groupClothes = new ArrayList();

	public int getSize(){
		return this.groupClothes.size();
	}



	public void add2groupClothes(Clothes clothes) {
		groupClothes.add(clothes);
	}
	public void removeGroup(){
		this.groupClothes.clear();
	}

	public void remove4groupClothes(Integer clothes) {
		this.groupClothes.remove(clothes);
	}
	public String checkGroup(){
		String s = this.name + " is: ";
		for (int i = 0; i < groupClothes.size(); i++) {
			s += (" " + groupClothes.get(i));
		}
		if (groupClothes.size() == 0) s += "empty";
		return s;
	}
}