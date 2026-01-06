package com.springcloud.campaignservice.api;

import com.springcloud.campaignservice.api.dto.CampaignResponse;
import com.springcloud.campaignservice.config.CampaignProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/campaign")
public class CampaignConfigController {

    @Autowired
    private CampaignProperties properties;

    @GetMapping("/config")
    public Map<String, Object> config() {
        return Map.of(
                "enabled", properties.isEnabled(),
                "type", properties.getType(),
                "discountRate", properties.getDiscountRate()
        );
    }

    @GetMapping("/info")
    public CampaignResponse getCampaignInfo() {

        if (!properties.isEnabled()) {
            return new CampaignResponse("Campaign disabled");
        }

        StringBuilder message = new StringBuilder();

        message.append(properties.getResponse().getMessagePrefix())
                .append(" ");

        message.append(properties.getType())
                .append(" campaign active");

        if (properties.getResponse().isIncludeDiscount()) {
            message.append(" with ")
                    .append(properties.getDiscountRate())
                    .append("% discount");
        }

        return new CampaignResponse(message.toString());
    }
}
