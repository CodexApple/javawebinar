package me.ghostfenrir.encapsulation;

public abstract class StaffMember {
    protected String name, address, phone, memberType;

    public StaffMember(String staffName, String staffAddress, String staffPhone, String memberType) {
        this.name = staffName;
        this.address = staffAddress;
        this.phone = staffPhone;
        this.memberType = memberType;
    }

    public abstract void print();
    public abstract void call();
}
