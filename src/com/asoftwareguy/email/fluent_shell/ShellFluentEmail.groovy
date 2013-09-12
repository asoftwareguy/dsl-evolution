package com.asoftwareguy.email.fluent_shell

import groovy.transform.ToString

@ToString
class ShellFluentEmail {

    def mailTo
    def mailFrom
    String mailSubject
    String mailMessage

    ShellFluentEmail to(String _to) {
        this.mailTo = _to
        this
    }

    ShellFluentEmail from(String _from) {
        this.mailFrom = _from
        this
    }

    ShellFluentEmail withSubject(String _subject) {
        this.mailSubject = _subject
        this
    }

    ShellFluentEmail withMessage(String _message) {
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