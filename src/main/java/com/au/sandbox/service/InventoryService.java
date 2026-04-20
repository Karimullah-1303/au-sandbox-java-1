package com.au.sandbox.service;

// BUG: The @Service annotation is intentionally missing here.
// Students must read the terminal crash logs, identify the missing Bean exception, 
// and add @Service to fix the microservice.

public class InventoryService {

    public String checkInventoryHealth() {
        return "Inventory Database Connected. System operational.";
    }
}
