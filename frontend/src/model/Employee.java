package model;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="employee")
@SessionScoped
public class Employee {
	
	private String firstName;
	private String surname;
	private Date dateOfBirth;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public EmployeeEntity getEntity()
	{
		EmployeeEntity employeeentity =new EmployeeEntity();
		employeeentity.setName(firstName);
		employeeentity.setDateOfBirth(dateOfBirth);
		employeeentity.setSurName(surname);
		
		return employeeentity;
	}
	

}
