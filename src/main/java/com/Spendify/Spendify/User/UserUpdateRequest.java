package com.Spendify.Spendify.User;

public record UserUpdateRequest(
        String surname,
        String email
) {
}