package com.huawei.servicecomb.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseJAXRSServerDemoCodegen", date = "2019-08-28T07:29:03.383Z")


@RestSchema(schemaId = "mo4767")
@Path("/rest")

@Produces({ "application/json" })
public class Mo4767Impl  {

    @Autowired
    private Mo4767Delegate mo4767Delegate;

    @Path("/helloworld")
    @GET
    
    @Produces({ "application/json" })
    public String helloworld(@QueryParam("name") String name) {

    	return mo4767Delegate.helloworld(name);
    }
}

