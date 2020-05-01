package com.mybatch.app;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import com.sun.xml.txw2.Document;

public class ByteArr {
	public static void main(String[] args) throws IOException {
		Path  file = Paths.get("/Users/swastik/Downloads/new doc 2020-01-03 22.42.19-20200103224316.pdf");
		byte[] bytesArray = Files.readAllBytes(file);
		System.out.println(bytesArray);
		FileOutputStream fileOutputStream = new FileOutputStream("aseempdf.pdf");
	    fileOutputStream.write(bytesArray);
	    fileOutputStream.close();
	}
}
