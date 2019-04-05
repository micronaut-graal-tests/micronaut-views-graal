package example.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.ModelAndView;

@Controller("/views")
public class ViewsController {

    @Get("/")
    public ModelAndView<User> modelAndView() {
        return new ModelAndView<>("dir/home", new User("Iván", true));
    }
}
