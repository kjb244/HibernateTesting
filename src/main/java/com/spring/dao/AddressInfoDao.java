package main.java.com.spring.dao;

import main.java.com.spring.model.AddressInfo;



import java.util.List;


public class AddressInfoDao implements AddressInfoDaoInterface<AddressInfo, Integer> {


    @SuppressWarnings("unchecked")
    public List<AddressInfo> findAll(){

        List<AddressInfo> ai = (List<AddressInfo>) Utils.getCurrentSession().createQuery("from AddressInfo").list();
        return ai;
    }

    public List<Object[]> customSqlQuery(String query){
        List results = Utils.getCurrentSession().createSQLQuery(query).list();
        return results;
    }

    public boolean insert(AddressInfo addressInfo){
        try{
            Utils.getCurrentSession().save(addressInfo);
            return true;
        }
        catch(Exception e){
            return false;
        }



    }


}
