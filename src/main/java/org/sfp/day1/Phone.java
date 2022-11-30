package org.sfp.day1;

public class Phone {

    private String emergencyContact;
    private String studentPhoneNumber;

    public Phone() {}

    public Phone(String emergencyContact, String studentPhoneNumber) {
        this.emergencyContact = emergencyContact;
        this.studentPhoneNumber = studentPhoneNumber;
    }

    @Override
    public String toString() {
        return emergencyContact + " / " + studentPhoneNumber;
    }
}
