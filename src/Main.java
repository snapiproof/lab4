import java.util.ArrayList;

public class Main {
	public static void main(String[] args){

		Rocket rocket = new Rocket("Rocket");
		Rocket.Cabin cabin = rocket.new Cabin("Cabin");
		Rocket.Lift lift = rocket.new Lift("Lift", cabin);
		Rocket.ControlCabin controlcabin = rocket.new ControlCabin("Control cabin");
		Rocket.ControlCabin.Megaphone megaphone = controlcabin.new Megaphone("Megaphone");
		Rocket.Porthole porthole = rocket.new Porthole("Porthole", cabin);
		Rocket.Tail tail = rocket.new Tail("Tail part of rocket");

		Person Pilulkin = new Person("Doctor Pilulkin", cabin);
		OxygenMachine OxygenMachine = new OxygenMachine("OxygenMachine");
		Clothes handkerchief = new Clothes("handkerchief");

		Person Neznayka = new Person("Neznayka", true);

		Bed bed1 = new Bed("Bed");

		Person Fooksia = new Person("Fooksia");
		Person Seledochka = new Person("Seledochka");
		GroupPersons FooksiaSeledochka = new GroupPersons("Fooksia and Seledochka", Fooksia, Seledochka);

		Pilulkin.say("Order Neznayka to use OxygenMachine");
		Pilulkin.WipeOff(handkerchief, "face");
		See Somebody = new See(){
			public void see(TextObject porthole){
				System.out.printf("Somebody see %s\n", porthole.getName() + " and say");
			}
		};
		Somebody.see(porthole);
		try {
			Neznayka.outBed(bed1);
		} catch(IsTiredException e) {
			System.out.println(e.getMessage());
		}
		FooksiaSeledochka.outBedSomebody(bed1, Neznayka);
		FooksiaSeledochka.carry(Neznayka, porthole);
		while (Neznayka.isTired() != true) {
			Item Earth = new Item("Earth");
			Neznayka.ViewPorthole(Earth, "Now it was visible not as from the moon, but in the form of a huge sphere with light spots of continents and dark seas and oceans");
			Item GlowingHalo = new Item("Glowing Halo");
			Neznayka.ViewPorthole(GlowingHalo, "which enveloped the whole Earth like a warm soft duvet");
			rocket.GetCloser(Earth);
			Neznayka.ViewPorthole(Earth, "it was no longer possible to fully comprehend");
			Neznayka.breathe();
			Neznayka.tired();
		}
		Seledochka.see(Neznayka);
		Fooksia.see(Neznayka);
		FooksiaSeledochka.carry(Neznayka, bed1);
		FooksiaSeledochka.toBedSomebody(bed1, Neznayka);

		Clothes pants = new Clothes("pants", Color.CANARY);
		Clothes shirt = new Clothes("shirt", Color.ORANGE);
		Clothes stockings = new Clothes("stockings");
		Clothes boots = new Clothes("boots");
		Clothes tie = new Clothes("tie", Color.GREEN);
		Clothes hat = new Clothes("hat", Color.BLUE);

		GroupClothes group1 = new GroupClothes("group1", pants, shirt, stockings, boots, tie, hat);
		System.out.println(group1.checkGroup());
		FooksiaSeledochka.dressClothesSomebody(Neznayka, group1);
		System.out.println(Neznayka.checkClothes());
		System.out.println(group1.checkGroup() + "\n");

		Neznayka.Shiver();
		Neznayka.breathe("feverously");
		Pilulkin.see(Neznayka);
		Pilulkin.say("");
		FooksiaSeledochka.outBedSomebody(bed1, Neznayka);
		FooksiaSeledochka.carry(Neznayka, lift);
		Pilulkin.OpenLift(lift);
		GroupPersons group4 = new GroupPersons("Fooksia, Seledochka, Doctor Pilulkin and Neznayka", Fooksia, Seledochka);
		group4.add2groupPerson(Neznayka);
		group4.add2groupPerson(Pilulkin);
		group4.UseLift(lift, tail);

		Person Vintik = new Person("Vintik", tail);
		Person Shpuntik = new Person("Shpuntik", tail);
		Person Zvezdochkin = new Person("Professor Zvezdochkin", tail);
		GroupPersons groupX = new GroupPersons("Other");
		Vintik.UseLift(lift, tail);
		Shpuntik.UseLift(lift, tail);
		Zvezdochkin.UseLift(lift, tail);
		groupX.UseLift(lift, tail);
		Item door = new Item("Door");
		FooksiaSeledochka.stop(door);
		Neznayka.see(FooksiaSeledochka);
		Neznayka.worry();
		Person Znaika = new Person("Znaika", controlcabin);
		Znaika.UseMegaphone(megaphone, "something");
	}
}
