package com.marv.SpringEcom.model.dto;

public record OrderItemRequest(
        int productId,
        int quantity
) {}
