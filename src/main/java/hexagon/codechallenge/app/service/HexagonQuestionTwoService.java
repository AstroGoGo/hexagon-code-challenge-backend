package hexagon.codechallenge.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import hexagon.codechallenge.app.dao.HexagonDao;
import hexagon.codechallenge.app.model.Employee;
import hexagon.codechallenge.app.model.Position;


@Service
public class HexagonQuestionTwoService {
	
	@Autowired
	private HexagonDao hexagonDao;
	
	//Get the employees table.
	public List<Employee> getAllEmployeesTable()
	{		
		return hexagonDao.getAllEmployeesTable(); 
	}
	
	//Get the positions table.
	public List<Position> getAllPositionsTable()
	{	
		return hexagonDao.getAllPositionsTable();		
	}
	
	//Get the joined employee and positions tables.
	public List<Employee> getAllEmployeesJoined()
	{	
		return hexagonDao.getAllEmployeesJoined();		
	}		
}
