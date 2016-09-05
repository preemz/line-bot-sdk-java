package com.linecorp.bot.model.event.message;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.Value;

@Value
@JsonTypeName("sticker")
public class StickerMessageContent implements MessageContent {
    private final String id;
    private final String packageId;
    private final String stickerId;

    @JsonCreator
    public StickerMessageContent(
            @JsonProperty("id") String id,
            @JsonProperty("packageId") String packageId,
            @JsonProperty("stickerId") String stickerId) {
        this.id = id;
        this.packageId = packageId;
        this.stickerId = stickerId;
    }
}