package com.icy.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.icy.vo.Article;


public class JsonConvert {

	@SuppressWarnings("unchecked")
	public static List<Article> jsonConvert(String data) {

		ObjectMapper objectMapper = new ObjectMapper();
		List<Article> value = null;
		try {
			value = objectMapper.readValue(data, ArrayList.class);
			
			System.out.println(value.toString());
			return value;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;

	}

}
