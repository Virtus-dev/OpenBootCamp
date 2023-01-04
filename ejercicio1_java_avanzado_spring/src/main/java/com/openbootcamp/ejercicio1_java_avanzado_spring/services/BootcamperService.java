package com.openbootcamp.ejercicio1_java_avanzado_spring.services;

import com.openbootcamp.ejercicio1_java_avanzado_spring.Models.Bootcamper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BootcamperService {

    private List<Bootcamper> bootcampers = new ArrayList<>();

    public List<Bootcamper> getAll()
    {
        return bootcampers;
    }

    public void add(Bootcamper bootcamper)
    {
        bootcampers.add(bootcamper);
    }

    public Bootcamper get(String name)
    {
        for (Bootcamper bootcamper : bootcampers)
        {
            if (bootcamper.getName().equalsIgnoreCase(name))
            {
                return bootcamper;
            }
        }
        return null;
    }

}
