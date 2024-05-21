package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> values = new ArrayList<>();
        ExportConfig config1 = new ExportConfig("titlu1", "filename1");
        ExportConfig config2 = new ExportConfig("titlu2", "filename2");
        values.add("value1");
        values.add("value2");
        Exporter exporter1 = new Exporter(config1, values);
        values.add("value3");
        Exporter exporter2 = new Exporter(config2, values);
        exporter1.export();
        exporter2.export();
    }
}