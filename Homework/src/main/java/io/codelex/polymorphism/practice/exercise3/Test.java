package io.codelex.polymorphism.practice.exercise3;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("John", "Doe", "123Nonayabiznessstreet", 1, 20);
        Employee employee = new Employee("Frank", "Hill", "none", 2, "JOB");
        student.display();
        employee.display();
    }
}
