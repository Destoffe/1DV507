package cw222ng_assign1.Exercise3to5;

import java.io.BufferedReader;
import java.io.File;
/*
 * Exercise 3by Christoffer Wahlman
 * 2018-01-25
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrintJavaMain {
	private static int depth = 1, count = 0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File startDir = new File("C:\\temp\\javakurs\\1DV507\\src\\cw222ng_assign1\\Exercise1");
		visitSub(startDir);
		
	}

		public static void visitSub(File file) throws IOException { // Insperation from the powerpoint exercise that Jonas showed
			if(file.isDirectory()) {
				File[] subs = file.listFiles();
				if(depth==1)
					System.out.println("Currently in Directory: " + file.getPath());
				else
					System.out.println("Currently in Subdirectory: " + file.getPath());
				for(int i=0; i<subs.length; i++) {
					if(!subs[i].isDirectory()) {
					System.out.print(" File: " + subs[i].getName() + " Rows : " + rows(subs[i]) );
					System.out.print("\n");
					
					}
				}
				for(File f: subs) { // The recursive part where i go into each folder that is found 
					depth++;
					visitSub(f);
				}
				
			}
		}
		
		public static int rows(File file) throws IOException  {
			int counter = 0;
			
			try {
				FileReader fReader = new FileReader(file);
				
				BufferedReader bReader = new BufferedReader(fReader);
				
				while((bReader.readLine()) != null){
					counter++;
				}
				bReader.close();
			}catch(FileNotFoundException e) {
				throw e;
			}
			catch(IOException e) {
				throw e;
			}
			return counter;
		}
}