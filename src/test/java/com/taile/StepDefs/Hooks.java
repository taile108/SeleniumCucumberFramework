package com.taile.StepDefs;

import org.junit.After;
import org.junit.Before;

import static com.taile.BaseClass.closeDriver;
import static com.taile.BaseClass.initiateDriver;

public class Hooks {

    @Before
    public void setup(){
        initiateDriver();
    }

    @After
    public void close(){
        closeDriver();
    }
}
