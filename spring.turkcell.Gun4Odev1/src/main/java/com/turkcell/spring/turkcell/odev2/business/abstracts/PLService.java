package com.turkcell.spring.turkcell.odev2.business.abstracts;

import com.turkcell.spring.turkcell.odev2.entitties.ProgrammingLanguage;

import java.util.List;

public interface PLService {
    List<ProgrammingLanguage> getAll();
    void addPL(ProgrammingLanguage programmingLanguage);
    ProgrammingLanguage getById(int id);
    void deletePL(int id);
}
