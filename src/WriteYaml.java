import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//import org.ho.yaml.Yaml;
import org.yaml.snakeyaml.Yaml;

import au.com.bytecode.opencsv.CSVReader;

public class WriteYaml {

	
	public static void main(String[] args) {
		String FilePath = System.getProperty("user.dir");
		String FileName = "Krishna.yaml";
		Map<String, String> map = new HashMap<>();//map
		Scanner sc = new Scanner(System.in);
		try {
		File file= new File(FilePath+"///"+FileName);
		if(file.exists()) {
            System.out.println("File already exist");			
		}
		else {
			file.createNewFile();
			System.out.println("New File is create at this location : "+FilePath+"///"+FileName);
		}
		if(file.canWrite()) {
			System.out.println("Enter no of Columns : ");
			int count =sc.nextInt();
			System.out.println("Enter the Key and Value : ");
			for(int i=0;i<count;i++) {
				map.put(sc.next(), sc.next());	
			}
			Yaml yaml = new Yaml();
			
	         FileWriter fileWriter=new FileWriter(file);
	         yaml.dump(map,fileWriter);
	}
//		if(file.canRead()) {
//		map	=(HashMap<String,String>)Yaml.load(new FileInputStream(""));
//		}

}catch(Exception e) {
	
}
		}}
