package com.prahs.clinical6.servicename.config;

import com.prahs.clinical6.servicename.ServiceNameApplication;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT,
    classes = ServiceNameApplication.class)
@ActiveProfiles("test")
public class DevIntegrationConfig {

}
