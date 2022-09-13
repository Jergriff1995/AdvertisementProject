package com.amazon.ata.advertising.service.targeting;

import java.util.Comparator;

public class TargetingComparator implements Comparator<TargetingGroup> {


    @Override
    public int compare(TargetingGroup apple, TargetingGroup orange) {
        if(apple.getClickThroughRate() > orange.getClickThroughRate()){
            return 1;
        } else if (orange.getClickThroughRate() > apple.getClickThroughRate()){
            return -1;
        }
        return 0;
    }
}
