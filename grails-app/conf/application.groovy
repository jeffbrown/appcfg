my.test.property = 'This Is My Config Value'
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
