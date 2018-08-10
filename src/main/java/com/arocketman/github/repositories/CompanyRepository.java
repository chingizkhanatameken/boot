package com.arocketman.github.repositories;


import com.arocketman.github.entities.Address;
import com.arocketman.github.entities.Company;
import com.arocketman.github.controllers.CompanyController;

import com.arocketman.github.entities.RegionDTO;
import org.apache.tomcat.util.bcel.Const;
import org.aspectj.apache.bcel.classfile.Constant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CompanyRepository extends JpaRepository<Company,String> {



    Optional<Company> findById(int id);


    public static final String FIND_REGION = "select u from Company u where u.region like %:#{#region}%";
    //  if (@Param("region") == "")
    @Query(FIND_REGION)
    List<Company> findRegion(@Param("region") String region);

    public static final String FIND_ADDRESS_ID = "select u from Company u where u.addressID = :#{#addressID}";
    //  if (@Param("region") == "")
    @Query(FIND_ADDRESS_ID)
    List<Company> findAddressID(@Param("addressID") String addressID);

    public static final String FIND_BIN = "select u from Company u where u.bin = :#{#bin}";
    @Query(FIND_BIN)
    List<Company> findBin(@Param("bin") String bin);

    public static final String NAME = "select u from Company u where u.name like %:#{#name}%";
    //  if (@Param("region") == "")
    @Query(NAME)
    List<Company> findName(@Param("name") String name);
    List<Company> findByName(String name);
    public static final String FIND_PHONE = "select u from Company u where u.phone like %:#{#phone}%";
    //  if (@Param("region") == "")
    @Query(FIND_PHONE)
    List<Company> findPhone(@Param("phone") String phone);

    public static final String FIND_PRODUCTION = "select u from Company u where u.production like %:#{#production}%";
    //  if (@Param("region") == "")
    @Query(FIND_PRODUCTION)
    List<Company> findProduction(@Param("production") String production);


    public static final String FIND_PODOTRASL = "select u from Company u where u.podotrasl like %:#{#podotrasl}%";
    //  if (@Param("region") == "")
    @Query(FIND_PODOTRASL)
    List<Company> findPodotrasl(@Param("podotrasl") String podotrasl);
    public static final String FIND_OTRASL = "select u from Company u where u.otrasl like %:#{#otrasl}%";
    //  if (@Param("region") == "")
    @Query(FIND_OTRASL)
    List<Company> findOtrasl(@Param("otrasl") String otrasl);

    public static final String FIND_MAIL = "select u from Company u where u.mail like %:#{#mail}%";
    //  if (@Param("region") == "")

    @Query(FIND_MAIL)
    List<Company> findMail(@Param("mail") String mail);
   CompanyController companyController = new CompanyController();
    public static final String FIND_BY_FILTERS =  "':#{#mainQuery}''";

    @Query(value = FIND_BY_FILTERS, nativeQuery = true)
    List<Company> findCompanyByFilters(@Param("mainQuery") String mainQuery);

    public static final String FIND_DISTINCT_REGION =  "select distinct new com.arocketman.github.entities.RegionDTO( p.regionID, p.region) from Company p  order by p.regionID";

    @Query(FIND_DISTINCT_REGION)
    List<RegionDTO> findCompanyRegions();

    public static final String FIND_ADDRESS_BY_REGION =  "select u from Address u where u.id  like  :#{#id}%";

    @Query(FIND_ADDRESS_BY_REGION)
    List<Address> findAddressByRegion(@Param("id") String id);

}
