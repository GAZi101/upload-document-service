package id.co.gemardy.uploaddocument.adapter;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import id.co.gemardy.uploaddocument.dto.response.BaseResponse;

@Service
public class APIAdapter {

    public ResponseEntity<?> createResponse(Object object) {
        BaseResponse baseResponse = new BaseResponse("00", object, "Success");

        return ResponseEntity.ok(baseResponse);
    }
}
