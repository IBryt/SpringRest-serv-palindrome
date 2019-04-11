package com.servpalindrome.domain;

import javax.persistence.Entity;

@Entity
public class Palindrome extends Model {
    private String value;
    private String min;
    private String max;

    public Palindrome() { }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }
}
