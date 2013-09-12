package com.asoftwareguy.email.java;

public class JavaEmailSender {

    public static void main(String[] args){
        JavaEmail javaEmail = new JavaEmail();
        javaEmail.setTo("ekelm@egov.com");
        javaEmail.setFrom("test@texas.gov");
        javaEmail.setSubject("Java JavaEmail Sender");
        javaEmail.setMessage("Hello! This is an email message from the Java JavaEmail Sender.");
        javaEmail.send();
    }
}