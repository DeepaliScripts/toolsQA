package february;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class practiceMakesManPerfect {

	
	public static void main(String[] args) throws IOException  {
		
		FileWriter likho = new FileWriter("/Users/deepaligautam/Downloads/sample3.txt");
		BufferedWriter bw = new BufferedWriter(likho);
		bw.write("maine kaha hello");
		// Flush the BufferedWriter to ensure data is written to the file
        bw.flush();
        
        // Close the BufferedWriter to release resources
        bw.close();
        
        FileReader fr = new FileReader("/Users/deepaligautam/Downloads/sample3.txt");
        BufferedReader br = new BufferedReader(fr);
        
        
        System.out.println(br.readLine());
}}