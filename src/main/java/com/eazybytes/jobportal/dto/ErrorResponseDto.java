package com.eazybytes.jobportal.dto;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public record ErrorResponseDto(String apiPath, HttpStatus status, Map<String, List<String>> errors, LocalDateTime errorTime) {
}
