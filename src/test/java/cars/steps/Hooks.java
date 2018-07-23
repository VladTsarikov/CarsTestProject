package cars.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import framework.BaseEntity;

public class Hooks {

    @Before
    public void before(){
        BaseEntity.before();
    }

    @After
    public void after(){

        BaseEntity.after();
        CarsTest.softAssert.assertAll();
    }



}
