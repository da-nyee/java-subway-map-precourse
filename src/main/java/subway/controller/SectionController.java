package subway.controller;

import subway.service.section.SectionService;

import java.util.Scanner;

public class SectionController {
    public static void startSection(Scanner scanner) {
        SectionService sectionService = new SectionService();
        sectionService.manage(scanner);
    }
}
