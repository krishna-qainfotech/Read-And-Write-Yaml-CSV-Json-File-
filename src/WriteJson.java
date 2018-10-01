import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJson {

	public static void main(String[] args) throws IOException {
		String FilePath = System.getProperty("user.dir");
		String FileName = "Krishna.json";
	Scanner sc = new Scanner(System.in);
//	FileOutputStream outputStream = new FileOutputStream(FilePath+"///"+FileName);
//    System.out.println("Enter no of line you need to type : like 2,3,4...");
//    int count = sc.nextInt();
//    System.out.println("Enter Content of json file :");
//    for(int i=0;i<count;i++) {
//    	outputStream.write(sc.next().getBytes());	
//    }
//    
//    outputStream.close();
	JSONObject obj = new JSONObject();
	obj.put(sc.next(), sc.next());
	obj.put(sc.next(), sc.next());

	JSONArray family = new JSONArray();
	family.add(sc.next());
	family.add(sc.next());
	family.add(sc.next());
	obj.put("Company List", family);
	try (FileWriter file = new FileWriter(FilePath+"///"+FileName)) {
		file.write(obj.toJSONString());
		System.out.println("Successfully Copied JSON Object to File...");
		System.out.println("\nJSON Object: " + obj);
	}
	}

}
