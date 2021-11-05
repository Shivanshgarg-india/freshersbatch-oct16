package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
@interface Test{
    String test_case();
}

@Test(test_case = "1")
class Demo{
    // here it shows that test cases methord with annotation
}