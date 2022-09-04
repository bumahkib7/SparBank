package org.codewarrior.sparbank.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "User")
public class User {


    private long id;
    private String name;
    private String email;
    private String password;


}
