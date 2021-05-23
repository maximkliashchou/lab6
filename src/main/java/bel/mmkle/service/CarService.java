package bel.mmkle.service;

import bel.mmkle.dto.CarDto;
import bel.mmkle.entity.Cars;

import java.util.ArrayList;
import java.util.List;

/**
 * Сервис для работы с сущностями Car
 */
public class CarService {
    /**
     * Перевод листа сущностей в дто
     */
    public List<CarDto> convertListToListDto(List<Cars> cars) {
        List<CarDto> list = new ArrayList<>();
        for (Cars car : cars) {
            CarDto carDto = new CarDto();
            carDto.setRegNum(car.getRegNum());
            list.add(carDto);
        }
        return list;
    }
}
