package vsu.polev.backend.car.dto;

import lombok.Data;

import java.math.BigInteger;

@Data
public class CarDtoResponse {
    private Long id;
    private Long markId;
    private Long modelId;
    private Long gearboxId;
    private Long transmissionId;
    private Long fuelTypeId;
    private BigInteger distance;
    private Integer year;
    private Boolean damage;
}
