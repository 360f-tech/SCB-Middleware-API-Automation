package org.example;

import org.core360f.base.DataProviders;
import org.core360f.base.SampleFlowTesting;
import org.core360f.models.APITest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

public class SCB_E2E {

    @Parameters({"testData"})
    @Test(dataProvider = "ApiTestData", dataProviderClass = DataProviders.class )
    public void runTest(APITest.TestDetails testDetails) throws IOException {
        SampleFlowTesting.executeTest(testDetails);
    }

}
