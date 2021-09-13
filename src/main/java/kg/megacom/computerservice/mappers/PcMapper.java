package kg.megacom.computerservice.mappers;

import kg.megacom.computerservice.models.dto.PcDto1Ex;
import kg.megacom.computerservice.models.entity.Pc;

public interface PcMapper {
    PcDto1Ex pcToPcDto1Ex(Pc pc);
}
