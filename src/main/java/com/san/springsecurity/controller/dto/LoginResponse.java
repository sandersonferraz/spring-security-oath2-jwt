package com.san.springsecurity.controller.dto;

public record LoginResponse(String accessToken, Long expiresIn) {
}
