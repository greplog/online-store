package sg.manager;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import sg.storemanager.StoreManagerResource;

public class JerseyApplication extends ResourceConfig{
    public JerseyApplication() {
        register(JacksonFeature.class);
        register(StoreManagerResource.class);
    }
}
