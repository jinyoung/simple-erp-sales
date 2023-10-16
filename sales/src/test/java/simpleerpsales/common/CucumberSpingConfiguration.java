package simpleerpsales.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import simpleerpsales.SalesApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { SalesApplication.class })
public class CucumberSpingConfiguration {}
