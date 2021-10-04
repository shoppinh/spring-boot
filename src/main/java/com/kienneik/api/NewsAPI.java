package com.kienneik.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.kienneik.DTO.NewsDTO;
import com.kienneik.service.INewsService;
@CrossOrigin
@RestController
public class NewsAPI {
	
	@Autowired
	private INewsService newsService;
	
	@PostMapping(value = "/news")
	public NewsDTO createNews(@RequestBody NewsDTO model) {
		return  newsService.save(model);
	}
	
	@PutMapping(value = "/news/{id}")
	public NewsDTO updateNews(@RequestBody NewsDTO model,@PathVariable("id") long id ) {
		model.setId(id);
		
		return newsService.save(model);
	}
	
	@DeleteMapping(value = "/news")
	public void deleteNews(@RequestBody long[] ids) {
	}
	
	

}
