package main.java.com.spring.dao;

import main.java.com.spring.model.DogInfo;

public class DogInfoDao implements DogInfoInterface<DogInfo> {

    public boolean insert(DogInfo dogInfo) {
        try {
            Utils.getCurrentSession().save(dogInfo);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
