package kg.megacom.computerservice.mappers;

import kg.megacom.computerservice.mappers.impl.PcMapperImpl;
import kg.megacom.computerservice.models.dto.PcDto1Ex;
import kg.megacom.computerservice.models.entity.Pc;

import java.util.List;

public interface PcMapper {

    PcMapper INSTANCE = new PcMapperImpl();
    List<PcDto1Ex> listPcToPcDto1xList(List<Pc> pcList);
}
