package com.servpalindrome.repository;

import com.servpalindrome.domain.Palindrome;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PalindromeRepository extends JpaRepository<Palindrome, Integer> {
}
