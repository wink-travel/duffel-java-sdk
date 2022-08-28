/*
 * Copyright (c) 2022. Wink
 */

package com.duffel.sdk;

import com.duffel.sdk.api.PlacesApi;
import com.duffel.sdk.model.GetPlaceSuggestions200Response;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Quick integration test
 *
 * @author Bjorn Harvold Responsibility:
 */
@Slf4j
@Disabled("Needs an API key to run")
@ContextConfiguration(classes = {DuffelSdkConfiguration.class})
@ExtendWith(SpringExtension.class)
class DuffelIntegrationTest {

    @Autowired
    private PlacesApi placesApi;

//    @BeforeEach
//    public void setUp() {
//
//    }
//
//    @AfterEach
//    public void tearDown() {
//
//    }

    @Test
    void givenDuffelAccount_whenRetrievingExchangeRates_thenVerify() {
        try {
            log.info("Testing Duffel Places...");

            final Mono<GetPlaceSuggestions200Response> response = this.placesApi.getPlaceSuggestions(null, null, null, "Osl");

            StepVerifier
                    .create(response)
                    .assertNext(comparison -> {
                        assertNotNull(response, "response should not be null");
                    })
                    .expectComplete()
                    .verify();

            log.info("Testing Duffel Places COMPLETE");
        } catch (Exception ex) {
            fail(ex.getMessage(), ex);
        }
    }

}
