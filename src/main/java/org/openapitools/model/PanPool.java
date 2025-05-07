package org.openapitools.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "pan_pool")
public class PanPool {

    @Id
    private String id;

    private String pan;
    private String expiry;
    private boolean used;
}
