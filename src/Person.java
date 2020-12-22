import java.util.ArrayList;
import java.util.Objects;

public class Person extends TextObject implements Stop, Worry, UseLift, UseMegaphone, Shiver, GetCloser, ViewPorthole, UseOxygenMachine, WipeOff, Say, Breathe, Tired, See, Carry, ActionsWithBed, ActionWithClothes {

    public void say(String string){
        System.out.println(name+ " " +string);
    }
    public void UseLift(Rocket.Lift lift, TextObject place){
        this.place = place;
        lift.place = place;
        lift.Open = false;
        System.out.println(this.name + " use " + lift.getName() + " to place " + place.getName());
    }
    public void OpenLift(Rocket.Lift lift){
        lift.Open = true;
        System.out.println(name + " opened " + lift.getName());
    }

    public void UseOxygenMachine() throws NumberFormatException{

    }
    public void WipeOff(Item item, String string){
        System.out.println("Wipe " + string);
    }
    public void ViewPorthole(TextObject object, String description){
        System.out.printf("%s see %s \n ", name, object.getName() + " " + description);
    }
    public void ViewPorthole(TextObject object){
        System.out.printf("%s see %s \n ", name, object.getName());
    }
    public void rest(){
        IsTired = false;
    }
    public boolean isTired(){
        return IsTired;
    }
    private TextObject place;

    public Person(String name, TextObject place) {
        super(name);
        this.name = name;
        this.place = place;
    }
    public void GetCloser(TextObject place){
        System.out.println(this.name + " get closer to " + place.getName());
    }
    public void Shiver(){
        System.out.println(this.name + " shivers");
    }
    public void UseMegaphone(Rocket.ControlCabin.Megaphone megaphone, String text){
        System.out.println(name + " use " + megaphone.getName() + ": " + text.toUpperCase());
    }







    private String name;
	public Person(String name) {
        super(name);
        this.name = name;
    }
    public Person(String name,Boolean IsTired) {
        super(name);
        this.name = name;
        this.IsTired = IsTired;
    }


    public void breathe() {
        System.out.printf("%s breathe \n", name);
    }
    public void breathe(String description) {
        System.out.printf("%s breathe \n", name + " "+ description);
    }
    private boolean IsTired = false;
    public void tired() {
        IsTired = true;
        System.out.printf("%s is tired \n", name);
    }
    public void worry() {
        System.out.printf("%s worries \n", name);
    }
    public void stop(TextObject place1) {
        System.out.printf("%s stopped from %s\n", name, place1);
    }
    public void see(TextObject something) {
        System.out.printf("%s see %s\n", name, something.getName());
    }
    public void carry(Person person, TextObject place) {
	    person.place = place;
        System.out.printf("%s carry %s to %s\n", name, person.name, place.getName());
    }

    public void toBed(Bed bed){
    	System.out.printf("%s in %s \n", name, bed.getName());
    	bed.setSleeper(this);
    }
    public void outBed(Bed bed) throws IsTiredException{
        if (this.IsTired = false) {
            System.out.printf("%s get out off %s \n", name, bed.getName());
            bed.isFree();
        }
        else {
            throw new IsTiredException( name + " try to get out off " + bed.getName() + " but "+ name + " can not do it, because " + name + " is tired \n");
        }
    }

    public void toBedSomebody(Bed bed, Person person){
    	System.out.printf("%s put %s to %s\n",name, person.name, bed.getName());
    	bed.setSleeper(person);
    }

   /* public void removeClothesBySomebody(Person person1, Person person2, Clothes cloth){
        this.clothes.remove(cloth.getName());
        System.out.printf("%s and %s take off %s from %s\n",person1.getName(), person2.getName(), cloth.getName(), this.name);
    }
    public void dressClothesBySomebody(Person person1, Person person2, Clothes cloth){
        this.clothes.add(cloth.getName());
        System.out.printf("%s and %s dress %s to %s\n",person1.getName(), person2.getName(), cloth.getName(), this.name);
    } */


    public void outBedSomebody(Bed bed, Person person){
    	System.out.printf("%s take out %s from %s\n",name, person.name, bed.getName());
    	bed.isFree();
    }
    public void sleep(){
    	System.out.printf("%s sleep\n",name);
	}

    private ArrayList clothes = new ArrayList();
    public void dressClothes(Clothes cloth){
        this.clothes.add(cloth.getName());
        System.out.printf("%s dress %s\n",this.name, cloth.getName());
    }
    public void dressClothesSomebody(Person person, Clothes cloth){
        person.clothes.add(cloth.getName());
        System.out.printf("%s dress %s to %s\n",this.name, cloth.getName(), person.getName());
    }
    public void removeClothes(Clothes cloth){
        this.clothes.remove(cloth.getName());
        System.out.printf("%s remove %s\n",this.name, cloth.getName());
    }
    public void removeClothesSomebody(Person person, Clothes cloth){
        person.clothes.remove(cloth.getName());
        System.out.printf("%s remove %s from %s\n",this.name, cloth.getName(), person.getName());
    }

    public void dressClothes(GroupClothes cloth){
        for (int i = 0; i < cloth.getSize(); i++) {

            this.clothes.add(cloth.groupClothes.get(i));
            System.out.printf("%s dress %s\n", this.name, cloth.groupClothes.get(i).toString());
            cloth.remove4groupClothes(i);
        }
    }
    public void dressClothesSomebody(Person person, GroupClothes cloth){
        for (int i = 0; i < cloth.getSize(); i++) {
            person.clothes.add(cloth.groupClothes.get(i));
            System.out.printf("%s dress %s to %s\n", this.name, cloth.groupClothes.get(i).toString(), person.getName());
        }
        cloth.removeGroup();

    }
    public void removeClothes(GroupClothes cloth){
        this.clothes.remove(cloth.getName());
        System.out.printf("%s remove %s\n",this.name, cloth.toString());
    }
    public void removeClothesSomebody(Person person, GroupClothes cloth){
        person.clothes.remove(cloth.getName());
        System.out.printf("%s remove %s from %s\n",this.name, cloth.toString(), person.getName());

    }

    public String checkClothes(){
        String s = this.name + " wearing: ";
        for (int i = 0; i < clothes.size(); i++) {
            s += (" " + clothes.get(i));
        }

        return s;
    }

}
