package main.java.com.spring.dao;


import java.io.Serializable;
import java.util.List;

public interface AddressInfoDaoInterface<T, Id extends Serializable> {


    public List<T> findAll();


}