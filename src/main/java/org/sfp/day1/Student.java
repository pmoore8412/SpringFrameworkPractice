package org.sfp.day1;

public class Student {

    private int id;
    private String name;
    private Phone contacts;
    private Address address;

    public void listStudentInformation() {
        System.out.println("Student id: " + this.id);
        System.out.println("Student name: " + this.name);
        System.out.println("Student phone numbers: " + this.contacts);
        System.out.println("Student home address: " + this.address);
    }

}
