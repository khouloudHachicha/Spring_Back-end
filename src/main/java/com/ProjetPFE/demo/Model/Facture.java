package com.ProjetPFE.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.Objects;

@Entity
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int num;
    private Date date;
    private String client;
    private String vendeur;
    private Date échéance;
    private String paiment;
    private String référnce;
    private String description;
    private String prix_unitaire;
    private long prix_TTC;
    private long prix_HT;
    private long prix_TVA;

    public Facture() {
    }

    public Facture(int num, Date date, String client, String vendeur, Date échéance, String paiment, String référnce, String description, String prix_unitaire, long prix_TTC, long prix_HT, long prix_TVA) {
        this.num = num;
        this.date = date;
        this.client = client;
        this.vendeur = vendeur;
        this.échéance = échéance;
        this.paiment = paiment;
        this.référnce = référnce;
        this.description = description;
        this.prix_unitaire = prix_unitaire;
        this.prix_TTC = prix_TTC;
        this.prix_HT = prix_HT;
        this.prix_TVA = prix_TVA;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getVendeur() {
        return vendeur;
    }

    public void setVendeur(String vendeur) {
        this.vendeur = vendeur;
    }

    public Date getÉchéance() {
        return échéance;
    }

    public void setÉchéance(Date échéance) {
        this.échéance = échéance;
    }

    public String getPaiment() {
        return paiment;
    }

    public void setPaiment(String paiment) {
        this.paiment = paiment;
    }

    public String getRéférnce() {
        return référnce;
    }

    public void setRéférnce(String référnce) {
        this.référnce = référnce;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrix_unitaire() {
        return prix_unitaire;
    }

    public void setPrix_unitaire(String prix_unitaire) {
        this.prix_unitaire = prix_unitaire;
    }

    public long getPrix_TTC() {
        return prix_TTC;
    }

    public void setPrix_TTC(long prix_TTC) {
        this.prix_TTC = prix_TTC;
    }

    public long getPrix_HT() {
        return prix_HT;
    }

    public void setPrix_HT(long prix_HT) {
        this.prix_HT = prix_HT;
    }

    public long getPrix_TVA() {
        return prix_TVA;
    }

    public void setPrix_TVA(long prix_TVA) {
        this.prix_TVA = prix_TVA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facture facture = (Facture) o;
        return Objects.equals(num, facture.num);
    }

}
