package com.springcloud.campaignservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
@ConfigurationProperties(prefix = "campaign.response")
public class CampaignResponseProperties {

    private String messagePrefix;
    private boolean includeDiscount;

    public String getMessagePrefix() {
        return messagePrefix;
    }

    public void setMessagePrefix(String messagePrefix) {
        this.messagePrefix = messagePrefix;
    }

    public boolean isIncludeDiscount() {
        return includeDiscount;
    }

    public void setIncludeDiscount(boolean includeDiscount) {
        this.includeDiscount = includeDiscount;
    }
}

