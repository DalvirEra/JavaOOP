package ru.geekbrains;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

// Доработать приложение, которое мы разрабатывали на уроке. Мы доллжны поработать с сортировкой объектов, освоить работу с интерфейсами Comparator, Comparable.

//+ Доработать класс Freelancer, при желании можно разработать и свой собтственный тип сотрудника.
//+ Переработать метод generateEmployee, метод должен создавать случайного сотрудника (Worker, Freelancer или любого другого). Метод должен быть один!
//+ Придумать свой собственный компаратор (Возможно отсортировать сотрудников по возрасту? Тогда добавьте соответствующее состояние на уровне ваших классов).
//+ Продемонстрировать сортировку объектов различного типа с использованием собственного компаратора.


public class Sample02 {

    private static Random random = new Random();

    public static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salary = random.nextInt(900, 1500);
        int salaryIndex = random.nextInt(28, 31);
        int age = random.nextInt(18,40);
        
        if (random.nextInt(1,3)==1){
            return new Worker(names[random.nextInt(10)], surnames[random.nextInt(10)],salary * salaryIndex, age );
        }
        else{
            return new Freelancer(names[random.nextInt(10)], surnames[random.nextInt(10)],salary * salaryIndex, age );
        }

    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++){
            employees[i] = generateEmployee();
        }

        for (Employee employee: employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees, new AgeComparator());

        System.out.println("\n*** Отсортированный массив сотрудников по возрасту***\n");

        for (Employee employee: employees) {
            System.out.println(employee);
        }


    }

}

// class SalaryComparator implements Comparator<Employee>{

//     // 1 0 -1
//     @Override
//     public int compare(Employee o1, Employee o2) {

//         return Double.compare(o2.calculateSalary(), o1.calculateSalary());
//         //return o1.calculateSalary() == o2.calculateSalary() ? 0 :
//         //        (o1.calculateSalary() > o2.calculateSalary() ? 1 : -1);
//     }
// }

// class SurNameComparator implements Comparator<Employee>{

//     @Override
//     public int compare(Employee o1, Employee o2) {

//         return o1.surName.compareTo(o2.surName);
//     }

// }

class AgeComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2){
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}


abstract class Employee implements Comparable<Employee>{

    protected String firstName;
    protected String surName;
    protected double salary;
    protected int age;

    public Employee(String firstName, String surName, double salary, int age) {
        this.firstName = firstName;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return String.format("Сотрудник: %s %s; Ставка: %.2f; Среднемесячная заработная плата: %.2f",
                surName, firstName, salary, calculateSalary());
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(calculateSalary(), o.calculateSalary());
    }
    
    public abstract int getAge();
}

class Worker extends Employee{

    public Worker(String firstName, String surName, double salary, int age) {
        super(firstName, surName, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата: %.2f, Возраст: %d",
                surName, firstName, calculateSalary(),age);
    }

    @Override
    public int getAge(){
        return age;
    }
}


class Freelancer extends Employee{

    public Freelancer(String firstName, String surName, double salary, int age){
        super(firstName, surName, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary * 5;
    }
    // salary * 18 * 5

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Среднемесячная заработная плата: %.2f, Возраст: %d",
                surName, firstName, calculateSalary(),age);
    }

    @Override
    public int getAge(){
        return age;
    }
}
