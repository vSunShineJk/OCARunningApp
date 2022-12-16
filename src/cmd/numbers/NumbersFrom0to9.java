package cmd.numbers;
public class NumbersFrom0to9{
	public static void main(String... numbers) throws InterruptedException {
		for(int i = 0; i <= 9; i++){
			Thread.sleep(1000);
			System.out.println(i);
		}
	
	}
}
