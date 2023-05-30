package pro.fams.presentation;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import pro.fams.application.CardServiceQuery;
import pro.fams.entities.Card;

@Named
public class CardBean {

    @Inject
    private CardServiceQuery cardServiceQuery;
    private List<Card> cardsAvailable;

    public List<Card> getCardsAvailable() {
        return cardsAvailable = cardServiceQuery.getAllCards();
    }

    public void setCardsAvailable(List<Card> CardsAvailable) {
        this.cardsAvailable = CardsAvailable;
    }

    public String fetchCards() {
        cardsAvailable = cardServiceQuery.getAllCards();
        return "success";
    }

    public String lock() {
        // todo: chamar servico de bloqueio de cartão
        return "success";
    }

    public String unLock() {
        // todo: chamar servico de desbloqueio de cartão
        return "success";
    }

    public String enableInternationalPurchases() {
        // todo: chamar servico para liberar compras internacionais de cartão
        return "success";
    }

    public String lockBuyContactless() {
        // todo: chamar servico de bloqueio de compras sem contato
        return "success";
    }

    public String unLockBuyContactless() {
        // todo: chamar servico de desbloqueio de compras sem contato
        return "success";
    }

    public String creditCardStatement() {
        // todo: chamar servico para gerar o extrato
        return "success";
    }

}
