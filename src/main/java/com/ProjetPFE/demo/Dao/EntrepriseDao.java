package com.ProjetPFE.demo.Dao;

import com.ProjetPFE.demo.Model.Entreprise;
import com.ProjetPFE.demo.Model.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrepriseDao extends JpaRepository<Entreprise, String> {
}
