package com.ProjetPFE.demo.Controller;

import com.ProjetPFE.demo.Dao.FactureDao;
import com.ProjetPFE.demo.Model.Facture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/factures")
public class FactureController {
    @Autowired
    private FactureDao factureDao;

    @GetMapping("/getAll")
    public List<Facture> getAllFactures() {
        return factureDao.findAll();
    }

    @GetMapping("/{id}")
    public Facture getFactureById(@PathVariable Long id) {
        return factureDao.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Facture"));
    }
}
