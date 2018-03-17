package main.java.com.spring.controller;


import main.java.com.spring.model.AddressInfo;
import main.java.com.spring.service.AddressInfoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping(value="/routes")
public class HelloWorldService {

    @RequestMapping(value="/getRecords", method = RequestMethod.GET)
    public ResponseEntity getRecords(){
        AddressInfoService addressInfoService = new AddressInfoService();
        List<AddressInfo> addressInfoList = addressInfoService.findAll();
        return new ResponseEntity(addressInfoList, HttpStatus.OK);
    }

    @RequestMapping(value="/getRecordsFromCustomQuery",method = RequestMethod.GET )
    public ResponseEntity getRecordsFromCustomQuery(){
        AddressInfoService addressInfoService = new AddressInfoService();
        List<Object[]> results = addressInfoService.customSqlQuery(
                "select a.firstName, a.lastName, d.name\n" +
                "from address_info a\n" +
                "  INNER JOIN dog_info d on a.id = d.address_info_id");
        ArrayList<HashMap<String,String>> processingResults = new ArrayList<HashMap<String,String>>();
        for(Object[] row: results){
            HashMap<String, String> rec = new HashMap<>();
            rec.put("firstName", row[0].toString());
            rec.put("lastName", row[1].toString());
            rec.put("dogName", row[2].toString());
            processingResults.add(rec);
        }
        return new ResponseEntity(results, HttpStatus.OK);

    }



}
