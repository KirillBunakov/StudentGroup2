package Seminar3.services;

import java.util.ArrayList;
import java.util.List;

import Seminar3.domain.PersonComparator;
import Seminar3.domain.Teacher;

public class TeacherService implements iPersonService<Teacher> {
  private int count;
  List<Teacher> teachers;

  public TeacherService() {
    teachers = new ArrayList<>();
  }

  @Override
  public void create(String name, int age) {
    Teacher teach = new Teacher(name, age, name);
    count++;
    teachers.add(teach);
    sortByFIO();
  }

  @Override
  public List<Teacher> getAll() {
    return teachers;
  }

  public void sortByFIO() {
    PersonComparator<Teacher> teachComp = new PersonComparator<>();
    teachers.sort(teachComp);
    System.out.println(teachComp);
  }
}
