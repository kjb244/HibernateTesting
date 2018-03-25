package main.java.com.spring.controller;

import main.java.com.spring.model.AddressInfo;
import main.java.com.spring.model.DogInfo;
import main.java.com.spring.service.AddressInfoService;
import main.java.com.spring.service.DogInfoService;

import java.util.List;
import java.util.Set;


public class Testing {

    public static void main(String[] args){
        AddressInfoService addressInfoService = new AddressInfoService();
        DogInfoService dogInfoService = new DogInfoService();

        AddressInfo addressInfo = new AddressInfo();
        addressInfo.setFirstName("here");
        addressInfo.setLastName("johnson");
        addressInfo.setEmail("test@test.com");
        DogInfo dogInfo = new DogInfo();
        dogInfo.setName("testing");
        dogInfo.setBreed("golden");
        dogInfo.setColor("brown");
        dogInfo.setAddressInfo(addressInfo);



        boolean insertResult = dogInfoService.insert(dogInfo);


        List<AddressInfo> addressInfoList = addressInfoService.findAll();
        Set<DogInfo> dogInfoSet = addressInfoList.get(0).getDogInfoSet();

        List<Object[]> results = addressInfoService.customSqlQuery(
                "select a.firstName, a.lastName, d.name\n" +
                "from address_info a\n" +
                "  INNER JOIN dog_info d on a.id = d.address_info_id");


    }
}
