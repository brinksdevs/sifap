package com.brinks.entities.factories.implementations;

import com.brinks.entities.CompanyChart;
import com.brinks.entities.factories.CompanyChartsFactory;
import com.brinks.entities.implementations.CompanyChartImplementation;

public class CompanyChartsFactoryImplementation implements CompanyChartsFactory
{
    @Override
    public CompanyChart makeInstance() {
        return new CompanyChartImplementation();
    }
}
