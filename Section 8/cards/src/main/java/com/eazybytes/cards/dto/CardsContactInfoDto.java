package com.eazybytes.cards.dto;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

// @ConfigurationProperties(prefix = "cards")
// public record CardsContactInfoDto(String message, Map<String, String> contactDetails, List<String> onCallSupport) {
// }
@ConfigurationProperties(prefix = "cards")
@Getter
@Setter
public class CardsContactInfoDto {

    private String message;
    private Map<String, String> contactDetails;
    private List<String> onCallSupport;
}
