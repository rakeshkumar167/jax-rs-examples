package com.home.mobile.entrypoints;

import com.home.mobile.models.CreateUserRequestModel;
import com.home.mobile.models.CreateUserResponseModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Api
@Path("/users")
public class UserEntryPoint {

    @ApiOperation(value = "Create user",
            notes = "Create User",
            response = CreateUserResponseModel.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message =
                    "Invalid details supplied"),
            @ApiResponse(code = 404, message = "Create User operation not found")
    })
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public CreateUserResponseModel createUser(CreateUserRequestModel requestObject){
        CreateUserResponseModel responseModel = new CreateUserResponseModel();
        return responseModel;
    }

    @ApiOperation(value = "Find user by id",
            notes = "Specify a valid user id",
            response = CreateUserResponseModel.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message =
                    "Invalid user id supplied"),
            @ApiResponse(code = 404, message = "User not found")
    })
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public CreateUserResponseModel getUser(@PathParam("id") String id) {
        CreateUserResponseModel responseModel = new CreateUserResponseModel("john", "smith","myemail@home.com");
        return responseModel;
    }
}
