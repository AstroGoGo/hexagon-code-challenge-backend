package hexagon.codechallenge.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hexagon.codechallenge.app.service.HexagonQuestionOneService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/hexagon")
public class HexagonQuestionOneController {
	
	@Autowired 
	private HexagonQuestionOneService hexagonQuestionOneService;
			
	//Get the request for the 'The Sieve of Eratosthenes' process.
	@GetMapping("/eratosthenesCalculation/{inputValue}")
	public String getEratosthenesCalculation(@PathVariable ("inputValue") int imputValue) {
		return hexagonQuestionOneService.getEratosthenesCalculation(imputValue);
	} 
}
