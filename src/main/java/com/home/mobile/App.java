package com.home.mobile;

import com.home.mobile.entrypoints.UserEntryPoint;
import io.swagger.jaxrs.config.BeanConfig;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("api")
public class App extends Application {

    public App(){
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.2");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("localhost:8080/swagger-ui");
        beanConfig.setBasePath("/api");
        beanConfig.setResourcePackage("com.home.mobile.entrypoints");
        beanConfig.setScan(true);
    }
    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add( UserEntryPoint.class );
        h.add(io.swagger.jaxrs.listing.ApiListingResource.class);
        h.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);
        return h;
    }

}
