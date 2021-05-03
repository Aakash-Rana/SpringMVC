Replacement of Application Config.xml

````
package com.registration.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.registration.controllers")
public class ApplicationConfiguration {

}
````
