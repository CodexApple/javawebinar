package me.ghostfenrir.dataobject;

import me.ghostfenrir.encapsulation.StaffMember;

public class CustomerDAO extends StaffMember {

    public CustomerDAO(String staffName, String staffAddress, String staffPhone, String memberType) {
        super(staffName, staffAddress, staffPhone, memberType);
    }

    @Override
    public void print() {
        System.out.print(name + " " + address + " " + phone + " " + "Customer" + "\n");
    }

    @Override
    public void call() {
        System.out.println("Customer " + phone + " is calling.");
    }
}
