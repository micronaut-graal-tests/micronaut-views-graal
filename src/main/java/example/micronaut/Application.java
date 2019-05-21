package example.micronaut;

import io.micronaut.core.annotation.TypeHint;
import io.micronaut.runtime.Micronaut;

@TypeHint(value = {
        org.apache.velocity.runtime.resource.ResourceManagerImpl.class,
        org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader.class,
        org.apache.velocity.runtime.resource.ResourceCacheImpl.class,
        org.apache.velocity.runtime.ParserPoolImpl.class,
        org.apache.velocity.runtime.directive.Break.class,
        org.apache.velocity.runtime.directive.Define.class,
        org.apache.velocity.runtime.directive.Evaluate.class,
        org.apache.velocity.runtime.directive.Foreach.class,
        org.apache.velocity.runtime.directive.Include.class,
        org.apache.velocity.runtime.directive.Macro.class,
        org.apache.velocity.runtime.directive.Parse.class,
        org.apache.velocity.runtime.directive.Stop.class,
        org.apache.velocity.util.introspection.ConversionHandlerImpl.class,
        org.apache.velocity.util.introspection.UberspectImpl.class},
        accessType = TypeHint.AccessType.ALL_PUBLIC)
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class);
    }
}