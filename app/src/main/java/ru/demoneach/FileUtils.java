package ru.demoneach;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import com.google.common.io.Resources;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FileUtils {
    private FileUtils() {
    }

    public static String readFileFromResources(String fileName) {
        String output = "";

        try {
            output = Resources.toString(Resources.getResource(fileName), StandardCharsets.UTF_8);
        } catch (IOException e) {
            log.error("Cannot read resource: {}", fileName, e);
        }

        return output;
    }
}
