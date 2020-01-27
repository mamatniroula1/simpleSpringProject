package model;

import mainClasses.MobileProcessor;
import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobileProcessor {
    @Override
    public void process() {
        System.out.println("second best CPU");
    }
}
