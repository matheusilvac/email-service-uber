package com.email_service.core.dto;

public record EmailRequest(String to, String subject, String body) {
}
