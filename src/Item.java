
public class Item extends TextObject {
	private String sizeItem;
	private Color color;
	private String type;
	public void setSizeItem(String size){
		this.sizeItem = size;
	}
	public void getSizeItem(){
		System.out.println("sizeItem " + sizeItem);
	}

	public void setColor(Color color){
		this.color = color;
	}
	public void getColor(){
		System.out.println("color " + color);
	}

	public void setType(String type){
		this.type = type;
	}
	public void getType(){
		System.out.println("type " + type);
	}

	protected String name;
	public Item(String name) {
        super(name);
        this.name = name;
    }
    private TextObject place;
	public Item(String name, TextObject place) {
		super(name);
		this.name = name;
		this.place = place;
	}

}