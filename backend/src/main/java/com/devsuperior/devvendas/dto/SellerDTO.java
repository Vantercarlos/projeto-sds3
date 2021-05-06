package com.devsuperior.devvendas.dto;

import com.devsuperior.devvendas.entities.Seller;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SellerDTO {

    private  Long id;
    private String name;

    public SellerDTO(Seller entity) {
        id = entity.getId();
        name = entity.getName();
    }
}
