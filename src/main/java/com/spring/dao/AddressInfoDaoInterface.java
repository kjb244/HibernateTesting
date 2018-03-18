package main.java.com.spring.dao;


import main.java.com.spring.model.AddressInfo;
import main.java.com.spring.model.DogInfo;

import java.io.Serializable;
import java.util.List;

public interface AddressInfoDaoInterface<T, Id extends Serializable> {


    public List<T> findAll();

    public List<Object[]> customSqlQuery(String query);

    public boolean insert(T addressInfo);


}