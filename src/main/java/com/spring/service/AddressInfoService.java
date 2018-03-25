package main.java.com.spring.service;

import main.java.com.spring.dao.AddressInfoDao;
import main.java.com.spring.dao.Utils;
import main.java.com.spring.model.AddressInfo;

import java.util.List;

public class AddressInfoService {

    AddressInfoDao addressInfoDao;

    public AddressInfoService(){
        addressInfoDao = new AddressInfoDao();
    }

    public List<AddressInfo> findAll(){
        Utils.openCurrentSession();
        List<AddressInfo> addressInfoList = addressInfoDao.findAll();
        Utils.closeCurrentSession();
        return addressInfoList;
    }

    public List<Object[]> customSqlQuery(String query){
        Utils.openCurrentSession();
        List<Object[]> results =  addressInfoDao.customSqlQuery(query);
        Utils.closeCurrentSession();
        return results;
    }

    public boolean insert(AddressInfo addressInfo){
        Utils.openCurrentSessionwithTransaction();
        boolean result = addressInfoDao.insert(addressInfo);
        Utils.closeCurrentSessionwithTransaction();
        return result;

    }
}
