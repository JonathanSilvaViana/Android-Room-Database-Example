package br.com.roomdatabaseexemplo.notadb.model.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import android.provider.SyncStateContract;

import java.util.List;

import br.com.roomdatabaseexemplo.notadb.model.model.Nota;


public interface NotaDao {

    @Query("SELECT * FROM usuario " + SyncStateContract.Constants.TABLE_NAME_NOTA)
    List<Nota> getAll();

    @Insert
    void insert(Nota nota);

    @Update
    public void update(Nota nota_atualizada);

    @Delete
    public void delete(Nota nota);

    @Delete
    public void delete(Nota... notas);


}
