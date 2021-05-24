package Casting;

public class PersonST {

	  private String name;
	  private String eyeColour;

	  public static int numberOfPeople;

		public void Person(String name, String colour) {
			this.name = name;
	        this.eyeColour = colour;
	        numberOfPeople++;
		}

		public String getName() {
			return name;
		}

		public String getEyeColour() {
			return eyeColour;
		}

		public static void setNumberOfPeople(int numberOfPeople) {
			PersonST.numberOfPeople = numberOfPeople;
		}
}

