class BootStrap {

    def grailsApplication
    
    def init = { servletContext ->
        if(!demo.Person.count()) {
            new demo.Person(name: 'Jeff').save()
        }

        def cfgValue = grailsApplication.config.my.test.property
        println "Config Value: $cfgValue"
    }
}
