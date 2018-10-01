import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class ReadJson {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		String FilePath = System.getProperty("user.dir");
		String FileName = "Krishna.json";
		
	try {
		File file= new File(FilePath+"///"+FileName);
		if(file.exists()) {
            System.out.println("File already exist");			
		}
		else {
			file.createNewFile();
			System.out.println("New File is create at this location : "+FilePath+"///"+FileName);
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
    JSONParser parser = new JSONParser();

    Object obj  = parser.parse(new FileReader(FilePath+"///"+FileName));
    JSONArray array = new JSONArray();
    array.add(obj);
    String Output = obj.toString();
    String reg = "\\";
    System.out.println(Output);
//	 JSONArray a = (JSONArray) parser.parse(new FileReader(FilePath+"///"+FileName));
//	 System.out.println(a.toArray());
//     for(int i=0;i<a.size();i++) {
//    	
//    	 System.out.println(a.);
//     }
	}

}
