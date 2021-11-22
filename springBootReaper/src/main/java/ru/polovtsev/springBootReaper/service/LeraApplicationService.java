package ru.polovtsev.springBootReaper.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({ProfileConstants.LeraProfile})
public class LeraApplicationService implements ApplicationService {
    @Override
    public void printMethodName() {
        System.out.println("Lera service is active");
    }
}
