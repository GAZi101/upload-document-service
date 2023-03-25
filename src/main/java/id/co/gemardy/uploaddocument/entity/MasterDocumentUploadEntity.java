package id.co.gemardy.uploaddocument.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "master_document_upload")
public class MasterDocumentUploadEntity extends BaseEntity{

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "blob_document")
    private byte[] blobDocument;

    @Column(name = "document_type", length = 14)
    private String documentType;
}
