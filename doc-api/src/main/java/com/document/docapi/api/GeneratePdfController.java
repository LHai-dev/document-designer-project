package com.document.docapi.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GeneratePdfController {

    private final GeneratePdfService generatePdfService;


    @PostMapping("/generate")
    public ResponseEntity<?> generatePdfUsingNodeEngine(@RequestBody SampleDataRequestDto sampleDataRequestDto) {

        return ResponseEntity.ok().body(generatePdfService.generatePdf(sampleDataRequestDto)) ;
    }
	@GetMapping("/public")
	public String getEveryoneText() {
		return "Both ADMIN and USER can access this!!";
	}

	@GetMapping("/user")
	public String getUserText() {
		return "hello USER";
	}

}
