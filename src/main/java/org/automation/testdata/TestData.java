package org.automation.testdata;

import com.creditdatamw.zerocell.annotation.Column;
import com.creditdatamw.zerocell.converter.IntegerConverter;

public class TestData {

    @Column(index = 0,name="testcasename")
    public String testcasename;

    @Column(index=1,name="username")
    public String userName;

    @Column(index=2,name="password")
    public String password;

    @Column(index=3,name="firstname")
    public String firstName;

}
