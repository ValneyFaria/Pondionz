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

import android.content.ContentValues;

import java.util.LinkedList;
import java.util.List;

import br.com.pondionz.model.PontoLinha;

/**
 * Created by Iago on 09/03/2016.
 */
class DBPontoLinha {
    static List<ContentValues> getPontoLinhas(){

        List<ContentValues> insertValues = new LinkedList<ContentValues>();
        //Linha 1: CIDADE - TREVO
        insertValues.add(values(new PontoLinha(1,8)));//ok
        insertValues.add(values(new PontoLinha(1,9)));//ok
        insertValues.add(values(new PontoLinha(1,10)));//ok
        insertValues.add(values(new PontoLinha(1,11)));//ok
        insertValues.add(values(new PontoLinha(1,19)));//ok
        insertValues.add(values(new PontoLinha(1,20)));//ok
        insertValues.add(values(new PontoLinha(1,21)));//ok
        insertValues.add(values(new PontoLinha(1,22)));//ok
        insertValues.add(values(new PontoLinha(1,23)));//ok
        insertValues.add(values(new PontoLinha(1,24)));//ok
        insertValues.add(values(new PontoLinha(1,25)));//ok
        insertValues.add(values(new PontoLinha(1,26)));//ok
        insertValues.add(values(new PontoLinha(1,27)));//ok
        insertValues.add(values(new PontoLinha(1,28)));//ok
        insertValues.add(values(new PontoLinha(1,30)));//ok
        insertValues.add(values(new PontoLinha(1,31)));//ok
        insertValues.add(values(new PontoLinha(1,32)));//ok
        insertValues.add(values(new PontoLinha(1,33)));//ok
        insertValues.add(values(new PontoLinha(1,34)));//ok
        insertValues.add(values(new PontoLinha(1,35)));//ok
        insertValues.add(values(new PontoLinha(1,36)));//ok
        insertValues.add(values(new PontoLinha(1,37)));//ok
        insertValues.add(values(new PontoLinha(1,38)));//ok
        insertValues.add(values(new PontoLinha(1,39)));//ok
        insertValues.add(values(new PontoLinha(1,40)));//ok
        insertValues.add(values(new PontoLinha(1,41)));//ok
        insertValues.add(values(new PontoLinha(1,48)));//ok
        insertValues.add(values(new PontoLinha(1,49)));//ok
        insertValues.add(values(new PontoLinha(1,50)));//ok
        insertValues.add(values(new PontoLinha(1,51)));//ok
        insertValues.add(values(new PontoLinha(1,52)));//ok
        insertValues.add(values(new PontoLinha(1,53)));//ok
        insertValues.add(values(new PontoLinha(1,56)));//ok
        insertValues.add(values(new PontoLinha(1,63)));//ok
        insertValues.add(values(new PontoLinha(1,64)));//ok
        insertValues.add(values(new PontoLinha(1,65)));//ok
        insertValues.add(values(new PontoLinha(1,66)));//ok
        insertValues.add(values(new PontoLinha(1,67)));//ok
        insertValues.add(values(new PontoLinha(1,69)));//ok
        insertValues.add(values(new PontoLinha(1,70)));//ok
        insertValues.add(values(new PontoLinha(1,71)));//ok
        insertValues.add(values(new PontoLinha(1,72)));//ok
        insertValues.add(values(new PontoLinha(1,87)));//ok
        insertValues.add(values(new PontoLinha(1,88)));//ok
        insertValues.add(values(new PontoLinha(1,89)));//ok
        insertValues.add(values(new PontoLinha(1,90)));//ok
        insertValues.add(values(new PontoLinha(1,91)));//ok
        insertValues.add(values(new PontoLinha(1,92)));//ok
        insertValues.add(values(new PontoLinha(1,93)));//ok
        insertValues.add(values(new PontoLinha(1,94)));//ok
        insertValues.add(values(new PontoLinha(1,95)));//ok


        //linha 2 :CIDADE - DIVISA DE SANTA CRUZ DE MINAS
        insertValues.add(values(new PontoLinha(2,8)));//ok
        insertValues.add(values(new PontoLinha(2,9)));//ok
        insertValues.add(values(new PontoLinha(2,10)));//ok
        insertValues.add(values(new PontoLinha(2,11)));//ok
        insertValues.add(values(new PontoLinha(2,19)));//ok
        insertValues.add(values(new PontoLinha(2,20)));//ok
        insertValues.add(values(new PontoLinha(2,21)));//ok
        insertValues.add(values(new PontoLinha(2,22)));//ok
        insertValues.add(values(new PontoLinha(2,23)));//ok
        insertValues.add(values(new PontoLinha(2,24)));//ok
        insertValues.add(values(new PontoLinha(2,25)));//ok
        insertValues.add(values(new PontoLinha(2,26)));//ok
        insertValues.add(values(new PontoLinha(2,27)));//ok
        insertValues.add(values(new PontoLinha(2,28)));//ok
        insertValues.add(values(new PontoLinha(2,30)));//ok
        insertValues.add(values(new PontoLinha(2,31)));//ok
        insertValues.add(values(new PontoLinha(2,32)));//ok
        insertValues.add(values(new PontoLinha(2,33)));//ok
        insertValues.add(values(new PontoLinha(2,34)));//ok
        insertValues.add(values(new PontoLinha(2,35)));//ok
        insertValues.add(values(new PontoLinha(2,41)));//ok
        insertValues.add(values(new PontoLinha(2,42)));//ok
        insertValues.add(values(new PontoLinha(2,43)));//ok
        insertValues.add(values(new PontoLinha(2,44)));//ok
        insertValues.add(values(new PontoLinha(2,45)));//ok
        insertValues.add(values(new PontoLinha(2,46)));//ok
        insertValues.add(values(new PontoLinha(2,47)));//ok
        insertValues.add(values(new PontoLinha(2,48)));//ok
        insertValues.add(values(new PontoLinha(2,49)));//ok
        insertValues.add(values(new PontoLinha(2,63)));//ok
        insertValues.add(values(new PontoLinha(2,64)));//ok
        insertValues.add(values(new PontoLinha(2,65)));//ok
        insertValues.add(values(new PontoLinha(2,66)));//ok
        insertValues.add(values(new PontoLinha(2,67)));//ok
        insertValues.add(values(new PontoLinha(2,69)));//ok
        insertValues.add(values(new PontoLinha(2,70)));//ok
        insertValues.add(values(new PontoLinha(2,71)));//ok
        insertValues.add(values(new PontoLinha(2,72)));//ok
        insertValues.add(values(new PontoLinha(2,135)));
        //Linha 3: TIJUCO - GIAROLA
        insertValues.add(values(new PontoLinha(3,3)));//ok
        insertValues.add(values(new PontoLinha(3,4)));//ok
        insertValues.add(values(new PontoLinha(3,5)));//ok
        insertValues.add(values(new PontoLinha(3,6)));//ok
        insertValues.add(values(new PontoLinha(3,7)));//ok
        insertValues.add(values(new PontoLinha(3,8)));//ok
        insertValues.add(values(new PontoLinha(3,9)));//ok
        insertValues.add(values(new PontoLinha(3,10)));//ok
        insertValues.add(values(new PontoLinha(3,11)));//ok
        insertValues.add(values(new PontoLinha(3,12)));//ok
        insertValues.add(values(new PontoLinha(3,13)));//ok
        insertValues.add(values(new PontoLinha(3,14)));//ok
        insertValues.add(values(new PontoLinha(3,15)));//ok
        insertValues.add(values(new PontoLinha(3,16)));//ok
        insertValues.add(values(new PontoLinha(3,17)));//ok
        insertValues.add(values(new PontoLinha(3,18)));//ok
        insertValues.add(values(new PontoLinha(3,19)));//ok
        insertValues.add(values(new PontoLinha(3,20)));//ok
        insertValues.add(values(new PontoLinha(3,21)));//ok
        insertValues.add(values(new PontoLinha(3,22)));//ok
        insertValues.add(values(new PontoLinha(3,23)));//ok
        insertValues.add(values(new PontoLinha(3,24)));//ok
        insertValues.add(values(new PontoLinha(3,25)));//ok
        insertValues.add(values(new PontoLinha(3,26)));//ok
        insertValues.add(values(new PontoLinha(3,27)));//ok
        insertValues.add(values(new PontoLinha(3,28)));//ok
        insertValues.add(values(new PontoLinha(3,29)));//ok
        insertValues.add(values(new PontoLinha(3,48)));//ok
        insertValues.add(values(new PontoLinha(3,49)));//ok
        insertValues.add(values(new PontoLinha(3,57)));//ok
        insertValues.add(values(new PontoLinha(3,58)));//ok
        insertValues.add(values(new PontoLinha(3,59)));//ok
        insertValues.add(values(new PontoLinha(3,60)));//ok
        insertValues.add(values(new PontoLinha(3,61)));//ok
        insertValues.add(values(new PontoLinha(3,62)));//ok
        insertValues.add(values(new PontoLinha(3,63)));//ok
        insertValues.add(values(new PontoLinha(3,79)));//ok
        insertValues.add(values(new PontoLinha(3,81)));//ok
        insertValues.add(values(new PontoLinha(3,82)));//ok
        insertValues.add(values(new PontoLinha(3,83)));//ok
        insertValues.add(values(new PontoLinha(3,84)));//ok
        insertValues.add(values(new PontoLinha(3,85)));//ok
        //Linha 4: TIJUCO - ALTO DAS ÁGUAS
        insertValues.add(values(new PontoLinha(4,3)));//ok
        insertValues.add(values(new PontoLinha(4,4)));//ok
        insertValues.add(values(new PontoLinha(4,5)));//ok
        insertValues.add(values(new PontoLinha(4,6)));//ok
        insertValues.add(values(new PontoLinha(4,7)));//ok
        insertValues.add(values(new PontoLinha(4,8)));//ok
        insertValues.add(values(new PontoLinha(4,9)));//ok
        insertValues.add(values(new PontoLinha(4,10)));//ok
        insertValues.add(values(new PontoLinha(4,11)));//ok
        insertValues.add(values(new PontoLinha(4,12)));//ok
        insertValues.add(values(new PontoLinha(4,13)));//ok
        insertValues.add(values(new PontoLinha(4,14)));//ok
        insertValues.add(values(new PontoLinha(4,15)));//ok
        insertValues.add(values(new PontoLinha(4,16)));//ok
        insertValues.add(values(new PontoLinha(4,17)));//ok
        insertValues.add(values(new PontoLinha(4,18)));//ok
        insertValues.add(values(new PontoLinha(4,19)));//ok
        insertValues.add(values(new PontoLinha(4,20)));//ok
        insertValues.add(values(new PontoLinha(4,21)));//ok
        insertValues.add(values(new PontoLinha(4,22)));//ok
        insertValues.add(values(new PontoLinha(4,23)));//ok
        insertValues.add(values(new PontoLinha(4,24)));//ok
        insertValues.add(values(new PontoLinha(4,25)));//ok
        insertValues.add(values(new PontoLinha(4,26)));//ok
        insertValues.add(values(new PontoLinha(4,27)));//ok
        insertValues.add(values(new PontoLinha(4,28)));//ok
        insertValues.add(values(new PontoLinha(4,48)));//ok
        insertValues.add(values(new PontoLinha(4,49)));//ok
        insertValues.add(values(new PontoLinha(4,57)));//ok
        insertValues.add(values(new PontoLinha(4,58)));//ok
        insertValues.add(values(new PontoLinha(4,59)));//ok
        insertValues.add(values(new PontoLinha(4,60)));//ok
        insertValues.add(values(new PontoLinha(4,61)));//ok
        insertValues.add(values(new PontoLinha(4,62)));//ok
        insertValues.add(values(new PontoLinha(4,63)));//ok
        insertValues.add(values(new PontoLinha(4,79)));//ok
        insertValues.add(values(new PontoLinha(4,81)));//ok
        insertValues.add(values(new PontoLinha(4,82)));//ok
        insertValues.add(values(new PontoLinha(4,83)));//ok
        insertValues.add(values(new PontoLinha(4,84)));//ok
        insertValues.add(values(new PontoLinha(4,85)));//ok
        insertValues.add(values(new PontoLinha(4,86)));//ok
        insertValues.add(values(new PontoLinha(4,111)));
        //Linha 5: TIJUCO - SOLAR DA SERRA
        insertValues.add(values(new PontoLinha(5,3)));//ok
        insertValues.add(values(new PontoLinha(5,4)));//ok
        insertValues.add(values(new PontoLinha(5,5)));//ok
        insertValues.add(values(new PontoLinha(5,6)));//ok
        insertValues.add(values(new PontoLinha(5,7)));//ok
        insertValues.add(values(new PontoLinha(5,8)));//ok
        insertValues.add(values(new PontoLinha(5,9)));//ok
        insertValues.add(values(new PontoLinha(5,10)));//ok
        insertValues.add(values(new PontoLinha(5,11)));//ok
        insertValues.add(values(new PontoLinha(5,12)));//ok
        insertValues.add(values(new PontoLinha(5,13)));//ok
        insertValues.add(values(new PontoLinha(5,14)));//ok
        insertValues.add(values(new PontoLinha(5,15)));//ok
        insertValues.add(values(new PontoLinha(5,16)));//ok
        insertValues.add(values(new PontoLinha(5,17)));//ok
        insertValues.add(values(new PontoLinha(5,18)));//ok
        insertValues.add(values(new PontoLinha(5,19)));//ok
        insertValues.add(values(new PontoLinha(5,20)));//ok
        insertValues.add(values(new PontoLinha(5,21)));//ok
        insertValues.add(values(new PontoLinha(5,22)));//ok
        insertValues.add(values(new PontoLinha(5,23)));//ok
        insertValues.add(values(new PontoLinha(5,24)));//ok
        insertValues.add(values(new PontoLinha(5,25)));//ok
        insertValues.add(values(new PontoLinha(5,26)));//ok
        insertValues.add(values(new PontoLinha(5,27)));//ok
        insertValues.add(values(new PontoLinha(5,28)));//ok
        insertValues.add(values(new PontoLinha(5,48)));//ok
        insertValues.add(values(new PontoLinha(5,49)));//ok
        insertValues.add(values(new PontoLinha(5,57)));//ok
        insertValues.add(values(new PontoLinha(5,58)));//ok
        insertValues.add(values(new PontoLinha(5,59)));//ok
        insertValues.add(values(new PontoLinha(5,60)));//ok
        insertValues.add(values(new PontoLinha(5,61)));//ok
        insertValues.add(values(new PontoLinha(5,62)));//ok
        insertValues.add(values(new PontoLinha(5,63)));//ok
        insertValues.add(values(new PontoLinha(5,79)));//ok
        insertValues.add(values(new PontoLinha(5,81)));//ok
        insertValues.add(values(new PontoLinha(5,82)));//ok
        insertValues.add(values(new PontoLinha(5,83)));//ok
        insertValues.add(values(new PontoLinha(5,84)));//ok
        insertValues.add(values(new PontoLinha(5,85)));//ok
        //Linha 6: TIJUCO - BENGO
        insertValues.add(values(new PontoLinha(6,1)));//ok
        insertValues.add(values(new PontoLinha(6,2)));//ok
        insertValues.add(values(new PontoLinha(6,3)));//ok
        insertValues.add(values(new PontoLinha(6,4)));//ok
        insertValues.add(values(new PontoLinha(6,5)));//ok
        insertValues.add(values(new PontoLinha(6,6)));//ok
        insertValues.add(values(new PontoLinha(6,7)));//ok
        insertValues.add(values(new PontoLinha(6,8)));//ok
        insertValues.add(values(new PontoLinha(6,9)));//ok
        insertValues.add(values(new PontoLinha(6,10)));//ok
        insertValues.add(values(new PontoLinha(6,11)));//ok
        insertValues.add(values(new PontoLinha(6,12)));//ok//ok
        insertValues.add(values(new PontoLinha(6,13)));//ok
        insertValues.add(values(new PontoLinha(6,14)));//ok
        insertValues.add(values(new PontoLinha(6,15)));//ok
        insertValues.add(values(new PontoLinha(6,16)));//ok
        insertValues.add(values(new PontoLinha(6,17)));//ok
        insertValues.add(values(new PontoLinha(6,18)));//ok
        insertValues.add(values(new PontoLinha(6,19)));//ok
        insertValues.add(values(new PontoLinha(6,20)));//ok
        insertValues.add(values(new PontoLinha(6,21)));//ok
        insertValues.add(values(new PontoLinha(6,22)));//ok
        insertValues.add(values(new PontoLinha(6,23)));//ok
        insertValues.add(values(new PontoLinha(6,24)));//ok
        insertValues.add(values(new PontoLinha(6,25)));//ok
        insertValues.add(values(new PontoLinha(6,26)));//ok
        insertValues.add(values(new PontoLinha(6,27)));//ok
        insertValues.add(values(new PontoLinha(6,28)));//ok
        insertValues.add(values(new PontoLinha(6,48)));//ok
        insertValues.add(values(new PontoLinha(6,49)));//ok
        insertValues.add(values(new PontoLinha(6,57)));//ok
        insertValues.add(values(new PontoLinha(6,58)));//ok
        insertValues.add(values(new PontoLinha(6,59)));//ok
        insertValues.add(values(new PontoLinha(6,60)));//ok
        insertValues.add(values(new PontoLinha(6,61)));//ok
        insertValues.add(values(new PontoLinha(6,62)));//ok
        insertValues.add(values(new PontoLinha(6,63)));//ok
        insertValues.add(values(new PontoLinha(6,68)));//ok
        insertValues.add(values(new PontoLinha(6,73)));//ok
        insertValues.add(values(new PontoLinha(6,74)));//ok
        insertValues.add(values(new PontoLinha(6,75)));//ok
        insertValues.add(values(new PontoLinha(6,76)));//ok
        insertValues.add(values(new PontoLinha(6,77)));//ok
        insertValues.add(values(new PontoLinha(6,78)));//ok


        //Linha 7: TIJUCO - PIO XII/VIA LOMBÃO
        insertValues.add(values(new PontoLinha(7,8)));//ok
        insertValues.add(values(new PontoLinha(7,9)));//ok
        insertValues.add(values(new PontoLinha(7,10)));//ok
        insertValues.add(values(new PontoLinha(7,11)));//ok
        insertValues.add(values(new PontoLinha(7,19)));//ok
        insertValues.add(values(new PontoLinha(7,20)));//ok
        insertValues.add(values(new PontoLinha(7,21)));//ok
        insertValues.add(values(new PontoLinha(7,22)));//ok
        insertValues.add(values(new PontoLinha(7,23)));//ok
        insertValues.add(values(new PontoLinha(7,24)));//ok
        insertValues.add(values(new PontoLinha(7,25)));//ok
        insertValues.add(values(new PontoLinha(7,26)));//ok
        insertValues.add(values(new PontoLinha(7,27)));//ok
        insertValues.add(values(new PontoLinha(7,28)));//ok
        insertValues.add(values(new PontoLinha(7,30)));//ok
        insertValues.add(values(new PontoLinha(7,31)));//ok
        insertValues.add(values(new PontoLinha(7,32)));//ok
        insertValues.add(values(new PontoLinha(7,33)));//ok
        insertValues.add(values(new PontoLinha(7,34)));//ok
        insertValues.add(values(new PontoLinha(7,35)));//ok
        insertValues.add(values(new PontoLinha(7,36)));//ok
        insertValues.add(values(new PontoLinha(7,37)));//ok
        insertValues.add(values(new PontoLinha(7,38)));//ok
        insertValues.add(values(new PontoLinha(7,39)));//ok
        insertValues.add(values(new PontoLinha(7,40)));//ok
        insertValues.add(values(new PontoLinha(7,41)));//ok
        insertValues.add(values(new PontoLinha(7,48)));//ok
        insertValues.add(values(new PontoLinha(7,49)));//ok
        insertValues.add(values(new PontoLinha(7,50)));//ok
        insertValues.add(values(new PontoLinha(7,57)));//ok
        insertValues.add(values(new PontoLinha(7,58)));//ok
        insertValues.add(values(new PontoLinha(7,59)));//ok
        insertValues.add(values(new PontoLinha(7,60)));//ok
        insertValues.add(values(new PontoLinha(7,61)));//ok
        insertValues.add(values(new PontoLinha(7,62)));//ok
        insertValues.add(values(new PontoLinha(7,63)));//ok

        //Linha 8: TIJUCO/BARRO PRETO - PIO XII/VIA LOMBÃO
        insertValues.add(values(new PontoLinha(8,8)));//ok
        insertValues.add(values(new PontoLinha(8,9)));//ok
        insertValues.add(values(new PontoLinha(8,10)));//ok
        insertValues.add(values(new PontoLinha(8,11)));//ok
        insertValues.add(values(new PontoLinha(8,19)));//ok
        insertValues.add(values(new PontoLinha(8,20)));//ok
        insertValues.add(values(new PontoLinha(8,21)));//ok
        insertValues.add(values(new PontoLinha(8,22)));//ok
        insertValues.add(values(new PontoLinha(8,23)));//ok
        insertValues.add(values(new PontoLinha(8,24)));//ok
        insertValues.add(values(new PontoLinha(8,25)));//ok
        insertValues.add(values(new PontoLinha(8,26)));//ok
        insertValues.add(values(new PontoLinha(8,27)));//ok
        insertValues.add(values(new PontoLinha(8,28)));//ok
        insertValues.add(values(new PontoLinha(8,30)));//ok
        insertValues.add(values(new PontoLinha(8,31)));//ok
        insertValues.add(values(new PontoLinha(8,32)));//ok
        insertValues.add(values(new PontoLinha(8,33)));//ok
        insertValues.add(values(new PontoLinha(8,34)));//ok
        insertValues.add(values(new PontoLinha(8,35)));//ok
        insertValues.add(values(new PontoLinha(8,36)));//ok
        insertValues.add(values(new PontoLinha(8,37)));//ok
        insertValues.add(values(new PontoLinha(8,38)));//ok
        insertValues.add(values(new PontoLinha(8,39)));//ok
        insertValues.add(values(new PontoLinha(8,40)));//ok
        insertValues.add(values(new PontoLinha(8,41)));//ok
        insertValues.add(values(new PontoLinha(8,48)));//ok
        insertValues.add(values(new PontoLinha(8,49)));//ok
        insertValues.add(values(new PontoLinha(8,50)));//ok
        insertValues.add(values(new PontoLinha(8,57)));//ok
        insertValues.add(values(new PontoLinha(8,58)));//ok
        insertValues.add(values(new PontoLinha(8,59)));//ok
        insertValues.add(values(new PontoLinha(8,60)));//ok
        insertValues.add(values(new PontoLinha(8,61)));//ok
        insertValues.add(values(new PontoLinha(8,63)));//ok
        insertValues.add(values(new PontoLinha(8,69)));//ok
        insertValues.add(values(new PontoLinha(8,70)));//ok
        insertValues.add(values(new PontoLinha(8,71)));//ok
        insertValues.add(values(new PontoLinha(8,72)));//ok
        //Linha 9: MAQUINÉ - GUARDA/MOR VIA DIV.SANTA CRUZ DE MINAS
        insertValues.add(values(new PontoLinha(9,8)));//ok
        insertValues.add(values(new PontoLinha(9,9)));//ok
        insertValues.add(values(new PontoLinha(9,10)));//ok
        insertValues.add(values(new PontoLinha(9,11)));//ok
        insertValues.add(values(new PontoLinha(9,19)));//ok
        insertValues.add(values(new PontoLinha(9,20)));//ok
        insertValues.add(values(new PontoLinha(9,21)));//ok
        insertValues.add(values(new PontoLinha(9,22)));//ok
        insertValues.add(values(new PontoLinha(9,23)));//ok
        insertValues.add(values(new PontoLinha(9,24)));//ok
        insertValues.add(values(new PontoLinha(9,27)));//ok
        insertValues.add(values(new PontoLinha(9,28)));//ok
        insertValues.add(values(new PontoLinha(9,30)));//ok
        insertValues.add(values(new PontoLinha(8,31)));//ok
        insertValues.add(values(new PontoLinha(9,32)));//ok
        insertValues.add(values(new PontoLinha(9,33)));//ok
        insertValues.add(values(new PontoLinha(9,34)));//ok
        insertValues.add(values(new PontoLinha(9,35)));//ok
        insertValues.add(values(new PontoLinha(9,41)));//ok
        insertValues.add(values(new PontoLinha(9,42)));//ok
        insertValues.add(values(new PontoLinha(9,43)));//ok
        insertValues.add(values(new PontoLinha(9,44)));//ok
        insertValues.add(values(new PontoLinha(9,45)));//ok
        insertValues.add(values(new PontoLinha(9,46)));//ok
        insertValues.add(values(new PontoLinha(9,47)));//ok
        insertValues.add(values(new PontoLinha(9,48)));//ok
        insertValues.add(values(new PontoLinha(9,49)));//ok
        insertValues.add(values(new PontoLinha(9,130)));
        insertValues.add(values(new PontoLinha(9,131)));
        insertValues.add(values(new PontoLinha(9,134)));
        //Linha 10: SÃO JOÃO DEL REI - ELVAS","SÃO JOÃO DEL REI
        insertValues.add(values(new PontoLinha(10,8)));
        insertValues.add(values(new PontoLinha(10,9)));
        insertValues.add(values(new PontoLinha(10,10)));
        insertValues.add(values(new PontoLinha(10,11)));
        insertValues.add(values(new PontoLinha(10,19)));
        insertValues.add(values(new PontoLinha(10,20)));
        insertValues.add(values(new PontoLinha(10,21)));
        insertValues.add(values(new PontoLinha(10,22)));
        insertValues.add(values(new PontoLinha(10,23)));
        insertValues.add(values(new PontoLinha(10,24)));
        insertValues.add(values(new PontoLinha(10,48)));
        insertValues.add(values(new PontoLinha(10,49)));
        //Linha 11: SENHOR DOS MONTES - BONFIM/VARZEA DO FARIA
        insertValues.add(values(new PontoLinha(11,8)));
        insertValues.add(values(new PontoLinha(11,9)));
        insertValues.add(values(new PontoLinha(11,10)));
        insertValues.add(values(new PontoLinha(11,11)));
        insertValues.add(values(new PontoLinha(11,19)));
        insertValues.add(values(new PontoLinha(11,20)));
        insertValues.add(values(new PontoLinha(11,21)));
        insertValues.add(values(new PontoLinha(11,22)));
        insertValues.add(values(new PontoLinha(11,23)));
        insertValues.add(values(new PontoLinha(11,24)));
        insertValues.add(values(new PontoLinha(11,48)));
        insertValues.add(values(new PontoLinha(11,49)));
        insertValues.add(values(new PontoLinha(11,96)));
        insertValues.add(values(new PontoLinha(11,97)));
        insertValues.add(values(new PontoLinha(11,107)));
        insertValues.add(values(new PontoLinha(11,108)));
        insertValues.add(values(new PontoLinha(11,110)));
        insertValues.add(values(new PontoLinha(11,112)));
        insertValues.add(values(new PontoLinha(11,113)));
        insertValues.add(values(new PontoLinha(11,114)));
        insertValues.add(values(new PontoLinha(11,115)));
        insertValues.add(values(new PontoLinha(11,116)));
        insertValues.add(values(new PontoLinha(11,117)));
        insertValues.add(values(new PontoLinha(11,118)));
        insertValues.add(values(new PontoLinha(11,119)));
        insertValues.add(values(new PontoLinha(11,120)));
        insertValues.add(values(new PontoLinha(11,121)));
        insertValues.add(values(new PontoLinha(11,123)));
        insertValues.add(values(new PontoLinha(11,124)));
        insertValues.add(values(new PontoLinha(11,125)));
        insertValues.add(values(new PontoLinha(11,126)));
        insertValues.add(values(new PontoLinha(11,127)));
        insertValues.add(values(new PontoLinha(11,128)));
        insertValues.add(values(new PontoLinha(11,129)));


        //Linha 14: HOSPITAL - CIRCULAR","HOSPITAL
        insertValues.add(values(new PontoLinha(14,3)));
        insertValues.add(values(new PontoLinha(14,4)));
        insertValues.add(values(new PontoLinha(14,5)));
        insertValues.add(values(new PontoLinha(14,6)));
        insertValues.add(values(new PontoLinha(14,7)));
        insertValues.add(values(new PontoLinha(14,8)));
        insertValues.add(values(new PontoLinha(14,9)));
        insertValues.add(values(new PontoLinha(14,10)));
        insertValues.add(values(new PontoLinha(14,11)));
        insertValues.add(values(new PontoLinha(14,19)));
        insertValues.add(values(new PontoLinha(14,20)));
        insertValues.add(values(new PontoLinha(14,21)));
        insertValues.add(values(new PontoLinha(14,22)));
        insertValues.add(values(new PontoLinha(14,23)));
        insertValues.add(values(new PontoLinha(14,24)));
        insertValues.add(values(new PontoLinha(14,26)));
        insertValues.add(values(new PontoLinha(14,48)));
        insertValues.add(values(new PontoLinha(14,49)));
        insertValues.add(values(new PontoLinha(14,109)));
        insertValues.add(values(new PontoLinha(14,130)));
        insertValues.add(values(new PontoLinha(14,132)));
        insertValues.add(values(new PontoLinha(14,133)));
        //Linha 15: CTAN - BIQUINHA
        insertValues.add(values(new PontoLinha(15,1)));
        insertValues.add(values(new PontoLinha(15,2)));
        insertValues.add(values(new PontoLinha(15,3)));
        insertValues.add(values(new PontoLinha(15,4)));
        insertValues.add(values(new PontoLinha(15,5)));
        insertValues.add(values(new PontoLinha(15,6)));
        insertValues.add(values(new PontoLinha(15,7)));
        insertValues.add(values(new PontoLinha(15,8)));
        insertValues.add(values(new PontoLinha(15,9)));
        insertValues.add(values(new PontoLinha(15,10)));
        insertValues.add(values(new PontoLinha(15,11)));
        insertValues.add(values(new PontoLinha(15,12)));
        insertValues.add(values(new PontoLinha(15,13)));
        insertValues.add(values(new PontoLinha(15,14)));
        insertValues.add(values(new PontoLinha(15,15)));
        insertValues.add(values(new PontoLinha(15,16)));
        insertValues.add(values(new PontoLinha(15,17)));
        insertValues.add(values(new PontoLinha(15,18)));
        insertValues.add(values(new PontoLinha(15,19)));
        insertValues.add(values(new PontoLinha(15,20)));
        insertValues.add(values(new PontoLinha(15,21)));
        insertValues.add(values(new PontoLinha(15,22)));
        insertValues.add(values(new PontoLinha(15,23)));
        insertValues.add(values(new PontoLinha(15,24)));
        insertValues.add(values(new PontoLinha(15,25)));
        insertValues.add(values(new PontoLinha(15,27)));
        insertValues.add(values(new PontoLinha(15,48)));
        insertValues.add(values(new PontoLinha(15,49)));
        insertValues.add(values(new PontoLinha(15, 109)));
        //Linha 16: AEROPORTO - FORÚM
        insertValues.add(values(new PontoLinha(16,8)));
        insertValues.add(values(new PontoLinha(16,9)));
        insertValues.add(values(new PontoLinha(16,10)));
        insertValues.add(values(new PontoLinha(16,11)));
        insertValues.add(values(new PontoLinha(16,19)));
        insertValues.add(values(new PontoLinha(16,20)));
        insertValues.add(values(new PontoLinha(16,21)));
        insertValues.add(values(new PontoLinha(16,22)));
        insertValues.add(values(new PontoLinha(16,23)));
        insertValues.add(values(new PontoLinha(16,24)));
        insertValues.add(values(new PontoLinha(16,48)));
        insertValues.add(values(new PontoLinha(16,49)));
        insertValues.add(values(new PontoLinha(16,130)));
        //Linha 17: SOLAR DA SERRA - GUARDA/MOR
        insertValues.add(values(new PontoLinha(17,3)));
        insertValues.add(values(new PontoLinha(17,4)));
        insertValues.add(values(new PontoLinha(17,5)));
        insertValues.add(values(new PontoLinha(17,6)));
        insertValues.add(values(new PontoLinha(17,7)));
        insertValues.add(values(new PontoLinha(17,8)));
        insertValues.add(values(new PontoLinha(17,9)));
        insertValues.add(values(new PontoLinha(17,10)));
        insertValues.add(values(new PontoLinha(17,11)));
        insertValues.add(values(new PontoLinha(17,12)));
        insertValues.add(values(new PontoLinha(17,13)));
        insertValues.add(values(new PontoLinha(17,14)));
        insertValues.add(values(new PontoLinha(17,15)));
        insertValues.add(values(new PontoLinha(17,16)));
        insertValues.add(values(new PontoLinha(17,17)));
        insertValues.add(values(new PontoLinha(17,18)));
        insertValues.add(values(new PontoLinha(17,19)));
        insertValues.add(values(new PontoLinha(17,20)));
        insertValues.add(values(new PontoLinha(17,21)));
        insertValues.add(values(new PontoLinha(17,22)));
        insertValues.add(values(new PontoLinha(17,23)));
        insertValues.add(values(new PontoLinha(17,24)));
        insertValues.add(values(new PontoLinha(17,25)));
        insertValues.add(values(new PontoLinha(17,26)));
        insertValues.add(values(new PontoLinha(17,48)));
        insertValues.add(values(new PontoLinha(17,49)));
        insertValues.add(values(new PontoLinha(17,130)));
        insertValues.add(values(new PontoLinha(17,131)));
        //Linha 18: GIRASSOL - GUARDA/MOR VIA DIV.SANTA CRUZ DE MINAS
        insertValues.add(values(new PontoLinha(18,8)));
        insertValues.add(values(new PontoLinha(18,9)));
        insertValues.add(values(new PontoLinha(18,10)));
        insertValues.add(values(new PontoLinha(18,11)));
        insertValues.add(values(new PontoLinha(18,19)));
        insertValues.add(values(new PontoLinha(18,20)));
        insertValues.add(values(new PontoLinha(18,21)));
        insertValues.add(values(new PontoLinha(18,22)));
        insertValues.add(values(new PontoLinha(18,23)));
        insertValues.add(values(new PontoLinha(18,24)));
        insertValues.add(values(new PontoLinha(18,25)));
        insertValues.add(values(new PontoLinha(18,26)));
        insertValues.add(values(new PontoLinha(18,48)));
        insertValues.add(values(new PontoLinha(18,49)));
        insertValues.add(values(new PontoLinha(18,131)));
        insertValues.add(values(new PontoLinha(18,134)));
        //Linha 22: TREVO - FORÚM
        insertValues.add(values(new PontoLinha(22,8)));
        insertValues.add(values(new PontoLinha(22,9)));
        insertValues.add(values(new PontoLinha(22,10)));
        insertValues.add(values(new PontoLinha(22,11)));
        insertValues.add(values(new PontoLinha(22,19)));
        insertValues.add(values(new PontoLinha(22,20)));
        insertValues.add(values(new PontoLinha(22,21)));
        insertValues.add(values(new PontoLinha(22,22)));
        insertValues.add(values(new PontoLinha(22,23)));
        insertValues.add(values(new PontoLinha(22,24)));
        insertValues.add(values(new PontoLinha(22,48)));
        insertValues.add(values(new PontoLinha(22,49)));

        //cadastrados por usuarios
        insertValues.add(values(new PontoLinha(3,98)));
        insertValues.add(values(new PontoLinha(4,98)));
        insertValues.add(values(new PontoLinha(5,98)));
        insertValues.add(values(new PontoLinha(16,98)));

        insertValues.add(values(new PontoLinha(1,99)));
        insertValues.add(values(new PontoLinha(2,99)));
        insertValues.add(values(new PontoLinha(3,99)));
        insertValues.add(values(new PontoLinha(4,99)));
        insertValues.add(values(new PontoLinha(5,99)));
        insertValues.add(values(new PontoLinha(6,99)));
        insertValues.add(values(new PontoLinha(7,99)));
        insertValues.add(values(new PontoLinha(8,99)));
        insertValues.add(values(new PontoLinha(9,99)));
        insertValues.add(values(new PontoLinha(14,99)));
        insertValues.add(values(new PontoLinha(15,99)));
        insertValues.add(values(new PontoLinha(17,99)));
        insertValues.add(values(new PontoLinha(18,99)));


        insertValues.add(values(new PontoLinha(1,100)));
        insertValues.add(values(new PontoLinha(7,100)));
        insertValues.add(values(new PontoLinha(8,100)));
        insertValues.add(values(new PontoLinha(10,100)));
        insertValues.add(values(new PontoLinha(14,100)));
        insertValues.add(values(new PontoLinha(15,100)));
        insertValues.add(values(new PontoLinha(22,100)));

        insertValues.add(values(new PontoLinha(1,101)));
        insertValues.add(values(new PontoLinha(7,101)));
        insertValues.add(values(new PontoLinha(8,101)));
        insertValues.add(values(new PontoLinha(10,101)));
        insertValues.add(values(new PontoLinha(14,101)));
        insertValues.add(values(new PontoLinha(15,101)));
        insertValues.add(values(new PontoLinha(22,101)));

        insertValues.add(values(new PontoLinha(3,102)));
        insertValues.add(values(new PontoLinha(4,102)));
        insertValues.add(values(new PontoLinha(5,102)));

        insertValues.add(values(new PontoLinha(2,103)));
        insertValues.add(values(new PontoLinha(9,103)));
        insertValues.add(values(new PontoLinha(18,103)));

        insertValues.add(values(new PontoLinha(2,104)));
        insertValues.add(values(new PontoLinha(9,104)));
        insertValues.add(values(new PontoLinha(18,104)));

        return insertValues;
    }

    private static ContentValues values(PontoLinha pontoLinha){
        ContentValues values = new ContentValues();
        values.put("idLinha", pontoLinha.getIdLinha());
        values.put("idPonto", pontoLinha.getIdPonto());
        values.put("sentido", pontoLinha.getSentido());
        return values;
    }
}
