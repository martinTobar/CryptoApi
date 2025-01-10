package app.money.CryptoApi.Repository;
import app.money.CryptoApi.coin.CoinModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CoinRepository extends JpaRepository<CoinModel, Integer> {

}
