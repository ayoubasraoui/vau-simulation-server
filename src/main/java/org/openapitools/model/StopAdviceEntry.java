package org.openapitools.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document(collection = "stopadvices")
public class StopAdviceEntry {

    @Id
    private String id;

    private String cardholderAccountNumber;
    private String cardAcceptorId;
    private String merchantName;
    private LocalDate startDate;

    private Integer issuerSegmentId;
    private String responseCode;
    private String responseMessage;

    // Optionally: rejection info
    private String rejectCode;
    private String rejectMessage;

    // Getters and Setters here or use @Data if using Lombok
}
