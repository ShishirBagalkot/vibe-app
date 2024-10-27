package com.shishir.vibe_app.messaging.domain.message.vo;

import org.springframework.util.Assert;

import java.util.UUID;

public record ConversationPublicId(UUID value) {
    public ConversationPublicId {
        Assert.notNull(value, "Conversation cannot be null");
    }
}