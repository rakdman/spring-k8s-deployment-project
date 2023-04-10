package com.demo.springk8sproject.welcome;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepo extends JpaRepository<GuestEntity, Long> {
    GuestEntity findByFirstName(String firstName);
}
