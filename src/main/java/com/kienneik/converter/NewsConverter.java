package com.kienneik.converter;

import org.springframework.stereotype.Component;

import com.kienneik.DTO.NewsDTO;
import com.kienneik.entity.NewsEntity;

@Component
public class NewsConverter {
	public NewsEntity ToEntity(NewsDTO newsDTO) {
		NewsEntity newsEntity = new NewsEntity();
		newsEntity.setContent(newsDTO.getContent());
		newsEntity.setTitle(newsDTO.getTitle());
		newsEntity.setThumbnail(newsDTO.getThumbnail());
		newsEntity.setShortDescription(newsDTO.getShortDescription());
		return newsEntity;
	}
	
	public NewsDTO ToDTO(NewsEntity entity) {
		NewsDTO dto = new NewsDTO();
		dto.setContent(entity.getContent());
		dto.setShortDescription(entity.getShortDescription());
		dto.setTitle(entity.getTitle());
		dto.setThumbnail(entity.getThumbnail());
		return dto;
	}
	public NewsEntity toEntity(NewsEntity newsEntity, NewsDTO newsDTO) {
		newsEntity.setContent(newsDTO.getContent());
		newsEntity.setTitle(newsDTO.getTitle());
		newsEntity.setThumbnail(newsDTO.getThumbnail());
		newsEntity.setShortDescription(newsDTO.getShortDescription());
		return newsEntity;
	}
}
