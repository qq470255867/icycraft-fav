package com.icy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.icy.service.FileService;

@RestController
public class FileController {

	@Autowired
	FileService fileService;

	@PostMapping(value = "/uploadFile")

	public String fileUpload(@RequestParam String dest) {
		fileService.FileUploadAndSave(dest);
		return "success";
	}

}
