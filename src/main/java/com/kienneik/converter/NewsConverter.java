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
		if (entity.getId() != null) {
			dto.setId(entity.getId());
		}
		dto.setContent(entity.getContent());
		dto.setShortDescription(entity.getShortDescription());
		dto.setTitle(entity.getTitle());
		dto.setThumbnail(entity.getThumbnail());
		dto.setCreatedBy(entity.getCreatedBy());
		dto.setCreatedDate(entity.getCreatedDate());
		dto.setModifiedBy(entity.getModifiedBy());
		dto.setModifiedDate(entity.getModifiedDate());
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
