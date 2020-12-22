
public class Clothes extends Item {
	private String name;
	private String typeCloth;
	private Color color;
	public Clothes(String name, Color color) {
        super(name);
        this.name = name;
        this.color = color;
    }
    public Clothes(String name) {
        super(name);

    }


	public void setTypeClothes(String typeClothes){
		this.typeCloth = typeCloth;
	}
	public String getTypeClothes(){
		return this.typeCloth;
	}
}