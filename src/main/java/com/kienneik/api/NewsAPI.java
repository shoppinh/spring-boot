package com.kienneik.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kienneik.DTO.NewsDTO;
import com.kienneik.service.INewsService;
@CrossOrigin
@RestController
public class NewsAPI {
	
	@Autowired
	private INewsService newsService;
	
	@PostMapping(value = "/news")
	public NewsDTO createNews(@RequestBody NewsDTO model) {
		return  newsService.add(model);
	}
	
	@PutMapping(value = "/news")
	public NewsDTO updateNews(@RequestBody NewsDTO model) {
		return model;
	}
	
	@DeleteMapping(value = "/news")
	public void deleteNews(@RequestBody long[] ids) {
	}
	
	

}
