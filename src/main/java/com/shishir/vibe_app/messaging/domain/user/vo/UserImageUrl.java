package com.shishir.vibe_app.messaging.domain.user.vo;

import com.shishir.vibe_app.shared.error.domain.Assert;

public record UserImageUrl(String value) {

    public UserImageUrl {
        Assert.field(value, value).maxLength(255);
    }
}