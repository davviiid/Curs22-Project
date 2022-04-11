package ro.fasttrackit.curs22.project;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BudgetCalculatorWebApplication {


    public static void main(String[] args) {
        final org.springframework.context.ConfigurableApplicationContext run = SpringApplication.run(BudgetCalculator.class, args);
    }

}
