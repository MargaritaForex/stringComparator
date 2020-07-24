package com.string.comparator.controller;

import org.springframework.web.bind.annotation.RequestParam;

public interface ICompareString {

    public boolean validateStringMatch(@RequestParam(value = "stringA") String stringFirst, @RequestParam(value = "stringB") String stringSecond);
}
