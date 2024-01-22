package Seminar3.domain;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {
  private List<StudentGroup> list;
  private int steamId;

  public StudentSteam(List<StudentGroup> list, int steamId) {
    this.list = list;
    this.steamId = steamId;
  }

  public List<StudentGroup> getList() {
    return list;
  }

  public void setList(List<StudentGroup> list) {
    this.list = list;
  }

  public int getSteamId() {
    return steamId;
  }

  public void setSteamId(int steamId) {
    this.steamId = steamId;
  }

  @Override
  public Iterator<StudentGroup> iterator() {
    return new GroupIterator(list);
  }

  @Override
  public String toString() {
    return "StudentSteamId " + steamId + ", Количество групп: " + list.size() + super.toString();
  }

}
