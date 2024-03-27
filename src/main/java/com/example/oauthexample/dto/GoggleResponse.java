package com.example.oauthexample.dto;

import java.util.Map;

public class GoggleResponse implements OAuth2Response {

    private final Map<String, Object> attribute;

    public GoggleResponse(Map<String, Object> attribute) {
        this.attribute = attribute;
    }

    @Override
    public String getProvider() {
        return "goggle";
    }

    @Override
    public String getProviderId() {
        return attribute.get("sub").toString();
    }

    @Override
    public String getEmail() {
        return attribute.get("email").toString();
    }

    @Override
    public String getName() {
        return attribute.get("name").toString();
    }
}
