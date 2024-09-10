package com.thaiscake.api.domain.order;

import java.util.UUID;

public record OrderRequestDTO(String quantity, UUID client_id) {

}
