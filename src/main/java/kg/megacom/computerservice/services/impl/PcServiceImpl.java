package kg.megacom.computerservice.services.impl;

import kg.megacom.computerservice.dao.PcRepository;
import kg.megacom.computerservice.mappers.PcMapper;
import kg.megacom.computerservice.models.dto.PcDto1Ex;
import kg.megacom.computerservice.models.entity.Pc;
import kg.megacom.computerservice.services.PcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PcServiceImpl implements PcService {
    @Autowired
    private PcRepository pcRepository;

    @Autowired
    private PcMapper pcMapper;

    @Override
    public List<PcDto1Ex> getAllPcLessThan(double price) {
        List<Pc> pcList = pcRepository.findAllByPriceIsLessThan(price);
        List<PcDto1Ex> pcDto1ExList = new ArrayList<>();
        for (Pc pc:pcList){
            pcDto1ExList.add(pcMapper.pcToPcDto1Ex(pc));
        }
        return pcDto1ExList;
    }

    @Override
    public List<Pc> getAllPcsLessThan(double price) {
        return pcRepository.findAllByPriceIsLessThan(price);
    }

    @Override
    public List<Map<String, String>> getAllLessThan(double price) {
        List<Pc> pcList = pcRepository.findAllByPriceIsLessThan(price);
        List<Map<String,String>> mapList = new ArrayList<>();
        for (Pc pc:pcList) {
            Map<String, String> pcMaps = new HashMap<>();
            pcMaps.put("model", pc.getProduct().getModel());
            pcMaps.put("speed", String.valueOf(pc.getSpeed()));
            pcMaps.put("hd", String.valueOf(pc.getHd()));
            mapList.add(pcMaps);
        }
        return mapList;
    }
}
