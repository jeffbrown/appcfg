my.test.property = 'This Is My Config Value'

grails {
    profile = 'web'
    codegen.defaultPackage = 'appcfg'
    mime {
        types = [ // the first one is the default format
                  all          : '*/*', // 'all' maps to '*' or the first available format in withFormat
                  atom         : 'application/atom+xml',
                  css          : 'text/css',
                  csv          : 'text/csv',
                  form         : 'application/x-www-form-urlencoded',
                  html         : ['text/html', 'application/xhtml+xml'],
                  js           : 'text/javascript',
                  json         : ['application/json', 'text/json'],
                  multipartForm: 'multipart/form-data',
                  rss          : 'application/rss+xml',
                  text         : 'text/plain',
                  hal          : ['application/hal+json', 'application/hal+xml'],
                  xml          : ['text/xml', 'application/xml']
        ]
        disable.accept.header.userAgents = ['Gecko', 'WebKit', 'Presto', 'Trident']
    }
    urlmapping.cache.maxsize = 1000
    controllers.defaultScope = 'singleton'
    converters.encoding = 'UTF-8'
    views.default.codec = "html"
    views.gsp {
        encoding = 'UTF-8'
        htmlcodec = 'xml' // use xml escaping instead of HTML4 escaping
        codecs {
            expression = 'html' // escapes values inside ${}
            scriptlet = 'html' // escapes output from scriptlets in GSPs
            taglib = 'none' // escapes output from taglibs
            staticparts = 'none' // escapes output from static template parts
        }
    }
}

info.app {
    name = '@info.app.name@'
    version = '@info.app.version@'
    grailsVersion = '@info.app.grailsVersion@'
}

spring.groovy.template['check-template-location'] = false

dataSource {
    pooled = true
    jmxExport = true
    driverClassName = 'org.h2.Driver'
    username = 'sa'
    password = ''
}
environments {
    development {
        dataSource {
            dbCreate = 'create-drop'
            url = 'jdbc:h2:file:myDevDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE'
        }
    }
}
