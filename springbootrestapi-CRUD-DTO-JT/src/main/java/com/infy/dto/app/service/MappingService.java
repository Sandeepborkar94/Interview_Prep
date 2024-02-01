package com.infy.dto.app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.app.dto.UserLocationDTO;
import com.infy.dto.app.model.Location;
import com.infy.dto.app.model.User;
import com.infy.dto.app.repository.UserRepository;

@Service
public class MappingService {
	@Autowired
	UserRepository userRepository;

	public List<UserLocationDTO> getAllUsersLocation() {
		return ((List<User>) userRepository.findAll()).stream().map(this::convertDataIntoDTO)
				.collect(Collectors.toList());
	}

	private UserLocationDTO convertDataIntoDTO(User userData) {
		UserLocationDTO dto = new UserLocationDTO();

		dto.setUserId(userData.getId());
		dto.setUsername(userData.getUsername());
		Location loc = userData.getLoc();

		dto.setLatitude(loc.getLatitude());

		dto.setPlace(loc.getPlaceName());
		return dto;
	}
}
