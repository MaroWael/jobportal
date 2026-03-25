package com.eazybytes.jobportal.company.service;

import com.eazybytes.jobportal.dto.CompanyDto;

import java.util.List;

public interface ICompanyService {
    List<CompanyDto> getAllCompanies();
    public boolean createCompany(CompanyDto companyDto);
    public List<CompanyDto> getAllCompaniesForAdmin();
    public void deleteCompanyById(Long id);
    public boolean updateCompanyDetails(Long id, CompanyDto companyDto);
}
