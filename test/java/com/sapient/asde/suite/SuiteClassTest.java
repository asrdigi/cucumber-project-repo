package com.sapient.asde.suite;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
//@SelectClasses({com.sapient.asde.service.HelloWorldLatestTest.class,
//        com.sapient.asde.service.HelloWorldTest.class})

@SelectPackages("com.sapient.asde.service")
public class SuiteClassTest {
}
