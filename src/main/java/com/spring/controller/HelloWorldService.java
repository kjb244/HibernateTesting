package main.java.com.spring.controller;


import main.java.com.spring.model.AddressInfo;
import main.java.com.spring.service.AddressInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;
import java.util.List;


@RestController
@RequestMapping(value="/routes")
public class HelloWorldService {

    @Autowired
    private HttpSession httpSession;

    @RequestMapping(value="/getRecords", method = RequestMethod.GET)
    public ResponseEntity init(){
        AddressInfoService ai = new AddressInfoService();
        List<AddressInfo> addressInfoList = ai.findAll();
        return new ResponseEntity(addressInfoList, HttpStatus.OK);
    }



}
