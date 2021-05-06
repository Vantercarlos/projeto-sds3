package com.devsuperior.devvendas.service;

import com.devsuperior.devvendas.dto.SellerDTO;
import com.devsuperior.devvendas.entities.Seller;
import com.devsuperior.devvendas.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public List<SellerDTO> findAll(){
        List<Seller> result = sellerRepository.findAll();
        return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
    }
}
