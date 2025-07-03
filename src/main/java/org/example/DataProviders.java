package org.example;


import org.core360f.Utils.Utilities;
import org.core360f.models.APITest;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import java.io.IOException;
import java.nio.file.Path;


public class DataProviders {

    @DataProvider(name = "ApiTestData")
    public static Object[][] getApiTestData(ITestContext context) throws IOException {
        String filePath = context.getCurrentXmlTest().getParameter("testData");
        Path path = Utilities.copyFileContent(filePath);
        APITest  apiTest = Utilities.readjsonFile(path);
        Object[][] testData = new Object[apiTest.getTest().size()][1];
        for (int i = 0; i < apiTest.getTest().size(); i++) {

            Utilities.readjsonFile(path);
            testData[i][0] = apiTest.getTest().get(i);
        }

        return testData;
    }
}
