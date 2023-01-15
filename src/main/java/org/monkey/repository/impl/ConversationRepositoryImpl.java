package org.monkey.repository.impl;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;
import org.monkey.entity.Conversation;
import org.monkey.repository.ConversationRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
@Accessors
@Component
@RequiredArgsConstructor
public class ConversationRepositoryImpl implements ConversationRepository {
    private final List<Conversation> conversations = new ArrayList<>();

    @Override
    public List<Conversation> findAll() {
        return conversations;
    }

    @Override
    public Optional<Conversation> findById(String email) {
        return conversations.stream()
                .filter(conversation -> conversation.getUUID().equals(email))
                .findFirst();
    }

    @Override
    public Conversation save(Conversation conversation) {
        conversations.add(conversation);
        return conversation;
    }
}
