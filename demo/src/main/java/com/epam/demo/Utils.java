package com.epam.demo;

import com.epam.utils.StringUtils;
import java.util.List;

public class Utils {
    public boolean isAllPositiveNumbers(List<String> args) {
        for (String arg : args) {
            if (!StringUtils.isPositiveNumber(arg)) {
                return false;
            }
        }
        return true;
    }
}