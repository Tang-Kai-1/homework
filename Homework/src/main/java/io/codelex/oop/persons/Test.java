package io.codelex.oop.persons;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Doe", "A2578-D2", 21, "Junior developer", LocalDate.of(2014, 05, 23));
        Customer customer = new Customer("Frank", "Frink", "C1524163", "D1829AF", 27, 10);
        System.out.println(employee.getInfo());
        System.out.println(customer.getInfo());
        customer.setPurchaseCount(21);
        System.out.println(customer.getInfo());
    }
}
