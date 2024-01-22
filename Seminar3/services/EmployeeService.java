package Seminar3.services;

import java.util.ArrayList;
import java.util.List;

import Seminar3.domain.Employee;
import Seminar3.domain.PersonComparator;

public class EmployeeService implements iPersonService<Employee> {
  private int count;
  private List<Employee> employees;

  public EmployeeService() {
    employees = new ArrayList<>();
  }

  @Override
  public void create(String name, int age) {
    Employee emp = new Employee(name, age, "разнорабочий");
    count++;
    employees.add(emp);
    sortByFIO();
  }

  @Override
  public List<Employee> getAll() {
    return employees;
  }

  public void sortByFIO() {
    PersonComparator<Employee> empCorp = new PersonComparator<>();
    employees.sort(empCorp);
  }
}
