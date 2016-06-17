package ru.stqa.pft.addressbook1.tests.model;

public class ContractData1 {
    private final String firstname;
    private final String lastname;
    private final String mobilephone;
    private final String eMail;

    public ContractData1(String firstname, String lastname, String mobilephone, String eMail) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.mobilephone = mobilephone;
        this.eMail = eMail;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public String geteMail() {
        return eMail;
    }
}
