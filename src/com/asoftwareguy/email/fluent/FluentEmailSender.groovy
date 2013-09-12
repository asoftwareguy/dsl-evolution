package com.asoftwareguy.email.fluent

new FluentEmail().to('ekelm@egov.com').from('test@texas.gov').withSubject('Fluent Message Sender').withMessage('Hello! This is an email message from the Fluent Message Sender.').send()
