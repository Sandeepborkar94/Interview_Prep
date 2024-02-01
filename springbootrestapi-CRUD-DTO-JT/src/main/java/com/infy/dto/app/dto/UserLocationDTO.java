package com.infy.dto.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLocationDTO
{
	private Integer userId;
	private String username;
	private double latitude;
	private double longitude;
	private String place;
}
