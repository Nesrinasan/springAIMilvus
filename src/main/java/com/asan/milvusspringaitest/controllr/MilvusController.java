package com.asan.milvusspringaitest.controllr;

import com.asan.milvusspringaitest.milvus.MilvusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MilvusController {

    @Autowired
    MilvusService milvusService;


    @GetMapping("/getDataFromMilvus")
    public void getDataFromMilvus(){
        milvusService.getDataFromMilvus();

    }
}
