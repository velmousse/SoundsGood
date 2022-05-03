package uqac.dim.soundsgood;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface TrackDao {

    @Query("SELECT notes FROM TrackEntity WHERE TrackEntity.tracknum LIKE :Tracknum")
    List<String> getnotes(int Tracknum);

    @Query("UPDATE TrackEntity SET notes = :nouvelletrack WHERE TrackEntity.tracknum =:Tracknum")
    void updateTrack(int Tracknum, ArrayList<String> nouvelletrack);
}