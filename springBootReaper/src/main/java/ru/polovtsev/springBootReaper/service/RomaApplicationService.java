package ru.polovtsev.springBootReaper.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(ProfileConstants.RomaProfile)
public class RomaApplicationService implements ApplicationService {
    @Override
    public void printMethodName() {
        System.out.println("Roma service is active");
    }
}
