package academy.learnprogramming.challenge1;

public class Main {

    public static void main(String[] args) {
        /*
        Implement the addBefore() method for the EmployeeDoublyLinkedList class.
        */
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);
        list.printList();

        list.addBefore(billEnd, johnDoe);
        list.printList();
        
        list.addBefore(new Employee("James", "Bond", 7), mikeWilson);
        list.printList();
    }
}
