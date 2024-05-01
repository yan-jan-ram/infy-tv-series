package com.infy.infytvseries.api;

import org.springframework.http.ResponseEntity;

import com.infy.infytvseries.dto.UserDTO;
import com.infy.infytvseries.exception.SeriesBookingException;
import com.infy.infytvseries.service.SeriesBookingService;

public class SeriesBookingAPI {

	private SeriesBookingService seriesBookingService;
	
	public ResponseEntity<UserDTO> registerUser(UserDTO userDTO) throws SeriesBookingException
	{
		return null;
		
	}
	public ResponseEntity<UserDTO>getDetailsByUserEmail(String email) throws SeriesBookingException 
	{
		
		return null;
		
	}
}
