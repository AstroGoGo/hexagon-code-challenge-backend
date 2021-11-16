package hexagon.codechallenge.app.dao;

import java.util.List;

import hexagon.codechallenge.app.model.Employee;
import hexagon.codechallenge.app.model.Position;

public interface HexagonDao {
	
	List<Employee> getAllEmployeesTable();
	List<Position> getAllPositionsTable();
	List<Employee> getAllEmployeesJoined();
}
