package com.example.demo;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
// 2. Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
// 1. Annotation
@RestController
public class FamiliarWithRouting {
	
        public static void main(String[] args) {
                SpringApplication.run(FamiliarWithRouting.class, args);
        }
	
        @RestController
        @RequestMapping("/coding")
		public class CodingController{
			
	        // 1. Annotation
	        @RequestMapping("")
	        public String coding() {
	        	return "Hello Coding Dojo!";
	        }
	        
	        @RequestMapping("/python")
	        public String python() {
	        	return "Python/Django was awesome!";
	        }
	        
	        @RequestMapping("/java")
	        public String java() {
	        	return "Java/Spring is better!";
	        }
	        
		}
        
        @RestController
        public class DojoController{
        	@RequestMapping("/dojo")
        	public String dojo() {
        		return "The dojo is awesome!";
        	}
        	@RequestMapping("/{city}-dojo")
        	public String showDojo(@PathVariable("city") String dojo) {
        		return "Burbank Dojo is located in Southern California!";
        	}
        	
        	@RequestMapping("/{city}")
        	public String hq(@PathVariable("city") String dojo) {
        		return "SJ Dojo is headquarters!";
        	}
        	
        }
        
		
        
}