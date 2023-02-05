package com.example.neurogine.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.example.neurogine.exphandler.TaskException;
import com.example.neurogine.models.Merchant;
import com.example.neurogine.repository.MerchantRepository;

public class MerchantServiceImpl implements MerchantService {
//	Question 2
	@Autowired
	MerchantRepository merchantRepository;

	@Override
	public Merchant createMerchant(String name, String merchantId) {
		Merchant merchant = new Merchant();
		merchant.setId(Integer.valueOf(merchantId));
		merchant.setName(name);
		return merchantRepository.save(merchant);
	}

	@Override
	public void deleteMerchant(String merchantId) throws TaskException {
		Optional<Merchant> merchant = merchantRepository.findById(Long.parseLong(merchantId));
		if(!merchant.isPresent()) {
			throw new TaskException("Merchant not found : " + merchantId, HttpStatus.NOT_FOUND);
		}
		merchantRepository.delete(merchant.get());

	}

}
