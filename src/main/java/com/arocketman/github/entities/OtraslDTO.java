package com.arocketman.github.entities;

import javax.persistence.Id;

public class OtraslDTO {



    private String  otrasl;
    public OtraslDTO() {

    }
    public OtraslDTO(String otrasl){
        setOtrasl(otrasl);
    }

    public String getOtrasl() {
        return otrasl;
    }

    public void setOtrasl(String otrasl) {
        this.otrasl = otrasl;
    }
}
