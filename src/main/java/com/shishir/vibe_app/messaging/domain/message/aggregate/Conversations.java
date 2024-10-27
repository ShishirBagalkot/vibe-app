package com.shishir.vibe_app.messaging.domain.message.aggregate;

import com.shishir.vibe_app.shared.error.domain.Assert;

import java.util.List;

public record Conversations(List<Conversation> conversations) {

    public Conversations {
        Assert.field("conversations", conversations).notNull().noNullElement();
    }
}