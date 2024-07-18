package org.stepdefinition;

import org.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

@Before
public void bef() {
ChromeBrowser();
maxwindow();
}

@After
public void aft() {
closeBrowser();
}

}
