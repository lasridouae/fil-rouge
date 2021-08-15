package com.projet.trips.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.trips.models.PhotoExperience;
import com.projet.trips.repository.PhotoExperienceRepository;

@Service
public class PhotoExperienceService {
	
	@Autowired
	PhotoExperienceRepository photoExperienceRepository;
		
	public List<PhotoExperience> getAllPhotos()   
	{  
	List<PhotoExperience> photoExperience = new ArrayList<PhotoExperience>();  
	photoExperienceRepository.findAll().forEach(photo -> photoExperience.add(photo));  
	return photoExperience;  
	}  

	public PhotoExperience getByPhotoExperience(Long id)   
	{  
	return photoExperienceRepository.findById(id).get();  
	}  

	public void saveOrUpdate(PhotoExperience photoExperience)   
	{  
		photoExperienceRepository.save(photoExperience);  
	}  
 
	public void delete(Long id)   
	{  
		photoExperienceRepository.deleteById(id);  
	}  

	public void update(PhotoExperience photoExperience, Long id)   
	{  
		photoExperienceRepository.save(photoExperience);  
	} 

}
