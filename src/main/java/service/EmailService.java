package service;

import pojos.CommunicationPojo;
import static java.lang.String.format;

public class EmailService implements CommunicationService{

    @Override
    public void communicate(CommunicationPojo communicationPojo) {
        System.out.println(format("Sending email to %s", communicationPojo.email));
    }
}
