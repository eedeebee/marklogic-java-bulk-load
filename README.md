marklogic-java-bulk-load
========================

Sandbox for playing with bulk loads

To build, 

    % ant build
  
To run, 

    % ant run
    
    Buildfile: /Users/ebloch/repos/marklogic-java-bulk-load/build.xml
   
    build:
        [javac] /Users/ebloch/repos/marklogic-java-bulk-load/build.xml:15: warning: 'includeantruntime' was not set, defaulting to build.sysclasspath=last; set to false for repeatable builds
        [javac] Compiling 2 source files to /Users/ebloch/repos/marklogic-java-bulk-load/build
        [javac] Note: /Users/ebloch/repos/marklogic-java-bulk-load/loader.java uses unchecked or unsafe operations.
        [javac] Note: Recompile with -Xlint:unchecked for details.
        
    run:
        [java] 17:43:55,248 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback.groovy]
        [java] 17:43:55,248 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.xml]
        [java] 17:43:55,248 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback.xml] at [jar:file:/Users/ebloch/repos/marklogic-java-bulk-load/client-api-java-1.0-3/client-api-java-1.0-3.jar!/logback.xml]
        [java] 17:43:55,249 |-WARN in ch.qos.logback.classic.LoggerContext[default] - Resource [logback.xml] occurs multiple times on the classpath.
        [java] 17:43:55,249 |-WARN in ch.qos.logback.classic.LoggerContext[default] - Resource [logback.xml] occurs at [jar:file:/Users/ebloch/repos/marklogic-java-bulk-load/client-api-java-1.0-3/lib/client-api-java-1.0-3.jar!/logback.xml]
        [java] 17:43:55,249 |-WARN in ch.qos.logback.classic.LoggerContext[default] - Resource [logback.xml] occurs at [jar:file:/Users/ebloch/repos/marklogic-java-bulk-load/client-api-java-1.0-3/client-api-java-1.0-3.jar!/logback.xml]
        [java] 17:43:55,261 |-INFO in ch.qos.logback.core.joran.spi.ConfigurationWatchList@1c93d6bc - URL [jar:file:/Users/ebloch/repos/marklogic-java-bulk-load/client-api-java-1.0-3/client-api-java-1.0-3.jar!/logback.xml] is not of type file
        [java] 17:43:55,296 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - debug attribute not set
        [java] 17:43:55,301 |-INFO in ch.qos.logback.classic.joran.action.LoggerAction - Setting level of logger [com.marklogic.client] to WARN
        [java] 17:43:55,301 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - End of configuration.
        [java] 17:43:55,302 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@2df6df4c - Registering current configuration as safe fallback point
        [java] 
        [java] Config: nodb: false, docsPerTrans: 200, Num Threads: 8, docsPerThread: 250
        [java] 2000 things stored took 6.66 secs
        [java] That is 300.19 docs per second    

    
Editable bits of code in loader.java
