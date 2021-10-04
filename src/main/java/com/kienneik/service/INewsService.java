package com.kienneik.service;

import com.kienneik.DTO.NewsDTO;

import java.util.List;

public interface INewsService {
	NewsDTO save(NewsDTO newsDTO);
	List<NewsDTO> getAll();
	
}
