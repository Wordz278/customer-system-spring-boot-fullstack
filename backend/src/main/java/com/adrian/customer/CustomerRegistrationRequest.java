package com.adrian.customer;

public record CustomerRegistrationRequest(
        String name,
        String email,
        Integer age
) {
}
