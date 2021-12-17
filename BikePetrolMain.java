package practiceQuestions;

public class BikePetrolMain {
	public static void main(String[] args) {
		System.out.println(PetrolFilling.fillPetrol(new Bike("A",60), -1000));
		System.out.println(PetrolFilling.fillPetrol(new Bike("A",60), 75));
		System.out.println(PetrolFilling.fillPetrol(new Bike("A",60), 50));
	}
}
