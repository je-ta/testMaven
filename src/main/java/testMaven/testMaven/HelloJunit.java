package testMaven.testMaven;

public class HelloJunit {
	
	public String stringJunit(Integer num1, Integer num2, Integer num3) {
		
		if(num1 == num2 && num2 == num3) {
			return "全て同じです。";
		}
		
		return "全て同じではない";
	}

}
