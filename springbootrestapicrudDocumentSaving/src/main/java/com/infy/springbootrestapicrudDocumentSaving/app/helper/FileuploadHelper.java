package com.infy.springbootrestapicrudDocumentSaving.app.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileuploadHelper {
	public final String UPLOAD_DIR = "C:\\Users\\Sandy\\MyPhoneData\\Project Task sts\\springbootrestapicrudDocumentSaving\\src\\main\\resources\\static\\image";

	public boolean uploadFile(MultipartFile f) {
		boolean ff = false;

		try {
//		
//			InputStream is = f.getInputStream();
//			byte data[] = new byte[is.available()];
//			is.read();
//			
//			FileOutputStream fos = new FileOutputStream(UPLOAD_DIR+File.separator+f.getOriginalFilename());
//			fos.write(data);
//			
//			fos.flush();
//			
//			fos.close();
//			ff =true;

			Files.copy(f.getInputStream(), Paths.get(UPLOAD_DIR + File.separator + f.getOriginalFilename()),
					StandardCopyOption.REPLACE_EXISTING);
			
			ff =true;


		} catch (Exception e) {

		}

		return ff;
	}

}
