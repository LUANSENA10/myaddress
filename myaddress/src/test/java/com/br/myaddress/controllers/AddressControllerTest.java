package com.br.myaddress.controllers;

import com.br.myaddress.TestcontainersConfiguration;
import com.br.myaddress.integration.services.address.AddressService;
import com.br.myaddress.repository.AccessHistoryRepository;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import net.bytebuddy.utility.dispatcher.JavaDispatcher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.context.annotation.Import;
import org.testcontainers.containers.GenericContainer;


@Import(TestcontainersConfiguration.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
class AddressControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private AddressService addressService;

    @Autowired
    private AccessHistoryRepository repository;


    GenericContainer mockoonContainer() {
        return new GenericContainer("mockoon/cli")
                .withCommand("--data", "https://raw.githubusercontent.com/LUANSENA10/mockoon-data-/refs/heads/main/mockoon.json")
                .withAccessToHost(true)
                .withExposedPorts(3000);
    }


    @BeforeEach
    void setup() {
        RestAssured.port = port;
        repository.deleteAll();
    }

    @Test
    void shouldGetAddress() {
        mockoonContainer().start();
        given().when().get("/01001-000").then().statusCode(200);
    }

}