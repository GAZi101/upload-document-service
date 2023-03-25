package id.co.gemardy.uploaddocument.dto.request;

import id.co.gemardy.uploaddocument.utils.DocumentTypeEnum;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UploadDocumentRequest extends BaseRequest {

    private String base64Doc;
    private DocumentTypeEnum documentType;
}
