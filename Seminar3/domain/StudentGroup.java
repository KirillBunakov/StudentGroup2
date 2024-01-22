package Seminar3.domain;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
  private List<Student> list;
  private int id;

  public StudentGroup(List<Student> list, int id) {
    this.list = list;
    this.id = id;
  }

  public int getSize() {
    return list.size();
  }

  public List<Student> getList() {
    return list;
  }

  public void setList(List<Student> list) {
    this.list = list;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "StudentGroupId " + id + ", Студентов в группе: " + getSize() + "\n" + list;
  }

  @Override
  public Iterator<Student> iterator() {
    return new StudentIterator(list);
  }

  @Override
  public int compareTo(StudentGroup o) {
    if (o.getSize() > list.size()) {
      return 1;
    }
    if (o.getSize() < list.size()) {
      return -1;
    }
    if (o.id < id) {
      return 1;
    }
    if (o.id > id) {
      return -1;
    }

    return 0;
  }

}
