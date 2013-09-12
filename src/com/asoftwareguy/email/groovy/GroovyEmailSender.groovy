package com.asoftwareguy.email.groovy

// Groovy with(Closure c) method
new GroovyEmail().with {
    to = 'ekelm@egov.com'
    from = 'test@texas.gov'
    subject = 'Groovy GroovyEmail Sender'
    message = 'Hello! This is an email message from the Groovy GroovyEmail Sender.'
    send()
}