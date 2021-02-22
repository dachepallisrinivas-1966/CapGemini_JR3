package com.cg.tddd;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/* not working in gradle */

@RunWith(JUnitPlatform.class)
@SelectPackages("in.tp.tddd.service")
public class AllTests {

}
