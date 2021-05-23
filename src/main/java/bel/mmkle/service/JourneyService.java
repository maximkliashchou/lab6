package bel.mmkle.service;

import bel.mmkle.dto.JourneyDto;
import bel.mmkle.entity.Journeys;

import java.util.ArrayList;
import java.util.List;

/**
 * Сервис для работы с сущностями Journey
 */

public class JourneyService {
    private static final String FINISH = "Finish";
    private static final String IN_PROGRESS = "In progress";

    /**
     * Перевод листа сущностей в дто
     */
    public List<JourneyDto> convertListToListDto(List<Journeys> journeysList){
        List<JourneyDto> list = new ArrayList<>();
        for (Journeys journeys : journeysList){
            JourneyDto journeyDto = new JourneyDto();
            if (journeys.getCar() != null) journeyDto.setRegNum(journeys.getCar().getRegNum());
            if (journeys.getRequest() != null) journeyDto.setRequestId(journeys.getRequest().getRequestId());
            if (journeys.getIsFinish() == 1) {
                journeyDto.setIsFinish(FINISH);
            } else {
                journeyDto.setIsFinish(IN_PROGRESS);
            }
            journeyDto.setCarState(journeys.getCarState());
            list.add(journeyDto);
        }
        return list;
    }
}
