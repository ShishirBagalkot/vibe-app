package com.shishir.vibe_app.messaging.domain.message.aggregate;

import com.shishir.vibe_app.shared.error.domain.Assert;

import java.util.List;

public record Messages(List<Messages> messages) {
    public Messages {
        Assert.field("messages", messages).notNull().noNullElement();
    }
}