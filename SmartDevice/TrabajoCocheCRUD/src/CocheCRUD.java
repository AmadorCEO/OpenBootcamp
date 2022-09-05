import java.util.ArrayList;
import java.util.List;

public interface CocheCRUD {

    List<Coche> coches = new ArrayList<>();

  void save (Coche coche);

    static List<Coche> findAll() {
        return null;
    }

    void delete(Coche Coche);

}
