package example.micronaut;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.ModelAndView;
import io.micronaut.views.View;

@Controller("/views")
public class ViewsController {

    @Get("/freemarker")
    public ModelAndView<User> freemaker() {
        return new ModelAndView<>("freemarker/home", new User("Iván", true));
    }

    @View("/freemarker/home")
    @Get("/freemarker-view")
    public HttpResponse<User> freemakerPojoView() {
        return HttpResponse.ok(new User("Iván", true));
    }
}
