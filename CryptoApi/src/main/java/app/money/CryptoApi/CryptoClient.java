package app.money.CryptoApi;

import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Map;

@Component
public class CryptoClient {

    private final RestClient restClient;
    private final String BASE_URI = "https://pro-api.coinmarketcap.com/v2/cryptocurrency/quotes/latest";

    public CryptoClient() {
        this.restClient = RestClient.builder()
                //.requestFactory(new HttpComponentsClientHttpRequestFactory())
                //.messageConverters(converters -> converters.add())
                .baseUrl(BASE_URI)
                //.defaultUriVariables(Map.of("variable", "foo"))
                .defaultHeader("X-CMC_PRO_API_KEY", "f0451f53-0037-47ac-89b7-699638f9f665")
                .defaultHeader("Content-Type", "application/json")//.defaultCookie("My-Cookie", "Bar")
                //.requestInterceptor(myCustomInterceptor)
                //.requestInitializer(myCustomInitializer)
                .build();
    }

    public String getBtcCurrentValue()
    {
        URI uri = UriComponentsBuilder
                .fromUriString(BASE_URI)
                .queryParam("id",1)
                .build()
                .expand()
                .toUri();
        return restClient.get()
                .uri(uri)
                .retrieve()
                .body(String.class);
    }
}
