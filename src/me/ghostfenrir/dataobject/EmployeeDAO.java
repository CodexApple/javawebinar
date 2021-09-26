package me.ghostfenrir.dataobject;

import me.ghostfenrir.encapsulation.StaffMember;

public class EmployeeDAO extends StaffMember {
    public EmployeeDAO(String staffName, String staffAddress, String staffPhone, String memberType) {
        super(staffName, staffAddress, staffPhone, memberType);
    }

    @Override
    public void print() {

    }

    @Override
    public void call() {

    }
}
