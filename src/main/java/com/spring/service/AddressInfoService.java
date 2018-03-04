package main.java.com.spring.service;

import main.java.com.spring.dao.AddressInfoDao;
import main.java.com.spring.model.AddressInfo;

import java.util.List;

public class AddressInfoService {

    AddressInfoDao addressInfoDao;

    public List<AddressInfo> findAll(){
        addressInfoDao = new AddressInfoDao();
        addressInfoDao.openCurrentSession();
        List<AddressInfo> addressInfoList = addressInfoDao.findAll();
        addressInfoDao.closeCurrentSession();
        return addressInfoList;
    }
}
