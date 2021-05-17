package kg.megacom.computerservice.mappers.impl;

import kg.megacom.computerservice.mappers.PcMapper;
import kg.megacom.computerservice.models.dto.PcDto1Ex;
import kg.megacom.computerservice.models.entity.Pc;

import java.util.ArrayList;
import java.util.List;

public class PcMapperImpl implements PcMapper {
    @Override
    public List<PcDto1Ex> listPcToPcDto1xList(List<Pc> pcList) {
        List<PcDto1Ex> pcDto1ExList = new ArrayList<>();
        for (Pc pc:pcList){
            PcDto1Ex pcDto1Ex = new PcDto1Ex();
            pcDto1Ex.setHd(pc.getHd());
            pcDto1Ex.setModel(pc.getProduct().getModel());
            pcDto1Ex.setSpeed(pc.getSpeed());
            pcDto1ExList.add(pcDto1Ex);
        }
        return pcDto1ExList;
    }
}
