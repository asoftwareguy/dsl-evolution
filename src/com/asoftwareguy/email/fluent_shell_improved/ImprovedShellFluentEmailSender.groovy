package com.asoftwareguy.email.fluent_shell_improved

import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.customizers.ImportCustomizer

def configuration = new CompilerConfiguration()
def imports = new ImportCustomizer()
imports.addStaticStar(MessageType.name)
configuration.addCompilationCustomizers(imports)

def email = new ImprovedShellFluentEmail()

def binding = new Binding([
        *: MessageType.values().collectEntries {
            [(it.name()): it]
        },
        send: email.&send
])

def shell = new GroovyShell(binding, configuration)
shell.evaluate(
        new File("improved_commands.groovy")
)