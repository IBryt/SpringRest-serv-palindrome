package com.servpalindrome.service;

import com.servpalindrome.domain.Palindrome;
import com.servpalindrome.repository.PalindromeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PalindromeService {

    private PalindromeRepository palindromeRepository;

    @Autowired
    public PalindromeService(PalindromeRepository palindromeRepository) {
        this.palindromeRepository = palindromeRepository;
    }

    public List<Palindrome> findAll() {
        return palindromeRepository.findAll();
    }

    public Palindrome create(Palindrome palindrome) {
        return palindromeRepository.save(palindrome);
    }
}
