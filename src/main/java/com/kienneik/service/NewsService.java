package com.kienneik.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kienneik.DTO.NewsDTO;
import com.kienneik.converter.NewsConverter;
import com.kienneik.entity.CategoryEntity;
import com.kienneik.entity.NewsEntity;
import com.kienneik.repository.CategoryRepository;
import com.kienneik.repository.NewsRepository;
@Service
public class NewsService implements INewsService {

	@Autowired
	private NewsRepository newsRepositoy;

	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private NewsConverter converter;

	@Override
	public NewsDTO add(NewsDTO newsDTO) {
		CategoryEntity categoryEntity = categoryRepository.findOneByCode(newsDTO.getCategoryCode());
		NewsEntity newsEntity = converter.ToEntity(newsDTO);
		newsEntity.setCategory(categoryEntity);
		return converter.ToDTO(newsRepositoy.save(newsEntity));
	}
}
