package com.string.comparator.controller.impl;

import com.string.comparator.controller.ICompareString;
import com.string.comparator.usecase.ICompareStringRequest;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value = "/api" )
public class CompareStringController implements ICompareString {

    @Autowired
    ICompareStringRequest iCompareStringRequest;


    @ApiOperation(
            value = "validate-String")
    @RequestMapping(value = "/validateString", method = RequestMethod.GET)
    public boolean validateStringMatch(@RequestParam(value = "stringA") String stringFirst,
                                       @RequestParam(value = "stringB") String stringSecond) {
        return iCompareStringRequest.doExecute(stringFirst,stringSecond);
    }
}
