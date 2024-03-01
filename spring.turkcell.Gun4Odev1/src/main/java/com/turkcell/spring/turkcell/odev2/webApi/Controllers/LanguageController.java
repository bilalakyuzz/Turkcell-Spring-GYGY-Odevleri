package com.turkcell.spring.turkcell.odev2.webApi.Controllers;

import com.turkcell.spring.turkcell.odev2.business.abstracts.PLService;
import com.turkcell.spring.turkcell.odev2.entitties.ProgrammingLanguage;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/pLanguages")
public class LanguageController {
    private PLService plService;


    public LanguageController(PLService plService) {
        this.plService = plService;
    }

    @GetMapping("/getAll")
    public List<ProgrammingLanguage> getAll(){
        return plService.getAll();

    }
    @PostMapping
    public void addPL(ProgrammingLanguage programmingLanguage){
        this.plService.addPL(programmingLanguage);
    }
    @GetMapping("/{id}")
    public ProgrammingLanguage getById(@PathVariable int id){
        return plService.getById(id);
    }
    @DeleteMapping
    public void deletePL(@RequestParam int id){
        this.plService.deletePL(id);
    }

}
