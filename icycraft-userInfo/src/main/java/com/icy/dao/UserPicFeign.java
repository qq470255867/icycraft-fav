package com.icy.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "icycraft-fileService")
public interface UserPicFeign {

	@RequestMapping(method = RequestMethod.POST, value = "/uploadFile")

	public String fileUpload(@RequestParam String dest);

}
