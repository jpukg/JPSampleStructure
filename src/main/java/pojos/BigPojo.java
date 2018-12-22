package pojos;

import service.CommunicationService;

public class BigPojo {
    private final String name;
    private final int id;
    private final String email;
    private final String phone;


    public BigPojo(String name, int id, String email, String phone) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.phone = phone;
    }

    public void communicate(CommunicationService service) {
        service.communicate(new CommunicationPojo(email, phone));
    }

}
