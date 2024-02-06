package com.in28minutes.soap.webservices.soapcoursemanagement.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.in28minutes.courses.CourseDetails;
import com.in28minutes.courses.GetCourseDetailsRequest;
import com.in28minutes.courses.GetCourseDetailsResponse;

@Endpoint
public class CourseDetailsEndpoint {
	
	// input - GetCourseDetailsRequest
	// output - GetCourseDetailsResponse
	
	
	@PayloadRoot(namespace="http://in28minutes.com/courses",
			localPart="GetCourseDetailsRequest")
	@ResponsePayload
	public GetCourseDetailsResponse
			processcourseDetailsRequest(@RequestPayload GetCourseDetailsRequest request) {
		GetCourseDetailsResponse response = new GetCourseDetailsResponse();
		
		CourseDetails courseDetails = new CourseDetails();
		courseDetails.setId(request.getId());
		courseDetails.setName("System development");
		courseDetails.setDescription("Know how your system works");
		 
		return response;
	}
}



/**
 * if a request comes with the name-space "http://in28minutes.com/courses"
 * and a name of GetCourseDetailsRequest, only then should this method be called
 * This is taken care by the PayloadRoot annotation.
 * 
 * the annotations
 * RequestPayload, indicates the xml request, should be converted into GetcourseDetailRequest object.
 * ResponsePayload, inducates that the GetCourseDetailResponse object,
 * 			should be converted into a response xml.
 */
