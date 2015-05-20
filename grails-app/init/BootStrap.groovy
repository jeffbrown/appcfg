class BootStrap {

    def grailsApplication
    
    def init = { servletContext ->
        grailsApplication.config.toProperties().each { k, v ->
            println k + " = " + v
        }
        if(!demo.Person.count()) {
            new demo.Person(name: 'Jeff').save()
        }

        def cfgValue = grailsApplication.config.my.test.property
        println "Config Value: $cfgValue"
    }
}
