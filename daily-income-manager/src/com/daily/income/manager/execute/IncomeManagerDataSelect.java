package com.daily.income.manager.execute;

import com.daily.income.manager.model.IncomeManager;
import com.daily.income.manager.service.IncomeManagerDataSelectService;
import com.daily.income.manager.service.IncomeManagerDataSelectServiceImpl;

import java.util.List;

public class IncomeManagerDataSelect {
    public static void main(String[] args) {
        IncomeManagerDataSelectService selectService = new IncomeManagerDataSelectServiceImpl();
        List<IncomeManager> incomeDataList =  selectService.getAllIncomeData();
        System.out.println("incomeDataList size : "+incomeDataList.size());
        double totalAmountTillNow = 0;
        int totaltransaction = 0;
        for(IncomeManager incomeData : incomeDataList){
            System.out.println("transactionId: "+incomeData.getIncomeManagerId()+"," +
                    " IncomeType: "+incomeData.getIncomeType()+"," +
                    " Total Amount: "+incomeData.getTotalAmount()+"," +
                    " PaymentType: "+incomeData.getPaymentType()+"," +
                    " Payment Date :"+incomeData.getPaymentDate());

            totalAmountTillNow = totalAmountTillNow+incomeData.getTotalAmount();
            totaltransaction++;
        }
        System.out.println("Total Credit Amount till now = "+totalAmountTillNow);
        System.out.println("total transaction = "+totaltransaction);
    }
}
