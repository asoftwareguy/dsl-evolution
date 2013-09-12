package com.asoftwareguy.email.fluent_improved

import groovy.transform.ToString

@ToString
class ImprovedFluentEmail {

    def mailTo
    def mailFrom
    String mailSubject
    String mailMessage

    ImprovedFluentEmail to(String _to) {
        this.mailTo = _to
        this
    }

    ImprovedFluentEmail from(String _from) {
        this.mailFrom = _from
        this
    }

    ImprovedFluentEmail withSubject(String _subject) {
        this.mailSubject = _subject
        this
    }

    ImprovedFluentEmail withMessage(String _message) {
        this.mailMessage = _message
        this
    }

    // Groovy named parameters
    public void send(Map arguments) {
        this.from(arguments.from).to(arguments.to).withSubject(arguments.subject).withMessage(arguments.message).send()
    }

    public void send() {
        // actually send the email message
        System.out.println("Sending message: " + this.toString());
    }
}