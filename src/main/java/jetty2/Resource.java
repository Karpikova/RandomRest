package jetty2;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("home")
public class Resource {
    @GET
    @Path("random")
    @Produces(MediaType.TEXT_PLAIN)
    public String TrueRandomGenerator() {
        TrueRandomGenerator trueRandomGenerator = new TrueRandomGeneratorImpl();
        return String.valueOf(trueRandomGenerator.getRandomValue());
    }
}
