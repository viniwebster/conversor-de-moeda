package com.viniwebs.domain;

public record Conversion(String base_code, String target_code, Double conversion_rate, Double conversion_result) {
}
