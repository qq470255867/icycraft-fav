package com.icy.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.icy.vo.Catalog;

@FeignClient(name="icycraft-catalogs")
public interface CatalogFeign {
	
	@GetMapping("/catalogById")
	public Catalog getCatalogById(@RequestParam Long id);

}
