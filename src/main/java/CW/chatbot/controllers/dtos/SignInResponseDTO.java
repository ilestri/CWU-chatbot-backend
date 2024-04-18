package CW.chatbot.controllers.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SignInResponseDTO {
    private int resultCode;
    private String resultMessage;
    private String accessToken;
    private String refreshToken;
}
