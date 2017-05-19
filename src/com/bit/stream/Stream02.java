package com.bit.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream02 {

	public static void main(String[] args) {
		
		//사진을 카피하기
		String sourceFile="src/com/bit/stream/2017.jpg";
		String targetFile="src/com/bit/strea/2017_copy.jpg";
		
		FileInputStream fInput=null;
		FileOutputStream fOutput=null;
		
		try {
			fInput=new FileInputStream(sourceFile);
			
			fOutput=new FileOutputStream(targetFile);
			
			byte[] cart = new byte[1024];
			while(true){
				int ret = fInput.read(cart, 0, cart.length);
				if(ret==-1)break;
				fOutput.write(cart);
			}
			fInput.close();
			fOutput.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}

}
