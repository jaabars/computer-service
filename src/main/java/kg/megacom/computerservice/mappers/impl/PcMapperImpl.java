package kg.megacom.computerservice.mappers.impl;

import kg.megacom.computerservice.mappers.PcMapper;
import kg.megacom.computerservice.models.dto.PcDto1Ex;
import kg.megacom.computerservice.models.entity.Pc;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class PcMapperImpl implements PcMapper {

    @Override
    public PcDto1Ex pcToPcDto1Ex(Pc pc) {
        PcDto1Ex pcDto1Ex = new PcDto1Ex();
        pcDto1Ex.setModel(pc.getProduct().getModel());
        pcDto1Ex.setSpeed(pc.getSpeed());
        pcDto1Ex.setHd(pc.getHd());
        return pcDto1Ex;
    }
}
