package com.arocketman.github.entities;



import javax.persistence.*;


    @Entity
    @Table(name = "Address")
    public class Address {

        @Id
        private String  id;
        private  String region;
        public Address (){}
        public Address (String id, String region){
            setId(id);
            setRegion(region);
        }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}