package com.rer.util;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RandomNameGenerator {

    public static final String randomNameGenerator = DateTimeFormatter.ofPattern("HHmmss").format(LocalTime.now());

}
