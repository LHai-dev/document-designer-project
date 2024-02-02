package com.document.docapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.document.docapi.client.GeneratePdfEngine;

@Service
public class GeneratePdfService {

    private final GeneratePdfEngine engine;

    @Autowired
    public GeneratePdfService(GeneratePdfEngine engine) {
        this.engine = engine;
    }

    public String generatePdf(SampleDataRequestDto sampleDataRequestDto) {
        engine.generatePdf(sampleDataRequestDto);
        return "succes";
    }

}
