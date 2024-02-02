package com.document.docapi.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.document.docapi.api.SampleDataRequestDto;

@FeignClient(name = "generatePdfEngine-service", url = "${url.expressjs.restfull.api}")
public interface GeneratePdfEngine {

    @PostMapping
    SampleDataRequestDto generatePdf(@RequestBody SampleDataRequestDto sampleDataRequestDto);

}
