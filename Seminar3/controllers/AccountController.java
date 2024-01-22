package Seminar3.controllers;

import java.util.List;

import Seminar3.domain.Person;
import Seminar3.domain.Worker;

public class AccountController {
  public static <T extends Worker, V> void paySalary(T person, V salary) {
    System.out.println(person.getName() + " выплаченная зарплата: " + salary);
  }

  // наследуем Person так как если наследовать Worker то для стундетов не сможем
  // использовать этот метод
  public static <T extends Person> void averageAge(List<T> person, String groupName) {
    int result = 0;
    for (T t : person) {
      result = result + t.getAge();
    }
    System.out.println("Средний возраст " + groupName + ": " + result / person.size());
  }
}
