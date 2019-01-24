package com.icy.dao;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.icy.vo.Catalog;

@FeignClient(name = "icycraft-catalogs")
public interface CatalogFeign {

	@GetMapping("/catalog")
	public List<Catalog> getCatalogByUser_Id(@RequestParam Long userId);

}
