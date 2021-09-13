package kg.megacom.computerservice.services;

import kg.megacom.computerservice.models.dto.PcDto1Ex;
import kg.megacom.computerservice.models.entity.Pc;

import java.util.List;
import java.util.Map;

public interface PcService {

    List<PcDto1Ex> getAllPcLessThan(double price);

    List<Pc> getAllPcsLessThan(double price);

    List<Map<String, String>> getAllLessThan(double price);
}
