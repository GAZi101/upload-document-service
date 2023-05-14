package id.co.gemardy.uploaddocument.mapper;


import java.io.UnsupportedEncodingException;
import org.apache.tomcat.util.codec.binary.Base64;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import id.co.gemardy.uploaddocument.dto.request.UploadDocumentRequest;
import id.co.gemardy.uploaddocument.entity.MasterDocumentUploadEntity;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UploadDocumentMapper {

    UploadDocumentMapper INSTANCE = Mappers.getMapper(UploadDocumentMapper.class);

    @Mapping(target = "blobDocument", source = "base64Doc")
    MasterDocumentUploadEntity requestUploadConvertToEntity(UploadDocumentRequest request);

    default byte[] convertBase64ToByteArray (String base64String) throws UnsupportedEncodingException{

        return Base64.decodeBase64(base64String);
    }
}
