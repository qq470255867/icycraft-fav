package com.icy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.icy.domain.Image;
import com.icy.repository.FileRepository;
import com.icy.service.FileService;

@Service
public class FileServiceImpl implements FileService {

	@Autowired
	FileRepository fileRepository;

	@Override
	public String FileUploadAndSave(String dest) {
		fileRepository.save(new Image(null, dest));
		return "200";
	}

}
