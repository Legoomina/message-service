package org.monkey.repository;

import org.monkey.entity.Conversation;

import java.util.List;
import java.util.Optional;

public interface ConversationRepository {
    List<Conversation> findAll();
    Optional<Conversation> findById(String email);
    Conversation save(Conversation conversation);
}
