package com.inc.jhdemo.cucumber.stepdefs;

import com.inc.jhdemo.JhdemoApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhdemoApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
