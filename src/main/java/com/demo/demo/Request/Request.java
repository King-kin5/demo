package com.demo.demo.Request;

public record Request(
        String firstName,
        String lastName,
        String email,
        String mobileNumber,
        String address,
        String city,
        String password
) {
}
