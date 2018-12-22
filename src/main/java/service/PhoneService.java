package service;

import pojos.CommunicationPojo;
import static java.lang.String.format;

public class PhoneService implements CommunicationService
{
    @Override
    public void communicate(CommunicationPojo communicationPojo) {
        System.out.println(format("Sends SMS to %s", communicationPojo.phoneNumber));
    }
}
