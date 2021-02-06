package com.zonief.restapi.controller;

import com.zonief.restapi.dto.ClientDto;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
@Slf4j
public class RestController {

    @GetMapping("/client")
    public ClientDto getClient() {
        return ClientDto.builder().firstName("Jean").lastName("Bobby-Schneider").build();
    }

    @PostMapping("/client")
    public boolean addClient(@RequestBody ClientDto clientDto) {
        log.info("Received {}: {}",ClientDto.class.getName(),clientDto.toString());
        return StringUtils.isNotEmpty(clientDto.getFirstName()) && StringUtils.isNotEmpty(clientDto.getLastName());
    }

}
