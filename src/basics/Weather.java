package basics;

public class Weather {
	public static void main(String[] args) {
		int temparature = 45;
		String sunCondition = "Sunny";
		
		if (temparature > 80) {
			System.out.println("It's pleasant. Wear shorts and i-shirts");
		}else if (temparature >60 && sunCondition == "Sunny") {
			System.out.println("It's little cooler. Perhaps wear a long-sleeve shirt and jeans.");
		}else if ((temparature > 50) || (sunCondition == "Overcast")) {
			System.out.println("This is cool day, make sure to wear warmer chlothes.");
		}else {
			System.out.println("Looks like a cold day. Bring a sweater");
		}
		System.out.println("The program is ending...........");
	}
}
