/**
package com.itp.youtube.Rest.controller;

import com.itp.openapi.api.TestApi;
import com.itp.openapi.model.Animal;
import com.itp.openapi.model.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testcon implements TestApi {

  /*  @Override
    @Validated
    public ResponseEntity<Test> testPost(Test test) {
        Test a = new Test();
        a.setField3("cc");
        return ResponseEntity.ok(a);
    }*/
/**
    @Override
    @Validated
    public ResponseEntity<Test> testPost(Animal animal) {

        Test a = new Test();
        System.out.println(animal);
        a.setField3(animal.toString());
        return ResponseEntity.ok(a);
        //return TestApi.super.testPost(animal);
    }

}
**/