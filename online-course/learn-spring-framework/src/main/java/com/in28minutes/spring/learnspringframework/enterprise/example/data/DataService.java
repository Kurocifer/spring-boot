package com.in28minutes.spring.learnspringframework.enterprise.example.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DataService {
	public List<Integer> gatData() {
		return Arrays.asList(13, 23, 33, 43, 53);
	}
}
