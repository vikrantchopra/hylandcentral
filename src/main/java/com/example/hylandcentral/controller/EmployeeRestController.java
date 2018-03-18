package com.example.hylandcentral.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.hylandcentral.model.Coach;
import com.example.hylandcentral.model.Employee;
import com.example.hylandcentral.model.Team;
import com.example.hylandcentral.service.CoachService;
import com.example.hylandcentral.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

	@Autowired
	protected EmployeeService employeeService;
	
	@Autowired
	protected CoachService coachService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
	public Optional<Employee> getEmployee(@PathVariable("id") Long id) {
		return this.employeeService.findById(id);
	}
	
	@RequestMapping(value = "/username/{username}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
	public Employee getEmployeeByUsername(@PathVariable("username") String username) {
		return this.employeeService.findByUsername(username);
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
	public Iterable<Employee> getAllEmployees() {
		return this.employeeService.getAllEmployees();
	}
	
	@RequestMapping(value = "/peers/{username}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
	public List<Employee> getPeers(@PathVariable("username") String username) {
		Employee emp = this.employeeService.findByUsername(username);
		List<Employee> peers = new ArrayList<Employee>();
		
		peers = this.employeeService.findByTeam(emp.getTeam());
		peers.remove(emp);
		
		return peers;
	}
	
	@RequestMapping(value = "/groupList/{username}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public List<Employee> getMemberList(@PathVariable("username") String username) {
		Coach coach = this.coachService.findByUsername(username);
		Set<Team> teamList = new HashSet<Team>();
		teamList = coach.getTeamsManaged();
		
		List<Employee> memberList = new ArrayList<Employee>();
		
		for(Team t : teamList) {
			List<Employee> temp = new ArrayList<Employee>();
			temp = this.employeeService.findByTeam(t.getTeam());
			memberList.addAll(temp);
		}
		return memberList;
	}
}
