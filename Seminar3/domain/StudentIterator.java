package Seminar3.domain;

import java.util.Iterator;
import java.util.List;

public class StudentIterator implements Iterator {
  private int count;
  private List<Student> list;

  public StudentIterator(List<Student> list) {
    this.list = list;
  }

  @Override
  public boolean hasNext() {
    return count < list.size();
  }

  @Override
  public Object next() {
    int index = count;
    count++;
    return list.get(index);
  }

}
