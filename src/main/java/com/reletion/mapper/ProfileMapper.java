package com.reletion.mapper;

import com.reletion.dto.ProfileDTO;
import com.reletion.entity.Profile;

public class ProfileMapper {
	
	
	// Convert to Entity
	public Profile toEntity(ProfileDTO profileDTO) {
		Profile profile = new Profile();
		profile.setId(profileDTO.getId());
		profile.setAddress(profileDTO.getAddress());
		profile.setPhoneNumber(profileDTO.getPhoneNumber());
		profile.setDepartment(profileDTO.getDepartment());
		profile.setDesignation(profileDTO.getDesignation());
		return profile;
	}
	
	// Convert to DTO
	public ProfileDTO toDTO(Profile profile) {
		ProfileDTO profileDTO = new ProfileDTO();
		profileDTO.setId(profile.getId());
		profileDTO.setAddress(profile.getAddress());
		profileDTO.setPhoneNumber(profile.getPhoneNumber());
		profileDTO.setDepartment(profile.getDepartment());
		profileDTO.setDesignation(profile.getDesignation());
		return profileDTO;
	}

}
