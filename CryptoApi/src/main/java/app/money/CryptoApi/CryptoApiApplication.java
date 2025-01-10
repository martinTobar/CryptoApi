package app.money.CryptoApi;

import app.money.CryptoApi.Service.CoinService;
import app.money.CryptoApi.coin.CoinModel;
import app.money.CryptoApi.Repository.CoinRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CryptoApiApplication {



	public static void main(String[] args) {
		SpringApplication.run(CryptoApiApplication.class, args); }

		@Bean
		CommandLineRunner runner(CoinRepository coinRepository)
		{
			return args -> {
				//CoinModel coin = coinRepository.findById();
				//coinRepository.save(new CoinModel(1));
				System.out.println(coinRepository.findById(1).toString());
				System.out.println(coinRepository.findAll());
				System.out.println("Hola");
			};
		}
	}

