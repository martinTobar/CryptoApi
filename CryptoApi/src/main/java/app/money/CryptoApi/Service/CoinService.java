package app.money.CryptoApi.Service;

import app.money.CryptoApi.Repository.CoinRepository;
import app.money.CryptoApi.coin.CoinModel;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CoinService {
    private final CoinRepository coinRepository;

    public CoinService(CoinRepository coinRepository) {
        this.coinRepository = coinRepository;
    }

    public Optional<CoinModel> getData(int id)
        {
            return coinRepository.findById(id);
        }
}
