package com.cucumber.suiteTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.cucumber.runner.RunSegundoCaso;

@RunWith(Suite.class)
@SuiteClasses({RunSegundoCaso.class})
public class AllTests {

}
