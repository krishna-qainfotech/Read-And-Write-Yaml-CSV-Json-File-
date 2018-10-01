import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteJson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			String content = sc.next();

			fw = new FileWriter(System.getProperty("user.dir")+"///"+"Krishna.csv");
			bw = new BufferedWriter(fw);
			bw.write(content);

			

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
