package id.co.gemardy.uploaddocument.dto.response;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BaseResponse {

    private String responseCode;
    private String message;
    private Object dataResult;

    public BaseResponse(String responseCode, Object dataResult, String message) {
        this.responseCode = responseCode;
        this.dataResult = dataResult;
        this.message = message;
    }
}
