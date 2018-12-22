package service;

import pojos.CommunicationPojo;

public interface CommunicationService {

    void communicate(CommunicationPojo communicationPojo);

    static  CommunicationService getInstance(String method) {
        switch(method){
            case "Email" : return new EmailService();
            case "Phone" : return new PhoneService();
        }
        return new EmailService();
    }
}
