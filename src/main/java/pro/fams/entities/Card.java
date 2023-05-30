package pro.fams.entities;

import java.util.UUID;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String number;
    private String dueDate;
    private String clientName;
    private String cvv;
    private String type;
    private Boolean locked;
    private Boolean enabledInternationalPurchase;
    private Boolean unLockedBuyContactless;
}
