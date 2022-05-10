package guru.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * @author jasim
 */
@Service
public class ChuckNorrisService implements  JokeService{
private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisService()
    {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {

        return chuckNorrisQuotes.getRandomQuote();
    }
}
