/*
 *  Copyright (C) 2016 Iago de Castro Alvarenga <iagodecastro@yahoo.com.br>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 *
 */

package br.com.pondionz.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import br.com.pondionz.model.Linha;

/**
 * Created by Iago on 09/03/2016.
 */
public class DBFLinha extends MySQLiteHelper {
    public DBFLinha(Context context) {
        super(context);
    }


    //Retorna uma Lista de linhas de acordo com NOME do ponto passado como parametro, assim ele pega refencia do ponto e veficia quais linhas passam naquele ponto e retorna
    public ArrayList<Linha> getAllLinhaDAO(int idCidade) {
        ArrayList<Linha> linhaList = new ArrayList<Linha>();
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT * FROM Linha where idCidade = "+idCidade+"";
        try {
            /** Fill a cursor with the results. */
            Cursor cursor = db.rawQuery(query, null);
            if(cursor.moveToFirst()) {
                do {
                    linhaList.add(new Linha(cursor.getInt(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getDouble(4),cursor.getString(5),cursor.getInt(6)));
                } while (cursor.moveToNext());
            }
            Log.i("DAO Linhas", "successfully get all Linhas.");
        } finally {
            db.close();
        }

        return linhaList;
    }

    public String[] getAllNameLinhaDAO(int idCidade) {
        String[] linhaList;
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT * FROM Linha where idCidade = "+idCidade+"";
        int i=0;
        try {
            /** Fill a cursor with the results. */
            Cursor cursor = db.rawQuery(query, null);
            linhaList= new String[cursor.getCount()];
            if(cursor.moveToFirst()) {
                do {
                    linhaList[i] = cursor.getString(1);
                    i++;
                } while (cursor.moveToNext());
            }
            Log.i("DAO Linhas", "successfully get all Linhas.");
        } finally {
            db.close();
        }

        return linhaList;
    }
    //Retorna uma Lista de linhas de acordo com NOME do ponto passado como parametro, assim ele pega refencia do ponto e veficia quais linhas passam naquele ponto e retorna
    public List<Linha> getAllLinhaDAO(String nomePonto) {
        List<Linha> linhaList = new ArrayList<Linha>();
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT L.idLinha,L.name,L.PontoX,L.PontoY,L.tarifa,L.empresa,L.idCidade  FROM Linha L,Pontos P,PontoLinha PL WHERE  P.Title='"+nomePonto+"' and PL.idLinha = L.idLinha and PL.idPonto=P.idPonto";
        try {
            /** Fill a cursor with the results. */
            Cursor cursor = db.rawQuery(query, null);
            if(cursor.moveToFirst()) {
                do {
                    linhaList.add(new Linha(cursor.getInt(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getDouble(4),cursor.getString(5),cursor.getInt(6)));
                } while (cursor.moveToNext());
            }
            Log.i("DAO Linhas", "successfully get all Linhas.");
        } finally {
            db.close();
        }

        return linhaList;
    }
    public List<Linha> getAllLinhaUsuarioDAO(String nomePonto) {
        List<Linha> linhaList = new ArrayList<Linha>();
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT L.idLinha,L.name,L.PontoX,L.PontoY,L.tarifa,L.empresa,L.idCidade  FROM Linha L,PontosUsuario P,PontoLinhaUsuario PL WHERE  P.Title='"+nomePonto+"' and PL.idLinha = L.idLinha and PL.idPonto=P.idPonto";
        try {
            /** Fill a cursor with the results. */
            Cursor cursor = db.rawQuery(query, null);
            if(cursor.moveToFirst()) {
                do {
                    linhaList.add(new Linha(cursor.getInt(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getDouble(4),cursor.getString(5),cursor.getInt(6)));
                } while (cursor.moveToNext());
            }
            Log.i("DAO Linhas", "successfully get all Linhas.");
        } finally {
            db.close();
        }

        return linhaList;
    }

}
