package com.turkcell.spring.turkcell.odev2.business.concretes;

import com.turkcell.spring.turkcell.odev2.business.abstracts.PLService;
import com.turkcell.spring.turkcell.odev2.dataAcces.abstracts.PLRepository;
import com.turkcell.spring.turkcell.odev2.entitties.ProgrammingLanguage;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PLManager implements PLService {
    private PLRepository plrepo;

    public PLManager(PLRepository plrepo) {
        this.plrepo = plrepo;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        // TODO Auto-generated method stub
        return plrepo.getAll();
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        // TODO Auto-generated method stub

        return  plrepo.getById(id) ;
    }

    @Override
    public void deletePL(int id) {
        plrepo.deletePL(id);

    }

    @Override
    public void addPL(ProgrammingLanguage programmingLanguage){
        // TODO Auto-generated method stub
        plrepo.addPL(programmingLanguage);

    }
}
