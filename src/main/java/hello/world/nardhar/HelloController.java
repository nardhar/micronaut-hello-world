package hello.world.nardhar;

import io.micronaut.http.annotation.*;

@Controller("/")
public class HelloController {
    @Get("/")
    public String index() {
        return "Hello World";
    }
}
