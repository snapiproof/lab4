
public interface ActionWithClothes {
	public void dressClothes(Clothes cloth);
	public void dressClothesSomebody(Person person, Clothes cloth);
	public void removeClothes(Clothes cloth);
	public void removeClothesSomebody(Person person, Clothes cloth);

	public void dressClothes(GroupClothes cloth);
	public void dressClothesSomebody(Person person, GroupClothes cloth);
	public void removeClothes(GroupClothes cloth);
	public void removeClothesSomebody(Person person, GroupClothes cloth);

	public String checkClothes();

}	