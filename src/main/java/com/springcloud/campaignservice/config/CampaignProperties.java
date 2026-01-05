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

    private Response response = new Response();

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

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }


    public static class Response {

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
}
