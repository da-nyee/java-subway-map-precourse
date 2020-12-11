package subway.controller;

import subway.service.LineService;
import subway.service.StationService;
import subway.type.InputType;
import subway.view.OutputView;

import java.util.Scanner;

public class SubwayController {
    public static void runSubway(Scanner scanner) {
        initializeSubway();
        startSubway(scanner);
    }

    public static void initializeSubway() {
        StationService.initializeStations();
        LineService.initializeLines();
    }

    public static void startSubway(Scanner scanner) {
        while (true) {
            OutputView.printMainScreen();
            String mainInput = scanner.next();
            if (quitSubway(mainInput)) {
                break;
            }
            chooseFeature(mainInput);
        }
    }

    public static boolean quitSubway(String mainInput) {
        return mainInput.equals(InputType.SCREEN_QUITTING.getInput());
    }

    public static void chooseFeature(String mainInput) {
        if (mainInput.equals(InputType.MAIN_STATION_MANAGEMENT.getInput())) {
            OutputView.printStationManagementScreen();
            return;
        }
        if (mainInput.equals(InputType.MAIN_LINE_MANAGEMENT.getInput())) {
            OutputView.printLineManagementScreen();
            return;
        }
        if (mainInput.equals(InputType.MAIN_SECTION_MANAGEMENT.getInput())) {
            OutputView.printSectionManagementScreen();
            return;
        }
        if (mainInput.equals(InputType.MAIN_SUBWAY_MAP_PRINT.getInput())) {
            // TODO: 지하철 노선도 출력 기능 구현
            return;
        }
        OutputView.printInvalidFeatureChoiceException();
    }
}
