import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import org.ho.yaml.Yaml;

public class ReadYaml {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws FileNotFoundException {
		Map<String, String> map1 = new HashMap<>();//map
		String FilePath = System.getProperty("user.dir");
		String FileName = "Krishna.yaml";
		
		
			map1	=(HashMap<String,String>)Yaml.load(new FileInputStream(FilePath+"///"+FileName));
			System.out.println(map1.values());

	
	}

}
