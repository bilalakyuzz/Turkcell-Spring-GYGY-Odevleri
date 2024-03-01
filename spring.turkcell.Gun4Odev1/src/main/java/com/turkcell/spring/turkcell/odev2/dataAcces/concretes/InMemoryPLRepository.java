package com.turkcell.spring.turkcell.odev2.dataAcces.concretes;

import com.turkcell.spring.turkcell.odev2.dataAcces.abstracts.PLRepository;
import com.turkcell.spring.turkcell.odev2.entitties.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryPLRepository implements PLRepository {
    List<ProgrammingLanguage> programmingLanguages;

    public InMemoryPLRepository() {

        programmingLanguages=new ArrayList<ProgrammingLanguage>();
        programmingLanguages.add(new ProgrammingLanguage(1,"C#"));
        programmingLanguages.add(new ProgrammingLanguage(2,"Java"));
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        // TODO Auto-generated method stub
        return programmingLanguages;
    }

    @Override
    public void addPL(ProgrammingLanguage programminglanguage){
        if(!includesName(programminglanguage.getName())&& !programminglanguage.getName().equals("")){
            programmingLanguages.add(programminglanguage);
        }


    }

    @Override
    public ProgrammingLanguage getById(int id) {
        // TODO Auto-generated method stub
        for (ProgrammingLanguage i: programmingLanguages) {
            if(i.getId()==id) {
                return i;
            }
        }

        return null;
    }

    @Override
    public void deletePL(int id) {


        int index=getLanguageIndexById(id);

        if (index!=-1){
            programmingLanguages.remove(index);

        }


    }

    public boolean includesName(String name){
        for (ProgrammingLanguage i:programmingLanguages
        ) {
            if(i.getName().equals(name)){
                return true;

            }



        }
        return false;
    }
    public int getLanguageIndexById(int id){
        for (int i=0;i<programmingLanguages.size();i++){
            if(programmingLanguages.get(i).getId()==id){
                return i;
            }

        }
        return -1;
    }

}
