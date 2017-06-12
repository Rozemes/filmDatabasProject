/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmdatabas;

import java.sql.SQLException;
import java.util.ArrayList;


public class FilmDatabas {
    public static void main(String[] args) throws SQLException{
        
        ArrayList<Film> lista = Interface.filmList();
        System.out.println(lista.get(0).genre.get(1));
        System.out.println("");
        Film f = new Film(0, "hej", "action,  fantasy,,,,", "jones the man", 5);
        System.out.println(f.getGenre());
        
    }
}
