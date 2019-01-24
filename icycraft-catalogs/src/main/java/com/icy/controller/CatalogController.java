package com.icy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.icy.domain.Catalog;
import com.icy.service.CatalogService;

@RestController
public class CatalogController {

	@Autowired
	CatalogService catalogService;

	@GetMapping("/catalog")
	public List<Catalog> getCatalogs(@RequestParam Long userId) {

		return catalogService.getCataLogByUserId(userId);

	}

}
