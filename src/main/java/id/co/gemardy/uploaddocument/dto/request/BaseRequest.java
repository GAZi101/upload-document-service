package id.co.gemardy.uploaddocument.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BaseRequest {

    @NotBlank(message = "deviceId can not be blank !")
    private String deviceId;
    @NotBlank(message = "appVersion can not be blank !")
    private String appVersion;
}
