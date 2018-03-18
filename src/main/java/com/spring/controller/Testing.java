package main.java.com.spring.controller;

import main.java.com.spring.model.AddressInfo;
import main.java.com.spring.model.DogInfo;
import main.java.com.spring.service.AddressInfoService;

import java.util.List;
import java.util.Set;


public class Testing {

    public static void main(String[] args){
        AddressInfoService ai = new AddressInfoService();

        AddressInfo addressInfo = new AddressInfo();
        addressInfo.setFirstName("kevin");
        addressInfo.setLastName("johnson");
        addressInfo.setEmail("test@test.com");
       // boolean insertResult = ai.insert(addressInfo);


        List<AddressInfo> addressInfoList = ai.findAll();
        Set<DogInfo> dogInfoSet = addressInfoList.get(0).getDogInfoSet();

        List<Object[]> results = ai.customSqlQuery(
                "select a.firstName, a.lastName, d.name\n" +
                "from address_info a\n" +
                "  INNER JOIN dog_info d on a.id = d.address_info_id");


    }
}
