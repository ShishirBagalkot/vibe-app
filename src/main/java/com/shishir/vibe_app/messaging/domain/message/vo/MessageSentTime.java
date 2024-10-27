package com.shishir.vibe_app.messaging.domain.message.vo;

import com.shishir.vibe_app.shared.error.domain.Assert;

import java.time.Instant;

public record MessageSentTime(Instant date) {
    public MessageSentTime {
        Assert.field("date", date).notNull();
    }
}
