package id.co.gemardy.uploaddocument.mapper;

import id.co.gemardy.uploaddocument.dto.request.UploadDocumentRequest;
import id.co.gemardy.uploaddocument.entity.MasterDocumentUploadEntity;
import java.io.UnsupportedEncodingException;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-25T19:34:02+0700",
    comments = "version: 1.5.0.RC1, compiler: javac, environment: Java 18 (Oracle Corporation)"
)
public class UploadDocumentMapperImpl implements UploadDocumentMapper {

    @Override
    public MasterDocumentUploadEntity requestUploadConvertToEntity(UploadDocumentRequest request) {
        if ( request == null ) {
            return null;
        }

        MasterDocumentUploadEntity masterDocumentUploadEntity = new MasterDocumentUploadEntity();

        try {
            masterDocumentUploadEntity.setBlobDocument( convertBase64ToByteArray( request.getBase64Doc() ) );
        }
        catch ( UnsupportedEncodingException e ) {
            throw new RuntimeException( e );
        }
        if ( request.getDocumentType() != null ) {
            masterDocumentUploadEntity.setDocumentType( request.getDocumentType().name() );
        }

        return masterDocumentUploadEntity;
    }
}
