package jv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class J07001 {

	public static void main(String[] args) {
		try {
			FileReader myfile = new FileReader("DATA.in");
			int data;
			try {
				data = myfile.read();
				while (data != -1) {
					System.out.println((char)data);
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
