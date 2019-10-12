package br.com.roomdatabaseexemplo.notadb.model.model;
import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;


@Entity
public class Nota {

    //gera a id automaticamente
    @PrimaryKey(autoGenerate = true)
        private int nota_id;

    //esta coluna será nomeada de "conteudo_de_notas" ao invés do nome column que seria gerado automaticamente
    @ColumnInfo(name = "conteudo_de_notas")
    private String conteudo;

    private String titulo;

    private Date data_dias;

    public Nota(int nota_id, String conteudo, String titulo)
    {
        this.nota_id = nota_id;
        this.conteudo = conteudo;
        this.titulo = titulo;
    }

    public int getNota_id()
    {
        return nota_id;
    }

    public void setNota_id(int nota_id)
    {
        this.nota_id = nota_id;
    }

    public String getConteudo()
    {
        return conteudo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean equals(Object objeto)
    {
        //return super.equals(obj);

        if (this == objeto) return true;
        if (!(objeto instanceof Nota)) return false;

        Nota nota = (Nota) objeto;

        if (nota_id != nota.nota_id) return false;

        return titulo != null ? titulo.equals(nota.titulo) : nota.titulo == null;

    }

    @Override
    public String toString() {
        return "Nota{" +
                "ID_NOTA=" + nota_id +
                ", Conteúdo='" + conteudo + '\'' +
                ", Título='" + titulo + '\'' +
                '}';
    }
}
