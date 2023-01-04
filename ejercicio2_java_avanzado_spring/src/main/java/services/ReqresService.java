package services;

import com.openbootcamp.ejercicio2_java_avanzado_spring.models.Reqres;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ReqresService {

    private List<Reqres> reqres = new ArrayList<>();

    public List<Reqres> getAll()
    {
        return reqres;
    }

    public void add(Reqres reqres)
    {
        Reqres.add(reqres);
    }

    public Reqres get(int id)
    {
        for (Reqres reqres1 : reqres)
        {
            if (reqres1.getId() == id))
            {
                return reqres1;
            }
        }
        return null;
    }

}
