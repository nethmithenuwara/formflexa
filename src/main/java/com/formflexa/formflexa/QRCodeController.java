package com.formflexa.formflexa;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
public class QRCodeController {
    @PostMapping("/process")
    public String processQRCodeData(RequestBody String QRCodeData){
        System.out.println("Received QR Code Data: " + QRCodeData);
        return "QR Code Data Received Successfully";

    }
}
