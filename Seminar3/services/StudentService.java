package Seminar3.services;

import java.util.ArrayList;
import java.util.List;

import Seminar3.domain.PersonComparator;
import Seminar3.domain.Student;

public class StudentService implements iPersonService<Student> {
  private int count;
  private List<Student> students;

  public StudentService() {
    students = new ArrayList<>();
  }

  @Override
  public List<Student> getAll() {
    return students;
  }

  @Override
  public void create(String name, int age) {
    Student stud = new Student(name, age);
    count++;
    students.add(stud);
    sortByFIO();
  }

  public void sortByFIO() {
    PersonComparator<Student> studCorp = new PersonComparator<>();
    students.sort(studCorp);
  }
}
