package com.shishir.vibe_app.messaging.domain.user.aggregate;

import com.shishir.vibe_app.messaging.domain.user.vo.AuthorityName;
import com.shishir.vibe_app.shared.error.domain.Assert;
import org.jilt.Builder;

@Builder
public class Authority {

    private AuthorityName name;

    public Authority(AuthorityName name) {
        Assert.notNull("name", name);
        this.name = name;
    }

    public AuthorityName getName() {
        return name;
    }
}