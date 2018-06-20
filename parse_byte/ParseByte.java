import java.lang.*;

public class ParseByte {
	public static void main(String... args) {
		String zeroCool = "0x07";

		byte twoCool;

		System.out.println("zeroCool: " + zeroCool);

		System.out.println("subZeroCool: " + zeroCool.substring(2));

		twoCool = Byte.parseByte(zeroCool.substring(2));

		System.out.println("byteZeroCool: " + twoCool);
	}
}