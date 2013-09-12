package com.asoftwareguy.email.fluent

import groovy.transform.ToString

@ToString
class FluentEmail {

    def mailTo
    def mailFrom
    String mailSubject
    String mailMessage

    // command chaining

    FluentEmail to(String _to) {
        this.mailTo = _to
        this
    }

    FluentEmail from(String _from) {
        this.mailFrom = _from
        this
    }

    FluentEmail withSubject(String _subject) {
        this.mailSubject = _subject
        this
    }

    FluentEmail withMessage(String _message) {
        this.mailMessage = _message
        this
    }

    public void send() {
        // actually send the email message
        System.out.println("Sending message: " + this.toString());
    }
}