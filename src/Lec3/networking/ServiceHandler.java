package Lec3.networking;

public class ServiceHandler {

    private static ApiManager api ;

    private ServiceHandler(){}

    public static ApiService getInstance() {
        if(api == null)
            api = new ApiManager();
        return api ;
    }

}
