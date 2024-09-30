package com.example.Tondeuse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v0/tondeuse")
public class TondeuseController {

    @Autowired
    private TondeuseService tondeuseService;

    @PostMapping
    public TondeuseResponse execTondeuses(@RequestBody TondeuseRequest request) {
        return tondeuseService.execTondeuses(request);
    }
}
