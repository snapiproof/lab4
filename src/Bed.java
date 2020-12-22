
public class Bed extends Item {
	private Person sleeper;
	private boolean free;

	public void setSleeper(Person sleeper){
		free = false;
		this.sleeper = sleeper;
	}

	public String getSleeper(){
		if (free == true) {
			return "Nobody";}
			else return sleeper.getName();
	}

	public void isFree(){
		free = true;
	}

	protected String name;
	public Bed(String name) {
        super(name);
        this.name = name;
    }	
}