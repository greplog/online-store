package sg.storemanager;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("product")
public class StoreManagerResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getAllProducts(){
        return "product";
    }

}
