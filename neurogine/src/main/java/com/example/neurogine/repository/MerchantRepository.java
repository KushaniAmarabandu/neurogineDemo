package com.example.neurogine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.neurogine.models.Merchant;

public interface MerchantRepository extends JpaRepository<Merchant, Long> {

}
