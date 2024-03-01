package com.turkcell.spring.turkcell.odev2.dataAcces.abstracts;

import com.turkcell.spring.turkcell.odev2.entitties.ProgrammingLanguage;

import java.util.List;


public interface PLRepository {
    List<ProgrammingLanguage> getAll();
    void addPL(ProgrammingLanguage programminglanguage);
    ProgrammingLanguage getById(int id);
    void deletePL(int id);
}
