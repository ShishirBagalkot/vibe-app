package com.shishir.vibe_app.messaging.domain.user.vo;

import com.shishir.vibe_app.shared.error.domain.Assert;

public record AuthorityName(String name) {

    public AuthorityName {
        Assert.field("name", name).notNull();
    }
}