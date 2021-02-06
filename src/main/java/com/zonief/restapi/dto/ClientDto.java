package com.zonief.restapi.dto;

import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ClientDto {

    private String firstName;
    private String lastName;

}
