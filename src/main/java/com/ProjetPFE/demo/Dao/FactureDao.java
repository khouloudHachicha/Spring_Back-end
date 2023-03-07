package com.ProjetPFE.demo.Dao;

import com.ProjetPFE.demo.Model.Facture;
import com.ProjetPFE.demo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactureDao  extends JpaRepository<Facture, Long> {
}
