package org.automation.utils;

import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;
import org.automation.testdata.TestData;

import java.lang.reflect.Method;

public class DataProviderUtils {

    @DataSupplier
    public StreamEx<TestData> getData(Method method){
        System.out.println(System.getProperty("user.dir"));
        return TestDataReader.use(XlsxReader.class).
                withTarget(TestData.class).
                withSource("testdata.xlsx").
                read().
                filter(testData -> testData.testcasename.equalsIgnoreCase(method.getName()));
    }



}
