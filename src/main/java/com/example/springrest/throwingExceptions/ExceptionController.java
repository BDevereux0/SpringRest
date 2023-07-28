package com.example.springrest.throwingExceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;


//Uncomment annotation to restore function
//@RestController
public class ExceptionController {

    private PaymentService paymentService;

    public ExceptionController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    //This method is used for custom exception handling. How it works:
    //1. details = a thrown exception because that's how its coded.
    //2. try to run the service (which is step 1 and = an exception)
    //3. Catch the exception and send out a ResponseEntity
    @PostMapping("/payment")
    public ResponseEntity makePayment(){
        try {
            PaymentDetails details = paymentService.processPayment();

            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .header("Payment status", "gooodMkay")
                    .body(details);
        }catch (NotEnoughMoneyException e){
            ErrorDetails errorDetails = new ErrorDetails();
            errorDetails.setMessage("Not enough money to make payment");
            errorDetails.setNumber(10);

            return ResponseEntity
                    .badRequest()
                    .body(errorDetails);
        }

    }

    //purpose of this method is to use @RestControllerAdvice, which reduces the code amount
    //see above method for comparison.
    @PostMapping("/payment2")
    public ResponseEntity<PaymentDetails> makePayment2(){

            PaymentDetails paymentDetails = paymentService.processPayment2();
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(paymentDetails);
    }
}
