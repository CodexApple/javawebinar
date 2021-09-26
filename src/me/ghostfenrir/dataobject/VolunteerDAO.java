package me.ghostfenrir.dataobject;

import me.ghostfenrir.encapsulation.StaffMember;

public class VolunteerDAO extends StaffMember {

    public VolunteerDAO(String staffName, String staffAddress, String staffPhone, String memberType) {
        super(staffName, staffAddress, staffPhone, memberType);
    }

    @Override
    public void print() {
        System.out.print(name + " " + address + " " + phone + " " + "Volunteer" + "\n");
    }

    @Override
    public void call() {
        System.out.println("Volunteer " + phone + " is calling.");
    }
}
