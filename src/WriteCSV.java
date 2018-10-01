//import java.awt.List;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import au.com.bytecode.opencsv.CSVWriter;

public class WriteCSV {

	public static void main(String ... krishna) {
		CSVWriter csvWriter;

		String FilePath = System.getProperty("user.dir");
		String FileName = "Krishna.csv";
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
//		FileWriter filewriter = new FileWriter(file);
//		csvWriter = new CSVWriter(filewriter);
//		List<String[]> writeNow = new ArrayList<String[]>();
//		
//		System.out.println("Enter the No of Row and Column do you need on csv file : ");
//		int x = sc.nextInt(), y = sc.nextInt();
//		for(int i=0;i<y;i++)
//		writeNow.add(new String[]{for(int k=0;k<x;k++) {sc.next();}};
//		csvWriter.writeAll(writeNow);
//		System.out.println(writeNow.listIterator());
	    PrintWriter pw = new PrintWriter(new File(FilePath+"///"+FileName));
        StringBuilder sb = new StringBuilder();
        System.out.println("Enter No of Rows : ");
        int row = sc.nextInt();
        System.out.println("Enter name of The row like ID,NAME,Organization");
        for(int i=0;i<row;i++) {
        sb.append(sc.next());
        sb.append(',');}
        System.out.println("Enter number of column : ");
        int column = sc.nextInt();
        System.out.println("Enter corresponding data :");
        for(int j=0;j<column;j++) {
        sb.append(sc.next());
        sb.append(',');
        }
        

        pw.write(sb.toString());
        pw.close();
    }catch(Exception e) {
		System.out.println("SomeThing went wrong with the code");
	}
		
	}
}
