package com.dev.doctor.workflow.model;

import com.dev.doctor.workflow.acces.Role;

import java.util.Date;
import java.util.UUID;

public class AbstractUserImpl implements User {

    private int id;
    private UUID uuid;
    private Role userRole;
    private boolean isLocked;
    private Date lockedDate;


    private String email;
    private String password;

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public UUID getUUID() {
        return null;
    }

    @Override
    public boolean isLocked() {
        return false;
    }

    @Override
    public Date getDateLocked() {
        return null;
    }

    @Override
    public Role getUserRole() {
        return null;
    }
}
