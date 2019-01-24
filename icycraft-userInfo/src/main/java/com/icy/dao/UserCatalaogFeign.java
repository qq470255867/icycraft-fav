package com.icy.dao;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.icy.vo.Catalog;

@FeignClient("icycraft-catalogs")
public interface UserCatalaogFeign {

	@GetMapping("/catalog")
	public List<Catalog> getCatalogs(@RequestParam Long userId);

}