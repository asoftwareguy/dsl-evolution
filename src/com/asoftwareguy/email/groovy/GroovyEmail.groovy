package com.asoftwareguy.email.groovy

import groovy.transform.ToString

// AST transformations
@ToString
class GroovyEmail {

    // no access modifiers
    // optional typing
    // semicolons optional!
    def to
    def from
    String subject
    String message

    public void send() {
        // actually send the email message
        System.out.println("Sending message: " + this.toString());
    }
}