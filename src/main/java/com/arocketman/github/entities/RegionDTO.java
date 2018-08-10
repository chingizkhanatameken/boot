package com.arocketman.github.entities;

import javax.persistence.Id;

public class RegionDTO {



        private String  regionID;
        private  String region;
    public RegionDTO() {

    }
    public RegionDTO(String regionID, String region){
        setRegionID(regionID);
        setRegion(region);
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
