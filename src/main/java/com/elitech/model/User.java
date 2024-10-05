package com.elitech.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
	private String nom;
	private String prenom;
	private int age;

}
