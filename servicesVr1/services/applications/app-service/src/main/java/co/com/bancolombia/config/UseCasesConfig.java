package co.com.bancolombia.config;

import co.com.bancolombia.model.businessline.gateways.BusinessLineRepository;
import co.com.bancolombia.usecase.businessline.BusinesslineUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "co.com.bancolombia.usecase",
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.REGEX, pattern = "^.+UseCase$")
        },
        useDefaultFilters = false)
public class UseCasesConfig {

        @Bean
        public BusinesslineUseCase selectBusinessLine(BusinessLineRepository businessLineRepository){
                return new BusinesslineUseCase(businessLineRepository);
        }
}
