package com.projet.trips.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.trips.models.OffreVoyage;
import com.projet.trips.repository.OffreVoyageRepository;

@Service
public class OffreVoyageService {
	
	@Autowired
	public OffreVoyageRepository offreVoyageRepository;
	

	public List<OffreVoyage> getAllOffreVoyage()   
	{  
	List<OffreVoyage> offreVoyage = new ArrayList<OffreVoyage>();  
	offreVoyageRepository.findAll().forEach(offre -> offreVoyage.add(offre));  
	return offreVoyage;  
	}  

	public OffreVoyage getOffreVoyageById(Long id)   
	{  
	return offreVoyageRepository.findById(id).get();  
	}  

	public void saveOrUpdate(OffreVoyage offreVoyage)   
	{  
		offreVoyageRepository.save(offreVoyage);  
	}  
 
	public void delete(Long id)   
	{  
		offreVoyageRepository.deleteById(id);  
	}  

	public void update(OffreVoyage offreVoyage, Long id)   
	{  
		offreVoyageRepository.save(offreVoyage);  
	} 

}
