package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Client {
    private Long id;
    private String name;
    private String mail;
    private String password;
    private List<Account> account = new ArrayList<>();
}
