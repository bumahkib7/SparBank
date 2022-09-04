package org.codewarrior.sparbank.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Data
@Document(collection = "Bankdetails")
public class Bankdetails {

    private long id;
    private String bankName;
    private String accountNumber;
    private String ifsc;
    private String branch;
    private String address;
}
