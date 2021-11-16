package hexagon.codechallenge.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hexagon.codechallenge.app.model.Employee;
import hexagon.codechallenge.app.model.Position;
import hexagon.codechallenge.app.service.HexagonQuestionTwoService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/hexagon")
public class HexagonQuestionTwoController {
	
	@Autowired 
	private HexagonQuestionTwoService hexagonQuestionTwoService;
	
	//Get all employees.
	@GetMapping("/employeesTable")
	public List<Employee> getAllEmployeesTable() {
		return hexagonQuestionTwoService.getAllEmployeesTable();
	}
	
	//Get all positions.
	@GetMapping("/positionsTable")
	public List<Position> getAllPositionsTable() {
		return hexagonQuestionTwoService.getAllPositionsTable();
	}
	
	//Get all employees and positions joined.
	@GetMapping("/employeesJoined")
	public List<Employee> getAllEmployeesJoined() {
		return hexagonQuestionTwoService.getAllEmployeesJoined();
	}		
	
}
