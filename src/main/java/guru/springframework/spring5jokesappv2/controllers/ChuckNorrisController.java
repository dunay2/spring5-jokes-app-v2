package guru.springframework.spring5jokesappv2.controllers;


import guru.springframework.spring5jokesappv2.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jasim
 */


@Controller
public class ChuckNorrisController {

    private final JokeService jokeService;

    public ChuckNorrisController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    String getJoke(Model model)
    {
         model.addAttribute("joke",  jokeService.getJoke() );
        return "index";
    }

}
