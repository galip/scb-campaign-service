package com.springcloud.campaignservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
@ConfigurationProperties(prefix = "campaign")
public class CampaignProperties {

    private boolean enabled;
    private String type;
    private int discountRate;

    private CampaignResponseProperties response = new CampaignResponseProperties();

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public CampaignResponseProperties getResponse() {
        return response;
    }

    public void setResponse(CampaignResponseProperties response) {
        this.response = response;
    }
}
