package com.example.messagingsystem.message;

import lombok.*;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EmiDebitMessage {
    private String id;
    private Long emiAmount;
    private String accountId;

}
