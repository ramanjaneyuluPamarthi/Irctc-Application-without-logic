package com.nit.rest;

import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.request.PAssengerRequest;
import com.nit.response.TicketResponse;

@RestController
@RequestMapping("/rest")
public class IrctcRestController {

	@GetMapping("/get")
	public String getTicketDetails() {     //For Testing whether output is coming or not
		return new PAssengerRequest().toString();
	}
	
	@PostMapping(value = "/ticketdata",
			consumes = {"application/json","application/xml"},
			produces = {"application/json","application/xml"}
			)
	public TicketResponse getDetails(@RequestBody  PAssengerRequest request) {
		//Logic to book a ticket
		
		TicketResponse response = new TicketResponse();
		response.setStatus("Confirmed");
		response.setTicketPrice(980.00);
		
		BeanUtils.copyProperties(request, response);   //For Copying request data to response
		System.out.println(response);
		return response;
	}
}
