package com.cognizant.loan;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @GetMapping("/{number}")
    public Loan getLoan(@PathVariable String number) {
        return new Loan(number, "Bike", 40000, 258, 18,"1 year");
    }

    static class Loan {
        private String number;
        private String type;
        private double loan;
        private int emi;
        private int tenure;
        private String repayperiod;

        public Loan(String number, String type, double loan, int emi, int tenure,String repayperiod) {
            this.number = number;
            this.type = type;
            this.loan = loan;
            this.emi = emi;
            this.tenure = tenure;
            this.repayperiod = repayperiod;
        }

        public String getNumber() { return number; }
        public String getType() { return type; }
        public double getLoan() { return loan; }
        public int getEmi() { return emi; }
        public int getTenure() { return tenure; }
        public String getrepayperiod() { return repayperiod; }
    }
}
