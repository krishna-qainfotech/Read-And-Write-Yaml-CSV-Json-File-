import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

import org.supercsv.io.ICsvListWriter;
import org.supercsv.prefs.CsvPreference;
import org.supercsv.io.CsvListWriter;

import java.util.Random;
import java.util.Scanner;

import au.com.bytecode.opencsv.CSVWriter;

public class WriteCSV1 {

	public static void main(String[] args) {

		String FilePath = System.getProperty("user.dir");
		String FileName = "Krishna.csv";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row of CSV:");
		int row = sc.nextInt();
		System.out.println("Enter column of CSV");
		int column = sc.nextInt();
		System.out.println("Enter the Data at : " );
		final String[][] csvMatrix = new String[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print("R["+i+"]"+"::"+"C["+j+"] : ");
				csvMatrix[i][j]=sc.next();
			}}

		 double x3 = Math.random();
//		 byte[] array = new byte[7]; // length is bounded by 7
//		    new Random().nextBytes(array);
//		    String generatedString = new String(array, Charset.forName("UTF-8"));
        System.out.println("Do you want to append some String to CSV file if Yes print y or Y");
        String yes=sc.next();
        String Temp ;
        System.out.println(yes);
        if(yes.contains("y")) {
        	System.out.println("Enter row and column in which you want to append your String");
        	int x1=sc.nextInt();
        	int y1=sc.nextInt();
        	//System.out.println(Double.toString(x3));
        	csvMatrix[x1][y1]=csvMatrix[x1][y1].concat(Double.toString(x3));
        //	csvMatrix[x1][y1]=csvMatrix[x1][y1].concat(generatedString);
        	   
        }
        writeCsv(csvMatrix);
	}

	
	private static void writeCsv(String[][] csvMatrix) {
		// TODO Auto-generated method stub
		  ICsvListWriter csvWriter = null;
	        try {
	            csvWriter = new CsvListWriter(new FileWriter(System.getProperty("user.dir")+"///"+"Krishna.csv"), 
	                CsvPreference.STANDARD_PREFERENCE);

	            for (int i = 0; i < csvMatrix.length; i++) {
	                csvWriter.write(csvMatrix[i]);
	            }

	        } catch (IOException e) {
	            e.printStackTrace(); // TODO handle exception properly
	        } finally {
	            try {
	                csvWriter.close();
	            } catch (IOException e) {
	            }
	        }

	    }
	}


