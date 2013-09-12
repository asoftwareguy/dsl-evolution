package com.asoftwareguy.email.groovy

// Groovy object initializer
new com.asoftwareguy.email.java.JavaEmail(
        to: 'ekelm@egov.com',
        from: 'test@texas.gov',
        subject: 'Groovy JavaEmail Sender',
        message: 'Hello! This is an email message from the Groovy JavaEmail Sender.'
).send();