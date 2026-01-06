package com.springcloud.campaignservice.api.dto;

public class CampaignResponse {

    private String message;

    public CampaignResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
