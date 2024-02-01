package com.infy.dto.app.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.dto.app.dto.UserLocationDTO;
import com.infy.dto.app.service.MappingService;

@RestController
public class MappingController
{
	@Autowired  
    private MappingService mapService;  
	
    @GetMapping("/map")
    @ResponseBody  
    public List<UserLocationDTO> getAllUsersLocation() {  
        // call getAllUsersLocation() method from the service which we created before  
        // store the result in a list of UserLocationDTO  
        List <UserLocationDTO> usersLocation = mapService.getAllUsersLocation();  
        // return usersLocation  
        return usersLocation;  
    }  
}
