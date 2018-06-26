package gtw;

import org.springframework.context.annotation.Bean;

public class WelcomeResult {
    private String name;
    public WelcomeResult(String name) {
        this.name = name;
    }

    public String getGreet() {
        return "CIAO E WELCOME";
    }
    public String getName() { return "" + name; }
    public String getSurname() { return "Larese"; }

}
