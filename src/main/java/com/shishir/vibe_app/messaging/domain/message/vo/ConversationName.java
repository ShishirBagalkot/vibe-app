package com.shishir.vibe_app.messaging.domain.message.vo;

import com.shishir.vibe_app.shared.error.domain.Assert;

public record ConversationName(String name) {
    public ConversationName {
        Assert.field("name", name).minLength(3).maxLength(255);
    }
}
