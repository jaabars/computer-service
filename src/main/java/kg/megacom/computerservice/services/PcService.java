package kg.megacom.computerservice.services;

import kg.megacom.computerservice.models.dto.PcDto1Ex;

import java.util.List;

public interface PcService {

    List<PcDto1Ex> getAllPcLessThan(double price);
}
