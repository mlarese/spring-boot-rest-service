package gtw;


import org.springframework.web.bind.annotation.*;

@RestController
public class WelcomeController {

    /**
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public WelcomeResult welcome(@RequestParam(value="name") String name){
        return new WelcomeResult(name);
    }**/

    @RequestMapping(value = "/welcome/{id}", method = RequestMethod.GET)
    public WelcomeResult welcome(@PathVariable String id){
        return new WelcomeResult(id);
    }

}
