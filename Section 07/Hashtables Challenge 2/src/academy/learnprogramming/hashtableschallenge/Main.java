package academy.learnprogramming.hashtableschallenge;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
        Remove duplicate items from a linked list
        Your solution must use the JDK's LinkedList class
        Your solution must use a HashMap
        */
        LinkedList<Employee> employees = new LinkedList<>();

        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        employees.forEach(System.out::println);

        HashMap<Integer, Employee> hashMap = new HashMap<>();
        ListIterator<Employee> iterator = employees.listIterator();
        List<Employee> removeArray = new ArrayList<>();

        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (hashMap.containsKey(employee.getId())) {
                removeArray.add(employee);
            } else {
                hashMap.put(employee.getId(), employee);
            }
        }

        for (Employee employee : removeArray) {
            employees.remove(employee);
        }

        System.out.println("=====================================================");

        employees.forEach(System.out::println);
    }
}
