package com.example.myproject;

import java.util.concurrent.Future;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.student.ChangeStudentDetails;


public final class StudentClient {

    public static void main(String args[]) throws Exception {

        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

        factory.setServiceClass(ChangeStudentDetails.class);
        factory.setAddress("http://localhost:8080/AsynSOAPService/ChangeStudent?wsdl");
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new LoggingOutInterceptor());
        ChangeStudentDetails client = (ChangeStudentDetails) factory.create();

       
        // callback method
        TestAsyncHandler testAsyncHandler = new TestAsyncHandler();
        System.out.println("Invoking changeStudentAsync using callback object...");
        Future<?> response = client.changeStudentAsync(
                System.getProperty("user.name"), testAsyncHandler);
        System.out.println("Asyn Response Immediate..");
        while (!response.isDone()) {
            Thread.sleep(100);
        }
        String resp = testAsyncHandler.getResponse();
        System.out.println("Server responded through callback with: " + resp);

        System.exit(0);
    }
}