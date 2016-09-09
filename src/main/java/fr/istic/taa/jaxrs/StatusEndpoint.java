/**
 * JBoss, Home of Professional Open Source
 * Copyright Red Hat, Inc., and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.istic.taa.jaxrs;

import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import fr.istic.taa.jaxrs.domain.Root;

@Path("/stw")
public class StatusEndpoint {

    private static final Logger logger = Logger.getLogger(StatusEndpoint.class.getName());

    @GET
    public Response getStatus() {

        return Response.status(Response.Status.OK).entity("JO").build();
    }
    
    @GET
    @Path("/test")
    public String helloWorld() {
        return "hello";
    }

    @GET
    @Path("/root")
    @Produces(MediaType.APPLICATION_JSON)
    public Root getRoot() {
    	
    	Root r = new Root();
    	r.filmsUrl = APIConstants.BASE_URL+"/films";
    	r.peopleUrl = APIConstants.BASE_URL+"/people";
    	r.planetsUrl = APIConstants.BASE_URL+"/planets";
    	r.speciesUrl = APIConstants.BASE_URL+"/species";
    	r.starshipsUrl = APIConstants.BASE_URL+"/starships";
    	r.vehiclesUrl = APIConstants.BASE_URL+"/vehicles";
        return r;
    }
    

}

