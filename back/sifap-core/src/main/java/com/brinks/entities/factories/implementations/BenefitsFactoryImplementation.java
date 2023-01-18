package com.brinks.entities.factories.implementations;

import com.brinks.entities.Benefit;
import com.brinks.entities.factories.BenefitsFactory;
import com.brinks.entities.implementations.BenefitImplementation;

public class BenefitsFactoryImplementation implements BenefitsFactory {
    @Override
    public Benefit makeInstance() {
        return new BenefitImplementation();
    }
}
