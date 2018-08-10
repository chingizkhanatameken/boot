package com.arocketman.github;


import javax.persistence.*;



public class CompanyDTO {


    private Long id;
    private String bin;
    private String name;
    private String region;
    private String phone;
    private String address;
    private String mail;
    private String number_of_emp;
    private String production;
    private String kod_tn_ved;
    private String kp_ved;
    private String podotrasl;
    private String otrasl;

    public CompanyDTO(Long id, String bin, String name, String region, String phone, String address, String mail, String number_of_emp, String production, String kod_tn_ved, String kp_ved, String podotrasl, String otrasl) {
        this.setId(id);
        this.setBin(bin);
        this.setName(name);
        this.setRegion(region);
        this.setPhone(phone);
        this.setAddress(address);
        this.setMail(mail);
        this.setNumber_of_emp(number_of_emp);
        this.setProduction(production);
        this.setKod_tn_ved(kod_tn_ved);
        this.setKp_ved(kp_ved);
        this.setPodotrasl(podotrasl);
        this.setOtrasl(otrasl);

    }

    public CompanyDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getNumber_of_emp() {
        return number_of_emp;
    }

    public void setNumber_of_emp(String number_of_emp) {
        this.number_of_emp = number_of_emp;
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
}