
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;


import au.com.bytecode.opencsv.CSVReader;

public class ReadCSV {

	public static void main(String[] args) {
		
		String FilePath = System.getProperty("user.dir");
		String FileName = "Krishna.csv";
		BufferedWriter br = null;
		CSVReader csv;
		String[] ArrayofContent;
		
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
		//if(file.canWrite()) {
//			br = new BufferedWriter(new FileWriter(FilePath+"///"+FileName,true));
//			System.out.println("Enter someThing in the CSV File : ");
//			System.out.println("if you want do not want to type the content in csv enter '.' ");
//			
//			br.append(sc.next());
//			br.append(sc.next());
//			br.append(sc.next());
//			br.append(sc.next());
//			  FileOutputStream outputStream = new FileOutputStream(FilePath+"///"+FileName);
//			    
//			    outputStream.write(sc.next().getBytes());
//			    outputStream.write(sc.next().getBytes());
//			    outputStream.write(sc.next().getBytes());
//			    outputStream.close();
//			
//		}
		if(file.canRead()) {
			System.out.println("File is readable");
		csv = new CSVReader(new FileReader(FilePath+"///"+FileName));
		while((ArrayofContent = csv.readNext())!=null){
			System.out.println(ArrayofContent[0]+" "+ArrayofContent[1]);
			System.out.println(ArrayofContent[2]+" "+ArrayofContent[3]);
			System.out.println(ArrayofContent[4]+" "+ArrayofContent[5]);
		}
		}
	}catch(Exception e) {
		//System.out.println("Something is wrong with this method for reading the file");
	}
	}
	
}
