package hexagon.codechallenge.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

import hexagon.codechallenge.app.model.Employee;
import hexagon.codechallenge.app.model.Position;

@Component
public class HexagonDaoImpl implements HexagonDao {
	
	@Autowired  
    JdbcTemplate jdbcTemplate; 

	@Override
	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployeesTable() {
        
		try 
		{			
			String selectSql = "SELECT e.emp_id, e.full_name, e.date_hired FROM hexagon.employees e ORDER BY e.full_name";
			return jdbcTemplate.query(selectSql, new HexagonDaolRowMapper(Employee.class));						
		} 
		catch (DataAccessException e) 
		{
			e.printStackTrace();
			return null;
		}
	}	
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Position> getAllPositionsTable() {
        
		try 
		{			
			String selectSql = "SELECT p.pos_id, p.pos_name, p.manager_flag FROM hexagon.positions p ORDER BY p.pos_name";
			return jdbcTemplate.query(selectSql, new HexagonDaolRowMapper(Position.class));
			
		} 
		catch (DataAccessException e) 
		{
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployeesJoined() {
        
		try 
		{			
			String selectSql = "SELECT e.emp_id, e.full_name, e.date_hired, p.manager_flag, p.pos_name FROM hexagon.employees e LEFT JOIN hexagon.positions p ON e.pos_id = p.pos_id ORDER BY e.full_name";        
			return jdbcTemplate.query(selectSql, new HexagonDaolRowMapper(Employee.class));			
		} 
		catch (DataAccessException e) 
		{
			e.printStackTrace();
			return null;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public class HexagonDaolRowMapper extends BeanPropertyRowMapper 
	{
		@SuppressWarnings("unchecked")
		public HexagonDaolRowMapper(Class returnType) {
			super(returnType);
		}
	}
}



