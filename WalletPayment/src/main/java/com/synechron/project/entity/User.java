package com.synechron.project.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	@Pattern(regexp ="^[A-Za-z]+$")
	private String firstName;
	@Pattern(regexp ="^[A-Za-z]+$")
	private String lastName;
	@Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z][2,]$\r\n")
	private String email;
	@Pattern(regexp = "^[6-9]\\d{9}$\r\n")
	private Long phone;
}
