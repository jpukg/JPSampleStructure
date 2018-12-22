package pojos;

import service.CommunicationService;

public class CommunicationMethodPojo {

    private final String method;

    public CommunicationMethodPojo(String method) {
        this.method = method;
    }

    public CommunicationService service(){
        return CommunicationService.getInstance(this.method);
    }
}
