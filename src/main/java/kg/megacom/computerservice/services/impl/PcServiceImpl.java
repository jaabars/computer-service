package kg.megacom.computerservice.services.impl;

import kg.megacom.computerservice.dao.PcRepository;
import kg.megacom.computerservice.mappers.PcMapper;
import kg.megacom.computerservice.models.dto.PcDto1Ex;
import kg.megacom.computerservice.models.entity.Pc;
import kg.megacom.computerservice.services.PcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PcServiceImpl implements PcService {
    @Autowired
    private PcRepository pcRepository;

    @Override
    public List<PcDto1Ex> getAllPcLessThan(double price) {
        List<Pc> pcList = pcRepository.findAllByPriceIsLessThan(price);
        List<PcDto1Ex> pcDto1ExList = PcMapper.INSTANCE.listPcToPcDto1xList(pcList);
        return pcDto1ExList;
    }
}
