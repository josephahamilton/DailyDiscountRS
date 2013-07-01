/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyDiscount.webservice;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import java.util.Random;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.enterprise.context.RequestScoped;

/**
 * REST Web Service
 *
 * @author ryujinkony
 */
@Path("dailyDiscount")
@RequestScoped
public class dailyDiscountResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of dailyDiscountResource
     */
    public dailyDiscountResource() {
    }

    /**
     * Retrieves representation of an instance of dailyDiscount.webservice.dailyDiscountResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    public String getText() {
        Random rand = new Random();
        Integer randInt = rand.nextInt(100);
        
        String number = randInt.toString();
        return number;
    }

   
}
