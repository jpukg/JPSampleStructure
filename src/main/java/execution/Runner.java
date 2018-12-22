package execution;

import pojos.BigPojo;
import pojos.CommunicationMethodPojo;

public class Runner {

    public static void main(String[] args) {
        CommunicationMethodPojo email = new CommunicationMethodPojo("Email");
        BigPojo pojo = new BigPojo("Arun", 1, "arun@email", "9999999999");
        pojo.communicate(email.service());


        CommunicationMethodPojo phone = new CommunicationMethodPojo("Phone");
        BigPojo pojo2 = new BigPojo("JP", 1, "jp@email", "8888888888");
        pojo2.communicate(phone.service());

    }
}
