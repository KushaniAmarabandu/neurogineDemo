package com.example.neurogine.services;

import com.example.neurogine.models.Merchant;

public interface MerchantService {
	
	public Merchant createMerchant(String name, String merchantId);
	
	public void deleteMerchant(String merchantId);

}
