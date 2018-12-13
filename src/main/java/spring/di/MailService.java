package spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MailService {
    @Autowired
    private Environment environment;
    public void sendMail()
    {
        System.out.println("sending mail");
        System.out.println("Env sender"+ environment.getProperty("OS"));
    }
}
