package id.co.gemardy.uploaddocument.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.co.gemardy.uploaddocument.dto.request.UploadDocumentRequest;
import id.co.gemardy.uploaddocument.dto.response.UploadDocumentResponse;
import id.co.gemardy.uploaddocument.entity.MasterDocumentUploadEntity;
import id.co.gemardy.uploaddocument.mapper.UploadDocumentMapper;
import id.co.gemardy.uploaddocument.repository.MasterDocumentUploadRepository;
import id.co.gemardy.uploaddocument.service.UploadDocumentService;

@Service
public class UploadDocumentServiceImpl implements UploadDocumentService {

    private final MasterDocumentUploadRepository documentUploadRepository;
    @Autowired
    public UploadDocumentServiceImpl(MasterDocumentUploadRepository documentUploadRepository) {
        this.documentUploadRepository = documentUploadRepository;
    }

    @Override
    public UploadDocumentResponse upload(UploadDocumentRequest request) {
        MasterDocumentUploadEntity entity = UploadDocumentMapper.INSTANCE.requestUploadConvertToEntity(request);
        documentUploadRepository.save(entity);

        return UploadDocumentResponse.builder().idDocument(entity.getId()).build();
    }
    
}
