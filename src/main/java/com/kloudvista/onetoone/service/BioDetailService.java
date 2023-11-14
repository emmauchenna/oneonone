package com.kloudvista.onetoone.service;

import com.kloudvista.onetoone.domain.BioDetail;
import com.kloudvista.onetoone.domain.Employee;

import java.util.List;

public interface BioDetailService {
    void  saveBioDetail(BioDetail employee);
    void  saveBioDetails(List<BioDetail> employee);
    List<BioDetail> getAll();
    BioDetail getBioDetailById(long id);
}
