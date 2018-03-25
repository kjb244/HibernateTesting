package main.java.com.spring.service;

import main.java.com.spring.dao.DogInfoDao;
import main.java.com.spring.dao.Utils;
import main.java.com.spring.model.AddressInfo;
import main.java.com.spring.model.DogInfo;

public class DogInfoService {

    DogInfoDao dogInfoDao;

    public DogInfoService(){
        dogInfoDao = new DogInfoDao();
    }

    public boolean insert(DogInfo dogInfo){
        Utils.openCurrentSessionwithTransaction();
        boolean result = dogInfoDao.insert(dogInfo);
        Utils.closeCurrentSessionwithTransaction();
        return result;

    }
}
