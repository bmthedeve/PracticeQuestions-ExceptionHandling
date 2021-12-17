package practiceQuestions;

public class PetrolFilling {
	public static String fillPetrol(Bike bike, int noOfLitres)  {
		if(noOfLitres<=0 || noOfLitres>bike.getTankCapacity()) {
			try {
				throw new OverflowException("tank capacity is overflown");
			}
			catch(OverflowException oe) {
				return oe.getMessage();
			}
		}
		
		else {
			return "tank filled successfully"; 
		}
	}
}
