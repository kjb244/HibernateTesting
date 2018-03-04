package main.java.com.spring.controller;

import main.java.com.spring.model.AddressInfo;
import main.java.com.spring.service.AddressInfoService;

import java.util.List;


public class Testing {

    public static void main(String[] args){
        AddressInfoService ai = new AddressInfoService();
        List<AddressInfo> addressInfoList = ai.findAll();
        addressInfoList.get(0).getDogInfoSet();
    }
}
