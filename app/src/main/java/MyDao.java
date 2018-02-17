import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by victo on 17/02/2018.
 */

@Dao
public interface MyDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertBuilding(Building... building);

    @Insert
    public void insertBothBuildings(Building building1, Building building2);

    @Insert
    public void insertBuildingAndList(Building building, List<Building> buildings);

    @Update
    public void updateBuildings(Building... buildings);

    @Delete
    public void deleteBuildings(Building... buildings);

    @Query("SELECT * FROM Building WHERE name LIKE '%:query%' OR id LIKE '%:query%'")
    public Building[] loadAllBuildingsWithQuery(String query);
}
