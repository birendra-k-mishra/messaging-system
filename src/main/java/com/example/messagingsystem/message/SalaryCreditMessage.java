package com.example.messagingsystem.message;

import lombok.*;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SalaryCreditMessage {
    private String id;
    private Long amount;
    private String accountNo;

}
