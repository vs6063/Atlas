import android.arch.persistence.room.Entity;
import android.os.Build;

import java.util.List;

/**
 * Created by victo on 17/02/2018.
 */

@Entity(primaryKeys = {"id", "name"})
class Building {
    public String Id;
    public String name;
}