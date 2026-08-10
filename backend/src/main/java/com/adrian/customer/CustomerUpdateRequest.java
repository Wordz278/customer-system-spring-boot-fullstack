package com.adrian.customer;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {
}
