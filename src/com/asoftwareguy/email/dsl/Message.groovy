package com.asoftwareguy.email.dsl

import groovy.transform.ToString

@ToString
class Message {

    MessageType type
    def to
    def from
    String subject
    String message

    Message send(MessageType type) {
        this.nullify()
        this.type = type
        this
    }

    Message to(String _to) {
        this.to = _to
        this
    }

    Message from(String _from) {
        this.from = _from
        this
    }

    Message with() {
        this
    }

    Message subject(String _subject) {
        this.subject = _subject
        this
    }

    Message and() {
        this
    }

    void message(String _message) {
        this.message = _message
        this.send()
    }

    public void send() {
        // actually send the email message
        System.out.println("Sending message: " + this.toString());
    }

    private void nullify() {
        this.to = null
        this.from = null
        this.subject = null
        this.message = null
    }
}