package com.projet.trips.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.trips.models.UserExperience;
import com.projet.trips.repository.UserExperienceRepository;

@Service
public class UserExperienceService {

	@Autowired
	UserExperienceRepository userExperienceRepository;

	public List<UserExperience> getAllUserExperiences() {
		List<UserExperience> userExperience = new ArrayList<UserExperience>();
		userExperienceRepository.findAll().forEach(userEx -> userExperience.add(userEx));
		return userExperience;
	}

	public UserExperience getUserExperienceById(Long id) {
		return userExperienceRepository.findById(id).get();
	}

	public void saveOrUpdate(UserExperience userExperience) {
		userExperienceRepository.save(userExperience);
	}

	public void delete(Long id) {
		userExperienceRepository.deleteById(id);
	}

	public void update(UserExperience userExperience, Long id) {
		userExperienceRepository.save(userExperience);
	}

}
