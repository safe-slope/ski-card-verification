package io.github.safeslope.skicard.controller;

import io.github.safeslope.skicard.dto.VerifyCardRequest;
import io.github.safeslope.skicard.dto.VerifyCardResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/ski-card")
public class SkiCardVerificationController {

    @PostMapping("/verify")
    public VerifyCardResponse verify(@RequestBody VerifyCardRequest request) {
        //Dummy
        return new VerifyCardResponse(
                true,                     
                "ACTIVE",                  
                001,                      
                "Card verified (dummy service)"
        );
    }
}
