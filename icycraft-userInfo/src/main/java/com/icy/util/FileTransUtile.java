package com.icy.util;

import java.io.File;
import java.util.UUID;

import org.springframework.context.annotation.PropertySource;
import org.springframework.web.multipart.MultipartFile;
@PropertySource({"classpath:config.properties"})
public class FileTransUtile {

	
	private static String prefix = "D:\\img\\file\\" ;

	private static String suffix;

	private static String newFileName;

	public static String transto(MultipartFile file) {

		suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."),
				file.getOriginalFilename().length());

		newFileName = UUID.randomUUID().toString();

		String dest = prefix + newFileName + suffix;

		File fileDest = new File(dest);

		try {
			if (!fileDest.getParentFile().exists()) {

				fileDest.getParentFile().mkdirs();
			}

			file.transferTo(fileDest);

		} catch (Exception e) {
			System.out.println("文件传输错误");

			e.printStackTrace();
		}

		return dest;

	}

}
