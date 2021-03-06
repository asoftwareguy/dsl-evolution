package com.asoftwareguy.email.fluent_shell_improved

import groovy.transform.ToString

@ToString
class ImprovedShellFluentEmail {

    MessageType type
    def mailTo
    def mailFrom
    String mailSubject
    String mailMessage

    ImprovedShellFluentEmail type(MessageType _type) {
        this.type = _type
        this
    }

    ImprovedShellFluentEmail to(String _to) {
        this.mailTo = _to
        this
    }

    ImprovedShellFluentEmail from(String _from) {
        this.mailFrom = _from
        this
    }

    ImprovedShellFluentEmail withSubject(String _subject) {
        this.mailSubject = _subject
        this
    }

    ImprovedShellFluentEmail withMessage(String _message) {
        this.mailMessage = _message
        this
    }

    // Groovy named parameters
    public void send(Map arguments, MessageType type) {
        this.type(type).from(arguments.from).to(arguments.to).withSubject(arguments.subject).withMessage(arguments.message).send()
    }

    public void send() {
        // actually send the email message
        System.out.println("Sending message: " + this.toString());
    }
}