package ru.stqa.pft.addressbook1.tests.model;

public class GroupData1 {
    private final String name;
    private final String header;
    private final String footer;

    public GroupData1(String name, String header, String footer) {
        this.name = name;
        this.header = header;
        this.footer = footer;
    }

    public String getName() {
        return name;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }
}
