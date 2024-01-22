package Seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Seminar3.controllers.AccountController;
import Seminar3.domain.Employee;
import Seminar3.domain.Student;
import Seminar3.domain.StudentGroup;
import Seminar3.domain.StudentSteam;
import Seminar3.domain.Teacher;

public class main {
  public static void main(String[] args) {
    Student student1 = new Student("Timur", 25);
    Student student2 = new Student("Kirill", 26);
    Student student3 = new Student("Andrey", 24);
    Student student4 = new Student("Olga", 23);
    Student student5 = new Student("Anastasiya", 20);
    Student student6 = new Student("Anna", 28);
    Student student7 = new Student("Elena", 42);
    Student student8 = new Student("Evneny", 29);
    Student student9 = new Student("Alex", 26);
    Student student10 = new Student("Bob", 30);

    List<Student> list1 = new ArrayList<>();
    list1.add(student1);
    list1.add(student2);
    list1.add(student3);
    List<Student> list2 = new ArrayList<>();
    list2.add(student4);
    list2.add(student5);
    list2.add(student6);
    list2.add(student7);
    List<Student> list3 = new ArrayList<>();
    list3.add(student8);
    list3.add(student9);
    list3.add(student10);

    StudentGroup group1 = new StudentGroup(list1, 1);
    StudentGroup group2 = new StudentGroup(list2, 2);
    StudentGroup group3 = new StudentGroup(list3, 3);

    System.out.println("Не отсортированный вывод групп");
    for (Student student : group1) {
      System.out.println(student);
    }
    System.out.println("-------");
    for (Student student : group2) {
      System.out.println(student);
    }
    System.out.println("Отсортированный вывод групп");

    Collections.sort(group1.getList());
    Collections.sort(group2.getList());
    // System.out.println("------");

    for (Student student : group1) {
      System.out.println(student);
    }
    System.out.println("-------");
    for (Student student : group2) {
      System.out.println(student);
    }

    List<StudentGroup> steam = new ArrayList<>();
    steam.add(group1);
    steam.add(group2);
    steam.add(group3);
    System.out.println("Не отсортированный вывод потока");

    for (StudentGroup studentgroup : steam) {
      System.out.println(studentgroup);
    }

    System.out.println("Отсортированный вывод потока");
    Collections.sort(steam);
    for (StudentGroup studentgroup : steam) {
      System.out.println(studentgroup);
    }

    System.out.println("-------");
    System.out.println(steam);

    Teacher t1 = new Teacher("Эдуард", 50, "доцент");
    Employee e1 = new Employee("Федор", 25, "Дворник");

    // AccountController controller = new AccountController();
    // controller.paySalary(t1, 50000);
    // controller.paySalary(e1, 25000);
    // controller.paySalary(student1, 400000);
    AccountController.paySalary(t1, 100000);
    AccountController.paySalary(e1, 100000);
    // AccountController.paySalary(student1, 100000);
    Teacher t2 = new Teacher("Василий", 59, "доцент");
    Teacher t3 = new Teacher("Григорий", 36, "профессор");
    Teacher t4 = new Teacher("Инокентий", 80, "доктор");

    // создаем список учителей
    List<Teacher> teachers = new ArrayList<>();
    teachers.add(t1);
    teachers.add(t2);
    teachers.add(t3);
    teachers.add(t4);
    // Вызываем averageAge со списком учителей
    AccountController.averageAge(teachers, "учителей");

    // создаем список стундетов
    List<Student> students = new ArrayList<>();
    students.add(student1);
    students.add(student2);
    students.add(student3);
    // Вызываем averageAge со списком стундетов
    AccountController.averageAge(students, "студентов");
  }

}
