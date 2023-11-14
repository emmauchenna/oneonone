package com.kloudvista.onetoone.service;

import com.kloudvista.onetoone.domain.BioDetail;
import com.kloudvista.onetoone.repository.BioDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BioDetailServiceImpl implements BioDetailService {
    @Autowired
    private BioDetailRepository repository;
    @Override
    public void saveBioDetail(BioDetail bioDetail) {
        repository.save(bioDetail);
    }

    @Override
    public void saveBioDetails(List<BioDetail> bioDetails) {
        repository.saveAll(bioDetails);
    }

    @Override
    public List<BioDetail> getAll() {
        return repository.findAll();
    }

    @Override
    public BioDetail getBioDetailById(long id) {
        Optional<BioDetail> byId = repository.findById(id);
        if(byId.isPresent())
            return byId.get();
        return null;
    }
}
