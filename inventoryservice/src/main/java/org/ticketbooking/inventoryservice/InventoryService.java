package org.ticketbooking.inventoryservice;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    public List<EventInventoryResponse> getAllEvents() {
        return List.of();
    }
}