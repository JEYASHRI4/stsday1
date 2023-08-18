package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise2 {
@Value("${var}")
private String studentName;
@GetMapping("")
public String GetName() {
	return "Welcome "+studentName;
}
}