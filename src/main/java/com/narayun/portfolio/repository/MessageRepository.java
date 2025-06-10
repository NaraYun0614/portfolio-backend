package com.narayun.portfolio.repository;

import com.narayun.portfolio.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
