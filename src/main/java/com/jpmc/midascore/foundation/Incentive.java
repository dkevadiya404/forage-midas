package com.jpmc.midascore.foundation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Incentive {
    private float amount;

    // Constructors
    public Incentive() {}

    public Incentive(float amount) {
        this.amount = amount;
    }

    // Getters and Setters
    public float getAmount() { return amount; }
    public void setAmount(float amount) { this.amount = amount; }
}