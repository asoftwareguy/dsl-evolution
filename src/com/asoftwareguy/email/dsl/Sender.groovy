package com.asoftwareguy.email.dsl

import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.customizers.ImportCustomizer

def configuration = new CompilerConfiguration()
def imports = new ImportCustomizer()
imports.addStaticStar(MessageType.name)
configuration.addCompilationCustomizers(imports)

def binding = new Binding([
        *: MessageType.values().collectEntries {
            [(it.name()): it]
        },
        send: new Message().&send
])

def shell = new GroovyShell(binding, configuration)
shell.evaluate(
        new File("commands.groovy")
)