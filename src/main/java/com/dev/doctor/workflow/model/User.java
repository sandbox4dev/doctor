package com.dev.doctor.workflow.model;

import com.dev.doctor.workflow.acces.Role;

import java.util.Date;
import java.util.UUID;

public interface User {
    int getId();
    UUID getUUID();
    boolean isLocked();
    Date getDateLocked();
    Role getUserRole();
}
