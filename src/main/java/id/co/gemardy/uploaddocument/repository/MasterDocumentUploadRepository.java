package id.co.gemardy.uploaddocument.repository;

import id.co.gemardy.uploaddocument.entity.MasterDocumentUploadEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MasterDocumentUploadRepository extends JpaRepository<MasterDocumentUploadEntity, String> {
}
