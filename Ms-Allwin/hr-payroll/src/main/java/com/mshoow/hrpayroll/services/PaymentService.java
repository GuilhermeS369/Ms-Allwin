package com.mshoow.hrpayroll.services;

import com.mshoow.hrpayroll.entities.Payment;
import com.mshoow.hrpayroll.entities.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Value("${hr-worker.host}")
    private String workerHost;

    @Autowired
    private RestTemplate restTemplate;

    public Payment getPayment(long workerId, int days){
        //ARMAZENA O NOME DO PARAMETRO E O PARAMETRO
        Map<String, String> uriVariables = new HashMap<>();
        //SALVANDO AS DUAS INFORMAÇÕES NO MAP
        uriVariables.put("id",""+workerId);
        //FAZ A REQUISIÇÃO COM A URL PRONTA PRA RECEBER O ID, DEFINI A CLASSE A SER TRATADA E RECEBE A LISTA DE PARAMETROS
        Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class,uriVariables);

        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }



}
