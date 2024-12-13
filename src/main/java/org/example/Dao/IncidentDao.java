package org.example.Dao;

import org.example.Incident;

import java.util.Set;

public interface IncidentDao {
    void insertIncident(Incident incident);
    void insertIncidents(Set<Incident> incidents);
}
