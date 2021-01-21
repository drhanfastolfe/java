package com.company;

import java.sql.*;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class CineDB
{
    private Connection conn;

    public CineDB(String connString)
    {
        try
        {
            this.conn = DriverManager.getConnection(connString);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public int insertaPelicula(String titulo, int anno, boolean tieneOscar, double valoracion)
    {
        int idInsertado = -1;
        try
        {
            Statement st = this.conn.createStatement();

            String sql =
                    "INSERT INTO peliculas (titulo, anno, tieneOscar, valoracion) VALUES" +
                    "('" + titulo + "', '" + anno + "', " + tieneOscar + ", '" + valoracion + "');";
            st.execute(sql);

            String sqlid = "SELECT last_insert_rowid()";
            ResultSet rsid = st.executeQuery(sqlid);
            rsid.next();
            idInsertado = rsid.getInt(1);


        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return idInsertado;
    }

    public int insertaActor(String nombre, LocalDate fechaNacimiento)
    {
        int idInsertado = -1;

        try
        {
            Statement st = this.conn.createStatement();
            String sql =
                    "INSERT INTO actores (nombre, fechaNacimiento) VALUES" +
                    "('" + nombre + "', '" + fechaNacimiento + "');";
            st.execute(sql);

            String sqlid = "SELECT last_insert_rowid()";
            ResultSet rsid = st.executeQuery(sqlid);
            rsid.next();
            idInsertado = rsid.getInt(1);


        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return idInsertado;
    }

    public void asociaActorPelicula(int idActor, int idPelicula, boolean principal)
    {
        try
        {
            Statement st = this.conn.createStatement();

            String sql =
                    "INSERT INTO actoresPeliculas (idActor, idPelicula, principal) VALUES" +
                    "('" + idActor + "', '" + idPelicula + "', " + principal + ");";
            st.execute(sql);


        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public int buscaActor(String nombre)
    {
        int idActor = -1;

        try
        {
            Statement st = this.conn.createStatement();

            String sql = "SELECT id FROM actores WHERE nombre='" + nombre + "';";
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            idActor = rs.getInt("id");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return idActor;
    }

    public int buscaPelicula(String titulo)
    {
        int idPelicula = -1;

        try
        {
            Statement st = this.conn.createStatement();

            String sql = "SELECT id FROM peliculas WHERE titulo='" + titulo + "';";
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            idPelicula = rs.getInt("id");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return idPelicula;
    }

    public Pelicula datosPelicula(int idPelicula)
    {
        Pelicula p = new Pelicula();

        try
        {
            Statement st = this.conn.createStatement();

            String sql = "SELECT * FROM peliculas WHERE id='" + idPelicula + "';";
            ResultSet rs = st.executeQuery(sql);
            rs.next();

            p.id = idPelicula;
            p.titulo = rs.getString("titulo");
            p.anno = rs.getInt("anno");
            p.tieneOscar = rs.getBoolean("tieneOscar");
            p.valoracion = rs.getDouble("valoracion");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return p;
    }

    public Actor datosActor(int idActor)
    {
        Actor a = new Actor();

        try
        {
            Statement st = this.conn.createStatement();
            String sql = "SELECT * FROM actores WHERE id='" + idActor + "';";
            ResultSet rs = st.executeQuery(sql);
            rs.next();

            a.id = idActor;
            a.nombre = rs.getString("nombre");
            a.fechaNacimiento = LocalDate.parse(rs.getString("fechaNacimiento"));
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return a;
    }

    public List<Pelicula> listadoPeliculas()
    {
        List<Pelicula> listaPeliculas = new LinkedList<>();

        try
        {
            Statement st = this.conn.createStatement();
            String sql = "SELECT * FROM peliculas;";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next())
            {
                Pelicula p = new Pelicula();
                p.id = rs.getInt("id");
                p.titulo = rs.getString("titulo");
                p.anno = rs.getInt("anno");
                p.tieneOscar = rs.getBoolean("tieneOscar");
                p.valoracion = rs.getDouble("valoracion");

                listaPeliculas.add(p);
            }


        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return listaPeliculas;
    }

    public List<Actor> listadoActores()
    {
        List<Actor> listaActores = new LinkedList<>();

        try
        {
            Statement st = this.conn.createStatement();
            String sql = "SELECT * FROM actores;";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next())
            {
                Actor a = new Actor();

                a.id = rs.getInt("id");
                a.nombre = rs.getString("nombre");
                a.fechaNacimiento = LocalDate.parse(rs.getString("fechaNacimiento"));

                listaActores.add(a);
            }


        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return listaActores;
    }

    public List<Pelicula> listadoPeliculasPorActor(int idActor)
    {
        List<Pelicula> listaPeliculas = new LinkedList<>();

        try
        {
            Statement st = this.conn.createStatement();
            String sql =
                    "SELECT * FROM peliculas JOIN actoresPeliculas ON peliculas.id" +
                    "=actoresPeliculas.idPelicula WHERE actoresPeliculas.idActor='" + idActor + "';";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next())
            {
                Pelicula p = new Pelicula();
                p.id = rs.getInt("idPelicula");
                p.titulo = rs.getString("titulo");
                p.anno = rs.getInt("anno");
                p.tieneOscar = rs.getBoolean("tieneOscar");
                p.valoracion = rs.getDouble("valoracion");

                listaPeliculas.add(p);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return listaPeliculas;
    }

    public List<ActorPelicula> listadoActoresPorPelicula(int idPelicula)
    {
        List<ActorPelicula> listaActoresPelicula = new LinkedList<>();

        try
        {
            Statement st = this.conn.createStatement();
            String sql = "SELECT * FROM actores JOIN actoresPeliculas ON actores.id=" +
                    "actoresPeliculas.idActor WHERE actoresPeliculas.idPelicula='" + idPelicula + "';";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next())
            {
                ActorPelicula ap = new ActorPelicula();

                ap.id = rs.getInt("idActor");
                ap.principal = rs.getBoolean("principal");
                ap.nombre = rs.getString("nombre");
                ap.fechaNacimiento = LocalDate.parse(rs.getString("fechaNacimiento"));

                listaActoresPelicula.add(ap);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return listaActoresPelicula;
    }
}
