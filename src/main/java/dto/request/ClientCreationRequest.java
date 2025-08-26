package dto.request;

import lombok.Getter;

@Getter
public class ClientCreationRequest {
    private String name;
    private String mail;
    private String password;
}
