package io.micronaut.inject.foreach.noqualifier;

import io.micronaut.context.annotation.Requires;
import jakarta.inject.Singleton;

@Requires(property = "spec", value = "EachBeanNoQualifierSpec")
@Singleton
public class Bar implements MyService {
    @Override
    public String getName() {
        return "bar";
    }
}
