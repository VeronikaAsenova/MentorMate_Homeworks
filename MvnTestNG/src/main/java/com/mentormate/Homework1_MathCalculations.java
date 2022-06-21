package com.mentormate;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Homework1_MathCalculations {


    @DataProvider(name = "dataProvider")
    public Object[][] dpMethod() {
        return new Object[][]{{2, 3, 5}, {5, 7, 12}};
    }

        @Test(dataProvider = "dataProvider", groups = "Sum")
        public void mathSum ( int a, int b, int result){
            int sum = a + b;
            Assert.assertEquals(result, sum);

        }

        @Test(dataProvider = "dataProvider", groups = "Substraction")
        public void mathSubstraction ( int a, int b, int result){
            int substraction = a - b;
            Assert.assertEquals(result,substraction);

        }

        @Test(dataProvider = "dataProvider", groups = "Multiplication")
        public void mathMultiplication ( int a, int b, int result){
            int multiplication = a * b;
            Assert.assertEquals(result,multiplication);
        }

        @Test(dataProvider = "dataProvider", groups = "Division")
        public void mathDivision ( int a, int b, int result){
            int division = a / b;
            Assert.assertEquals(result,division);
        }
    }

