package dao;


import model.Manufacter;

import java.util.List;

public interface ManufacterDAO {

    void addManufacter(Manufacter manufacter);

    Manufacter getById(int id);

    void updateManufacter(Manufacter manyfacter);

    void deleteManufacter(int id);

    List<Manufacter> getAll();
}