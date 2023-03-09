package com.ProjetPFE.demo.Controller;

import com.ProjetPFE.demo.Dao.EntrepriseDao;
import com.ProjetPFE.demo.Model.Entreprise;
import com.ProjetPFE.demo.Model.User;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class EntrepriseController {
    private EntrepriseDao entrepriseDao;
    @GetMapping("/getAll")
    public List<Entreprise> getAll() {
        return entrepriseDao.findAll();
    }


}
