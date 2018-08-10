package com.arocketman.github.entities;



import javax.persistence.*;


@Entity
@Table(name = "Company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String bin;
    private String name;
    private String region;
    private String regionID;
    private String phone;
    private String address;
    private String mail;
    private String addressID;
    private String production;
    private String kod_tn_ved;
    private String kp_ved;
    private String podotrasl;
    private String otrasl;


    public Company(int id, String bin, String name, String region, String regionID, String phone, String address, String mail, String addressID, String production, String kod_tn_ved, String kp_ved, String podotrasl, String otrasl) {
        this.setId(id);
        this.setBin(bin);
        this.setName(name);
        this.setRegion(region);
        this.setRegionID(regionID);
        this.setPhone(phone);
        this.setAddress(address);
        this.setMail(mail);
        this.setAddressID(addressID);
        this.setProduction(production);
        this.setKod_tn_ved(kod_tn_ved);
        this.setKp_ved(kp_ved);
        this.setPodotrasl(podotrasl);
        this.setOtrasl(otrasl);

    }

    public Company() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddressID() {
        return addressID;
    }

    public void setAddressID(String addressID) {
        this.addressID = addressID;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getKod_tn_ved() {
        return kod_tn_ved;
    }

    public void setKod_tn_ved(String kod_tn_ved) {
        this.kod_tn_ved = kod_tn_ved;
    }

    public String getKp_ved() {
        return kp_ved;
    }

    public void setKp_ved(String kp_ved) {
        this.kp_ved = kp_ved;
    }

    public String getPodotrasl() {
        return podotrasl;
    }

    public void setPodotrasl(String podotrasl) {
        this.podotrasl = podotrasl;
    }

    public String getOtrasl() {
        return otrasl;
    }

    public void setOtrasl(String otrasl) {
        this.otrasl = otrasl;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }


    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }
}