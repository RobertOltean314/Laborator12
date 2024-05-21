package org.example;

import java.util.ArrayList;
import java.util.List;

public class ExportConfig {
    final String title;
    final String filename;

    public ExportConfig(String title, String filename) {
        this.title = title;
        this.filename = filename;
    }

    public String getTitle() {
        return title;
    }


    public String getFilename() {
        return filename;
    }

}

class Exporter {
    final ExportConfig config;

    final List<String> values;

    public Exporter(ExportConfig config, List<String> values) {
        this.config = config;
        this.values = new ArrayList<>(values);
    }

    public void export() {
        System.out.println(config.filename);
        System.out.println(config.title);
        for (String value : values) {
            System.out.println(value);
        }
    }

    public ExportConfig getConfig() {
        return config;
    }
}