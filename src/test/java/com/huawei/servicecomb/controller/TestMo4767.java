package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestMo4767 {

      Mo4767Delegate mo4767Delegate = new Mo4767Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = mo4767Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
