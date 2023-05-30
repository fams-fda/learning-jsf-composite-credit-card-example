package pro.fams.application;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.ejb.Stateless;
import pro.fams.entities.Card;

@Stateless
public class CardServiceQuery {

    private List<Card> cards;

    public CardServiceQuery() {
        super();
        // TODO: Use mock service
        cards = new ArrayList<>();
        cards.add(new Card(UUID.randomUUID(), "5100 **** **** 0001", "01/2030", "NIKOLA TESLA", "069", "GRAPHENE CARD",
                false, true, true));
        cards.add(new Card(UUID.randomUUID(), "5200 **** **** 0002", "01/2025", "NIKOLA TESLA", "069", "TURMALINE CARD",
                true, false, false));
        cards.add(new Card(UUID.randomUUID(), "5300 **** **** 0003", "01/2026", "NIKOLA TESLA", "069",
                "BLACK UNLIMITED CARD", false, true, false));
        cards.add(new Card(UUID.randomUUID(), "5400 **** **** 0004", "01/2027", "NIKOLA TESLA", "069", "GALAXY CARD",
                false, true, true));
        cards.add(new Card(UUID.randomUUID(), "5500 **** **** 0005", "01/2023", "NIKOLA TESLA", "069",
                "DARK MATTER CARD", false, false, true));
    }

    public List<Card> getAllCards() {
        return cards;
    }
}
