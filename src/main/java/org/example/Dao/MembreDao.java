package org.example.Dao;

import org.example.Incident;
import org.example.Membre;

import java.util.List;

public interface MembreDao {
    void insertMembre(Membre membre);
    List<Incident> chargerListIncident(int membreId);
}
