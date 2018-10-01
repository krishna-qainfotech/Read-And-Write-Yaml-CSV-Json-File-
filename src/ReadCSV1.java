import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV1 {

	public static void main(String ... krishna) throws IOException {
		try {
		BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir")+"///"+"Krishna.csv"));
		List<String> lines = new ArrayList<>();
		String line = null;
		while ((line = reader.readLine()) != null) {
		    lines.add(line);
		}
		int i=0;
        while(lines.get(i)!=null) {
		System.out.println(lines.get(i));
		i++;
        }
		System.out.println(lines.get(1));
	}catch(Exception e) {
		
	}
		}
}
