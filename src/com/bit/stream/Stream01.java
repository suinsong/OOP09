package com.bit.stream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Stream01 {

	public static void main(String[] args) {

		String fileName = "src/com/bit/stream/2017.jpg";

		FileInputStream fileInStream = null;
		DataInputStream dataInStream = null;
		
		try {
			fileInStream = new FileInputStream(fileName);
			dataInStream = new DataInputStream(fileInStream);
			
			while (true) {
				int ch = 0;
				if (ch == -1)
					break;

				System.out.println(ch + "\t");
				System.out.println(Integer.toHexString(ch));

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		;

		int ch = 0;

		while (true) {

		}

	}

}
