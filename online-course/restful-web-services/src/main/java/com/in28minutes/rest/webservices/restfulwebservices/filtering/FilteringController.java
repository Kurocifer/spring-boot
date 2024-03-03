package com.in28minutes.rest.webservices.restfulwebservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {

	@GetMapping("/filtering") // filter field2
	public MappingJacksonValue filtering() {
		SomeBean someBean = new SomeBean("vers1", "vers2", "vers3");
		
		MappingJacksonValue mappingJacksonValue =
				new MappingJacksonValue(someBean);
		
		SimpleBeanPropertyFilter filter = 
				SimpleBeanPropertyFilter.filterOutAllExcept("field1","field3");
		
		FilterProvider filters = 
				new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		
		mappingJacksonValue.setFilters(filters );
		
		return mappingJacksonValue;
	}
	  
	@GetMapping("/filtering-list") // filter field1
	public MappingJacksonValue filteringList() {
		
		List<SomeBean> someBeanList = Arrays.asList(new SomeBean("vers1", "vers2", "vers3"),
				new SomeBean("vers4", "vers5", "vers6"));
		
		MappingJacksonValue mappingJacksonValue =
				new MappingJacksonValue(someBeanList);
		 
		SimpleBeanPropertyFilter filter = 
				SimpleBeanPropertyFilter.filterOutAllExcept("field2","field3");
		
		FilterProvider filters = 
				new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		
		mappingJacksonValue.setFilters(filters );
		return mappingJacksonValue;
	}
}
