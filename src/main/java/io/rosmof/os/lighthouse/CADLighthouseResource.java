/*
 * La la la
 */
package io.rosmof.os.lighthouse;

import io.rosmof.os.Constants;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path(Constants.CAD_LIGHTHOUSE)
public class CADLighthouseResource {

    @Inject
    Logger logger;

    @POST
    public String monitor(CADEventModel model) {
        logger.info("called monitor");
        return "ok";
    }

}
