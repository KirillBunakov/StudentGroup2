package Seminar3.domain;

import java.util.Iterator;
import java.util.List;

public class GroupIterator implements Iterator {
  private int count;
  private List<StudentGroup> list;

  public GroupIterator(List<StudentGroup> list) {
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
