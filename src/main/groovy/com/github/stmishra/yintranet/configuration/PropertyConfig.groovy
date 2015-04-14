package com.github.stmishra.yintranet.configuration

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.springframework.context.annotation.PropertySource

/**
 * Created by santoshm1 on 4/14/15.
 */
@Configuration
@PropertySource('classpath:common.properties')
class PropertyConfig {

    @Configuration
    @Profile('test')
    @PropertySource('classpath:env-test.properties')
    static class Test{}

    @Configuration
    @Profile('dev')
    @PropertySource('classpath:env-dev.properties')
    static class Dev{}

    @Configuration
    @Profile('production')
    @PropertySource('classpath:env-production.properties')
    static class Prod{}
}
