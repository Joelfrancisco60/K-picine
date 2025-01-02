package services;

import aspects.TimeIt;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @TimeIt
    public void hello() {
        System.out.println("Hello world !");
    }
}
