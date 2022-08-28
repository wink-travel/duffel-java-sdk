package com.duffel.sdk;

import com.duffel.sdk.api.AircraftApi;
import com.duffel.sdk.api.AirlineInitiatedChangesApi;
import com.duffel.sdk.api.AirlinesApi;
import com.duffel.sdk.api.AirportsApi;
import com.duffel.sdk.api.BookingApi;
import com.duffel.sdk.api.DuffelPaymentsApi;
import com.duffel.sdk.api.NotificationsApi;
import com.duffel.sdk.api.OfferRequestsApi;
import com.duffel.sdk.api.OffersApi;
import com.duffel.sdk.api.OrderCancellationsApi;
import com.duffel.sdk.api.OrderChangeOffersApi;
import com.duffel.sdk.api.OrderChangeRequestsApi;
import com.duffel.sdk.api.OrderChangesApi;
import com.duffel.sdk.api.OrdersApi;
import com.duffel.sdk.api.PartialOfferRequestsApi;
import com.duffel.sdk.api.PaymentIntentsApi;
import com.duffel.sdk.api.PaymentsApi;
import com.duffel.sdk.api.PlacesApi;
import com.duffel.sdk.api.RefundsApi;
import com.duffel.sdk.api.SeatMapsApi;
import com.duffel.sdk.api.SupportingResourcesApi;
import com.duffel.sdk.api.WebhooksApi;
import com.duffel.sdk.invoker.ApiClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Created on: 8/18/22.
 *
 * @author Bjorn Harvold
 * Responsibility:
 */
@Configuration
public class DuffelSdkConfiguration {

    @Value("${duffel.api.url:https://api.duffel.com}")
    private String duffelBaseUrl;

    @Value("${duffel.version}")
    private String apiVersion;

    @Value("${duffel.api.key}")
    private String apiKey;

    @Bean(name = "webClient")
    WebClient webClient() {
        return WebClient.builder()
                .baseUrl(this.duffelBaseUrl)
                .defaultHeaders(headers -> {
                    headers.setBearerAuth(this.apiKey);
                    headers.add("Duffel-Version", this.apiVersion);
                    headers.add("Accept-Encoding", "gzip");
                    headers.add("Accept", "application/json");
                })
                .build();
    }

    @Bean
    public ApiClient apiClient() {
        return new ApiClient(webClient());
    }

    @Bean(name = "aircraftApi")
    public AircraftApi aircraftApi() {
        return new AircraftApi(apiClient());
    }

    @Bean(name = "airlineInitiatedChangesApi")
    public AirlineInitiatedChangesApi airlineInitiatedChangesApi() {
        return new AirlineInitiatedChangesApi(apiClient());
    }

    @Bean(name = "airlinesApi")
    public AirlinesApi airlinesApi() {
        return new AirlinesApi(apiClient());
    }

    @Bean(name = "airportsApi")
    public AirportsApi airportsApi() {
        return new AirportsApi(apiClient());
    }

    @Bean(name = "bookingApi")
    public BookingApi bookingApi() {
        return new BookingApi(apiClient());
    }

    @Bean(name = "duffelPaymentsApi")
    public DuffelPaymentsApi duffelPaymentsApi() {
        return new DuffelPaymentsApi(apiClient());
    }

    @Bean(name = "notificationsApi")
    public NotificationsApi notificationsApi() {
        return new NotificationsApi(apiClient());
    }

    @Bean(name = "offerRequestsApi")
    public OfferRequestsApi offerRequestsApi() {
        return new OfferRequestsApi(apiClient());
    }

    @Bean(name = "offersApi")
    public OffersApi offersApi() {
        return new OffersApi(apiClient());
    }

    @Bean(name = "orderCancellationsApi")
    public OrderCancellationsApi orderCancellationsApi() {
        return new OrderCancellationsApi(apiClient());
    }

    @Bean(name = "orderChangeOffersApi")
    public OrderChangeOffersApi orderChangesOffersApi() {
        return new OrderChangeOffersApi(apiClient());
    }

    @Bean(name = "orderChangeRequestsApi")
    public OrderChangeRequestsApi orderChangeRequestApi() {
        return new OrderChangeRequestsApi(apiClient());
    }

    @Bean(name = "orderChangesApi")
    public OrderChangesApi orderChangesApi() {
        return new OrderChangesApi(apiClient());
    }

    @Bean(name = "ordersApi")
    public OrdersApi ordersApi() {
        return new OrdersApi(apiClient());
    }

    @Bean(name = "partialOfferRequestsApi")
    public PartialOfferRequestsApi partialOfferRequestsApi() {
        return new PartialOfferRequestsApi(apiClient());
    }

    @Bean(name = "paymentIntentsApi")
    public PaymentIntentsApi paymentIntentsApi() {
        return new PaymentIntentsApi(apiClient());
    }

    @Bean(name = "paymentsApi")
    public PaymentsApi paymentsApi() {
        return new PaymentsApi(apiClient());
    }

    @Bean(name = "placesApi")
    public PlacesApi placesApi() {
        return new PlacesApi(apiClient());
    }

    @Bean(name = "refundsApi")
    public RefundsApi refundsApi() {
        return new RefundsApi(apiClient());
    }

    @Bean(name = "seatMapsApi")
    public SeatMapsApi seatMapsApi() {
        return new SeatMapsApi(apiClient());
    }

    @Bean(name = "supportingResourcesApi")
    public SupportingResourcesApi supportingResourcesApi() {
        return new SupportingResourcesApi(apiClient());
    }

    @Bean(name = "webhooksApi")
    public WebhooksApi webhooksApi() {
        return new WebhooksApi(apiClient());
    }
}
