import java.util.*;

public class ArrayProc {

	public void getValues(int[] array) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("������ �Է��Ͻÿ� : ");
			array[i] = scan.nextInt();
		}
	}

	public double getAverage(int[] array) {
		double total = 0;
		for (int i = 0; i < array.length; i++) 
			total += array[i];
			return total / array.length;
		
	}

	final static int STUDENTS = 5;

	public static void main(String[] args) {
		int[] scores = new int[STUDENTS];
		ArrayProc obj = new ArrayProc();
		obj.getValues(scores);
		System.out.println("����� ="+obj.getAverage(scores));
		
	}

}
