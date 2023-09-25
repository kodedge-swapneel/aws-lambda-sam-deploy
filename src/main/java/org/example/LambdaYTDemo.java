package org.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaYTDemo implements RequestHandler<String, String> {
    @Override
    public String handleRequest(String input, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Event:"+input);
        return "test message lambda function";
    }
}
