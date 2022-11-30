package org.sfp.day1;

public class Student {

    private String id;
    private String name;
    private Phone contacts;
    private Address address;

    public Student() {}

    public Student(String id, String name, Phone contacts, Address address) {
        this.id = id;
        this.name = name;
        this.contacts = contacts;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone getContacts() {
        return contacts;
    }

    public void setContacts(Phone contacts) {
        this.contacts = contacts;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void listStudentInformation() {
        System.out.println("Student id: " + this.id);
        System.out.println("Student name: " + this.name);
        System.out.println("Student phone numbers: " + this.contacts);
        System.out.println("Student home address: " + this.address);
    }

}
