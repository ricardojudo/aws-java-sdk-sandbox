package com.example.lambda.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloFunctionHandler implements RequestHandler<Integer[], Integer> {

    @Override
    public Integer handleRequest(Integer[] input, Context context) {
        context.getLogger().log("Input: " + input);

        int sum = 0;
        
        for(int s : input) {
        	sum+=s;
        }
        
        return sum;
    }

}
