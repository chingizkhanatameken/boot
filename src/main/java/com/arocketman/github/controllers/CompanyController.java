package com.arocketman.github.controllers;


import com.arocketman.github.entities.Address;
import com.arocketman.github.entities.Company;
//import com.arocketman.github.repositories.CompanyDao;
import com.arocketman.github.entities.RegionDTO;
import com.arocketman.github.repositories.CompanyRepository;
import com.arocketman.github.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.Connection;
import java.util.*;
 /* private String bin;
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
    private String otrasl;*/
@RestController
public class CompanyController {



    @Autowired
    private CompanyService companyService;
    @Autowired
    private CompanyRepository companyRepository;

     @PersistenceContext
     private EntityManager entityManager;
    @GetMapping(value="/akmola/stepnogorsk")
    public String stepnogorsk(){
        return "stepnogorsk";
    }
    @GetMapping(value="/akmola/akkol")
    public String akkol(){
        return "akkol";
    }
    @GetMapping(value="/akmola/astrahan")
    public String astrahan(){
        return "astrahan";
    }
    @GetMapping(value="/akmola/atbasar")
    public String atbasar(){
        return "atbasar";
    }
    @GetMapping(value="/akmola/bulandy")
    public String bulandy(){
        return "bulandy";
    }
    @GetMapping(value="/akmola/egindy")
    public String egindy(){
        return "egindy";
    }
    @GetMapping(value="/akmola/enbekshilder")
    public String enbekshilder(){
        return "enbekshilder";
    }
    @GetMapping(value="/akmola/ereymentau")
    public String ereymentau(){
        return "ereymentau";
    }
    @GetMapping(value="/akmola/esil")
    public String esil(){
        return "esil";
    }
    @GetMapping(value="/akmola/zhaksyn")
    public String zhaksyn(){
        return "zhaksyn";
    }
    @GetMapping(value="/akmola/zharkayin")
    public String zharkayin(){
        return "zharkayin";
    }
    @GetMapping(value="/akmola/korgalzhyn")
    public String korgalzhyn(){
        return "korgalzhyn";
    }
    @GetMapping(value="/akmola/sandyktau")
    public String sandyktau(){
        return "sandyktau";
    }
    @GetMapping(value="/akmola/celinograd")
    public String celinograd(){
        return "celinograd";
    }
    @GetMapping(value="/akmola/shortan")
    public String shortan(){
        return "shortan";
    }
    @GetMapping(value="/akmola/arshalyn")
    public String arshalyn(){
        return "arshalyn";
    }
    @GetMapping(value="/companies")
    //@Query("select u from company u where id = 2")

    public List<Company> companies(){
        return companyService.getAllCompanies();
    }


    @GetMapping(value="company/id/{id}")
    public Optional<Company> getCompanyById(@PathVariable int id){
        return companyService.getCompany(id);
    }
    public static Connection connection = null;
    @GetMapping(value="company/region/{region}")

    public List<Company> getCompanyByRegion(@PathVariable String region){

        return companyRepository.findRegion(region);
    }
    @GetMapping(value="company/address/{addressID}")
    public List<Company> getCompanyByAddress(@PathVariable String addressID){
        System.out.println("asdasdasd   " + addressID);
        return companyRepository.findAddressID(addressID);
    }
     @RequestMapping(value="company/filter",
             method=RequestMethod.GET,
             produces=MediaType.APPLICATION_JSON_VALUE)@ResponseBody
    public List<Company> getCompanyByFilter(

            @RequestParam("regionID") String regionID,
            @RequestParam("addressID") String addressID,
            @RequestParam("name") String name,
            @RequestParam("otrasl") String otrasl,
            @RequestParam("production") String production
    ){
        String regionQuery = "u.regionID like '" + regionID + "%'";
        String addressQuery = "u.addressID = " + addressID;
        String nameQuery =  "u.name like '%" + name + "%'";
         String otraslQuery =  "u.otrasl like '%" + otrasl + "%'";
         String productionQuery =  "u.production like '%" + production + "%'";
        String mainQuery = "select u from Company u where 1=1 ";



        if (!regionID.equals("")){
            mainQuery += " and ";
            mainQuery +=regionQuery;
        }
        if (!addressID.equals("")){
            mainQuery += " and ";
            mainQuery += addressQuery;
        }
        if (!name.equals("")){
            mainQuery += " and ";
            mainQuery += nameQuery;
        }
         if (!otrasl.equals("")){
             mainQuery += " and ";
             mainQuery += otraslQuery;
         }
         if (!production.equals("")){
             mainQuery += " and ";
             mainQuery += productionQuery;
         }

        if(otrasl.equals("") && name.equals("") && addressID.equals("") && regionID.equals("") && production.equals(""))
            mainQuery = "select u from Company u where 1=1";

        System.out.println("asdasdasd" + mainQuery);
       // System.out.println("asdasdsaad" +  entityManager.createQuery(mainQuery).getResultList());
       return  entityManager.createQuery(mainQuery).getResultList();
    }





    @GetMapping(value="company/bin/{bin}")

    public List<Company> getCompanyByBin(@PathVariable String bin){

        return companyRepository.findBin(bin);
    }


    @GetMapping(value="company/name/{name}")

    public List<Company> getCompanyByName(@PathVariable String name){

        return companyRepository.findName(name);
    }


    @GetMapping(value="company/phone/{phone}")

    public List<Company> getCompanyByPhone(@PathVariable String phone){

        return companyRepository.findPhone(phone);
    }


    @GetMapping(value="company/mail/{mail}")

    public List<Company> getCompanyByMail(@PathVariable String mail){

        return companyRepository.findMail(mail);
    }


    @GetMapping(value="company/production/{production}")

    public List<Company> getCompanyByProduction(@PathVariable String production){

        return companyRepository.findProduction(production);
    }


    @GetMapping(value="company/otrasl/{otrasl}")

    public List<Company> getCompanyByOtrasl(@PathVariable String otrasl){

        return companyRepository.findOtrasl(otrasl);
    }


    @GetMapping(value="company/podotrasl/{podotrasl}")

    public List<Company> getCompanyByPodotrasl(@PathVariable String podotrasl){

        return companyRepository.findPodotrasl(podotrasl);
    }

     @RequestMapping(value = "/company/regions", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
     public List<RegionDTO> getCompanyRegions() {


         return companyRepository.findCompanyRegions();

     }

     @GetMapping(value = "/address/filter/{id}")
     public List<Address> getAddresses(@PathVariable String id){

         return companyRepository.findAddressByRegion(id);
     }



}




