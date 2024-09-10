package com.thaiscake.api.domain.orderItens;

import java.util.UUID;

public record OrderItensRequestDTO(UUID order_id, UUID item_id) {
}
