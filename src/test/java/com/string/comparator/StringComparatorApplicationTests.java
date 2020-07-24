package com.string.comparator;

import com.string.comparator.controller.impl.CompareStringController;
import com.string.comparator.usecase.ICompareStringRequest;
import com.string.comparator.usecase.impl.CompareStringServiceRequest;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
class StringComparatorApplicationTests {

    @InjectMocks
    CompareStringController ctrl = new  CompareStringController();
    CompareStringServiceRequest serv = new  CompareStringServiceRequest();
    @Mock
    private ICompareStringRequest service;

    @Test
    void contextLoads() {

        Mockito.doReturn(true).when(service).doExecute(Mockito.any(),Mockito.any() );
        Assert.assertTrue( ctrl.validateStringMatch("mary", "ramy") );
    }

    @Test
    void contexts() {
        Assert.assertTrue( serv.doExecute("mary", "ramy") );
    }

}
