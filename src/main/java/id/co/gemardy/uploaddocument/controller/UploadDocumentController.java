package id.co.gemardy.uploaddocument.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import id.co.gemardy.uploaddocument.adapter.APIAdapter;
import id.co.gemardy.uploaddocument.dto.request.UploadDocumentRequest;
import id.co.gemardy.uploaddocument.service.UploadDocumentService;
import jakarta.validation.Valid;

@RestController
public class UploadDocumentController {

    private final UploadDocumentService documentService;
    private final APIAdapter apiAdapter;

    @Autowired
    public UploadDocumentController(UploadDocumentService documentService, APIAdapter apiAdapter) {
        this.documentService = documentService;
        this.apiAdapter = apiAdapter;
    
    }

    @PostMapping("/upload-document")
    @ResponseBody
    public ResponseEntity<?> applyMortgage(@RequestBody @Valid UploadDocumentRequest uploadRequest) {
        return apiAdapter.createResponse(documentService.upload(uploadRequest));
    }
    
}
