package id.co.gemardy.uploaddocument.service;

import id.co.gemardy.uploaddocument.dto.request.UploadDocumentRequest;
import id.co.gemardy.uploaddocument.dto.response.UploadDocumentResponse;

public interface UploadDocumentService {
    
    UploadDocumentResponse upload(UploadDocumentRequest request);
}
