package com.demo.demo.Controller;

import com.demo.demo.Request.Loginrequest;
import com.demo.demo.Request.Request;
import com.demo.demo.Response.Loginresponse;
import com.demo.demo.Response.RegistrationResponse;
import com.demo.demo.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/demo")
public class UserController {
 public final UserService service;
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(method = RequestMethod.POST, value = "/SignUp")
    public RegistrationResponse registerUser(@RequestBody Request request) {
        logger.info("Lister registration :::::::: " + request);
        return service.registerUser(request);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public Loginresponse UserLogin(@RequestBody Loginrequest loginRequest) {
        System.out.println(loginRequest);
        return service.userLogin(loginRequest);
    }

}
