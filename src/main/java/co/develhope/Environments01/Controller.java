package co.develhope.Environments01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private Environment environment;

    @GetMapping("/")
    public String getProperty(){
        String var = environment.getProperty("myCustomVar.devName");
        String var2 = environment.getProperty("myCustomVar.authCode");
        return var + " " + var2;
    }

}
