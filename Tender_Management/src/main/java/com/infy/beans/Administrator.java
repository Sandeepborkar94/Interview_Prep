package com.infy.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Administrator
{
	@Id
	private Integer id;
	private String name;
    private String email;
    private String password;
    
    

}
