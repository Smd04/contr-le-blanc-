package org.example;

import lombok.Data;

import java.sql.Time;

@Data


public class Incident {
    private String reference;
    private Time time;
    private boolean status;


}
