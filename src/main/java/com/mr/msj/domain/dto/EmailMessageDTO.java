package com.mr.msj.domain.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmailMessageDTO {

    private String msjFrom;
    private String msjTo;
    private String subject;
    private String body;


}
