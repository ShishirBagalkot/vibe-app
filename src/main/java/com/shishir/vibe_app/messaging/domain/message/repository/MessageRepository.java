package com.shishir.vibe_app.messaging.domain.message.repository;

import com.shishir.vibe_app.messaging.domain.message.aggregate.Conversation;
import com.shishir.vibe_app.messaging.domain.message.aggregate.Message;
import com.shishir.vibe_app.messaging.domain.message.vo.ConversationPublicId;
import com.shishir.vibe_app.messaging.domain.message.vo.MessageSendState;
import com.shishir.vibe_app.messaging.domain.user.aggregate.User;
import com.shishir.vibe_app.messaging.domain.user.vo.UserPublicId;

import java.util.List;

public interface MessageRepository {

    Message save(Message message, User sender, Conversation conversation);

    int updateMessageSendState(ConversationPublicId conversationPublicId, UserPublicId userPublicId, MessageSendState state);

    List<Message> findMessageToUpdateSendState(ConversationPublicId conversationPublicId, UserPublicId userPublicId);

}