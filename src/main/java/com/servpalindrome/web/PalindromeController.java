package com.servpalindrome.web;

import com.servpalindrome.domain.Palindrome;
import com.servpalindrome.service.PalindromeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/palindrome")
public class PalindromeController {

    private PalindromeService palindromeService;

    @Autowired
    public PalindromeController(PalindromeService palindromeService) {
        this.palindromeService = palindromeService;
    }

    @GetMapping
    public List<Palindrome> findAll() {
        return palindromeService.findAll();
    }

    @PostMapping
    public Palindrome create(@Valid @RequestBody Palindrome palindrome) {
        return palindromeService.create(palindrome);
    }
}
