package com.kienneik.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kienneik.DTO.NewsDTO;
import com.kienneik.converter.NewsConverter;
import com.kienneik.entity.CategoryEntity;
import com.kienneik.entity.NewsEntity;
import com.kienneik.repository.CategoryRepository;
import com.kienneik.repository.NewsRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewsService implements INewsService {

	@Autowired
	private NewsRepository newsRepository;

	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private NewsConverter converter;

	@Override
	public NewsDTO save(NewsDTO newsDTO) {
		CategoryEntity categoryEntity = categoryRepository.findOneByCode(newsDTO.getCategoryCode());
		NewsEntity newNews = new NewsEntity();
		if (newsDTO.getId() != null) {
			NewsEntity oldNews = newsRepository.findOne(newsDTO.getId());
			newNews = converter.toEntity(oldNews, newsDTO);
			newNews.setCategory(categoryEntity);
		} else {
			newNews = converter.ToEntity(newsDTO);
			newNews.setCategory(categoryEntity);

		}
		return converter.ToDTO(newsRepository.save(newNews));
	}

	@Override
	public List<NewsDTO> getAll() {
		List<NewsDTO> resultList = new ArrayList<>();
		for (NewsEntity item : newsRepository.findAll()) {
			resultList.add(converter.ToDTO(item));
		}
		return resultList;
	}

}
