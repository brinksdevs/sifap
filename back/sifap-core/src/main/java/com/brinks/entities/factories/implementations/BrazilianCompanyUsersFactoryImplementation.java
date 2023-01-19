package com.brinks.entities.factories.implementations;

import com.brinks.entities.CompanyUser;
import com.brinks.entities.factories.BrazilianCompanyUsersFactory;
import com.brinks.entities.factories.CNPJsFactory;
import com.brinks.entities.implementations.BrazilianCompanyUserImplementation;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BrazilianCompanyUsersFactoryImplementation implements BrazilianCompanyUsersFactory {

    private final CNPJsFactory cnpjsFactory;

    @Override
    public CompanyUser makeInstance() {
        return new BrazilianCompanyUserImplementation(this.cnpjsFactory.makeInstance());
    }
}
