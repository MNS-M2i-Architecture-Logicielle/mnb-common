package dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import model.Account;

import java.util.List;

@Getter
@AllArgsConstructor
public class ClientResponse {
    private Long id;
    private String name;
    private String mail;
    private List<Account> accounts;
}
