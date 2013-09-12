package com.asoftwareguy.email.fluent_shell

def binding = new Binding([
        email: new com.asoftwareguy.email.fluent_shell.ShellFluentEmail()
])
def shell = new GroovyShell(binding)
shell.evaluate(
        new File("shell_commands.groovy")
)