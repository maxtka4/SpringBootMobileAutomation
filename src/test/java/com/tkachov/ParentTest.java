package com.tkachov;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = ApplicationContext.class)
@ActiveProfiles("ios")
public class ParentTest {

}
