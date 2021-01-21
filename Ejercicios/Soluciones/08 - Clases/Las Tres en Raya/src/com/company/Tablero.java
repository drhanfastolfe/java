package com.company;

import java.util.Random;

public class Tablero
{
    private int[] tab;

    public Tablero()
    {
        this.tab = new int[9];
    }

    public void mueveJugador1(int pos)
    {
        if (movimientoValido(pos))
        {
            this.tab[pos-1] = 1;
        }
    }

    public void mueveJugador2(int pos)
    {
        if (movimientoValido(pos))
        {
            this.tab[pos-1] = 2;
        }
    }

    public boolean movimientoValido(int pos)
    {
        boolean valido = false;

        if (this.tab[pos-1] == 0)
        {
            valido = true;
        }

        return valido;
    }

    public void mueveOrdenador1()
    {
        Random r = new Random();
        int pos;
        pos = r.nextInt( 9) + 1;

        if (movimientoValido(pos))
        {
            this.tab[pos-1] = 1;
        }
    }

    public void mueveOrdenador2()
    {
        Random r = new Random();
        int pos;
        pos = r.nextInt( 9) + 1;

        if (movimientoValido(pos))
        {
            this.tab[pos-1] = 2;
        }
    }

    public void iniciar()
    {
        int i;

        for(i=0;i<this.tab.length;i++)
        {
            this.tab[i] = 0;
        }
    }

    public boolean quedanMovimiento()
    {
        int i;
        i=0;
        boolean quedan = false;

        while (i<this.tab.length && this.tab[i]!=0)
        {
            i++;
        }
        if (i<this.tab.length)
        {
            quedan = true;
        }
        return quedan;
    }

    public boolean ganaJugador1()
    {
        int i, j, linea;
        boolean resultado = false;

        for (i=0;i<9;i=i+3)
        {
            linea=0;
            for (j=i;j<i+3;j++)
            {
                if (this.tab[j]==1)
                {
                  linea++;
                }
                if (linea==3)
                {
                    resultado = true;
                    j=9;
                    i=7;
                }
            }
        }
        if (!resultado)
        {
            for (i=0;i<3;i++)
            {
                linea=0;
                for (j=i;j<9;j=j+3)
                {
                    if (this.tab[j]==1)
                    {
                        linea++;
                    }
                    if (linea==3)
                    {
                        resultado = true;
                        j=9;
                        i=3;
                    }
                }
            }
        }

        if (!resultado)
        {
            linea=0;
            for (i=0;i<9;i=i+4)
            {
                if (this.tab[i]==1)
                {
                    linea++;
                }
                if (linea==3)
                {
                    resultado=true;
                }
            }
        }

        if (!resultado)
        {
            linea=0;
            for (i=2;i<7;i=i+2)
            {
                if (this.tab[i]==1)
                {
                    linea++;
                }
                if (linea==3)
                {
                    resultado=true;
                }
            }
        }

        return resultado;
    }

    public boolean ganaJugador2()
    {
        int i, j, linea;
        boolean resultado = false;

        for (i=0;i<9;i=i+3)
        {
            linea=0;
            for (j=i;j<i+3;j++)
            {
                if (this.tab[j]==2)
                {
                    linea++;
                }
                if (linea==3)
                {
                    resultado = true;
                    j=9;
                    i=7;
                }
            }
        }
        if (!resultado)
        {
            for (i=0;i<3;i++)
            {
                linea=0;
                for (j=i;j<9;j=j+3)
                {
                    if (this.tab[j]==2)
                    {
                        linea++;
                    }
                    if (linea==3)
                    {
                        resultado = true;
                        j=9;
                        i=3;
                    }
                }
            }
        }

        if (!resultado)
        {
            linea=0;
            for (i=0;i<9;i=i+4)
            {
                if (this.tab[i]==2)
                {
                    linea++;
                }
                if (linea==3)
                {
                    resultado=true;
                }
            }
        }

        if (!resultado)
        {
            linea=0;
            for (i=2;i<7;i=i+2)
            {
                if (this.tab[i]==2)
                {
                    linea++;
                }
                if (linea==3)
                {
                    resultado=true;
                }
            }
        }

        return resultado;
    }

    public boolean empate()
    {
        int i;
        i=0;
        boolean empate = false;

        if (!ganaJugador1() && !ganaJugador2())
        {
            while (i<9 && this.tab[i]!=0)
            {
                i++;
            }
            if (i==9)
            {
                empate = true;
            }
        }
        return empate;

    }

    public void dibujaTablero()
    {
        System.out.println(xUo(this.tab[0]) + " | " + xUo(this.tab[1]) + " | " + xUo(this.tab[2]));
        System.out.println("----------");
        System.out.println(xUo(this.tab[3]) + " | " + xUo(this.tab[4]) + " | " + xUo(this.tab[5]));
        System.out.println("----------");
        System.out.println(xUo(this.tab[6]) + " | " + xUo(this.tab[7]) + " | " + xUo(this.tab[8]));
    }

    private String xUo(int pos)
    {
        String xUo;
        if (pos==1)
        {
            xUo = "X";
        }
        else
        {
            if (pos==2)
            {
                xUo = "O";
            }
            else
            {
                xUo = " ";
            }
        }
        return xUo;
    }

    public int[] getTab()
    {
        return tab;
    }

    public void setTab(int[] tab)
    {
        this.tab = tab;
    }

    public void mueveIA2()
    {
        int[] esquinas = {0,2,6,8};
        int pos, turno;
        Random r = new Random();
        turno = turno();

        if (turno==2)
        {
            if (movimientoValido(5))
            {
                this.tab[4]=2;
            }
            else
            {
                pos = esquinas[r.nextInt(4)];
                this.tab[pos]=2;
            }
        }
        else
        {
            if (turno==4)
            {
                pos = posBloqueo();
                if (pos != -1)
                {
                    this.tab[pos] = 2;
                }
                else
                {
                    pos = posBloqueoEsquina();
                    if (pos != -1)
                    {
                        this.tab[pos] = 2;
                    }
                    else
                    {
                        pos = posEstrategica();
                        this.tab[pos] = 2;
                    }
                }
            }
            else
            {
                if (turno()==6)
                {
                    pos = posGanadora();
                    if (pos != -1)
                    {
                        this.tab[pos] = 2;
                    }
                    else
                    {
                        pos = posBloqueo();
                        if (pos != -1)
                        {
                            this.tab[pos] = 2;
                        }
                        else
                        {
                            pos = posEstrategica();
                            this.tab[pos] = 2;
                        }
                    }
                }
                else
                {
                    if (turno()==8)
                    {
                        pos = posGanadora();
                        if (pos != -1)
                        {
                            this.tab[pos] = 2;
                        }
                        else
                        {
                            pos = posBloqueo();
                            if (pos != -1)
                            {
                                this.tab[pos] = 2;
                            }
                            else
                            {
                                pos = r.nextInt(9);
                                while (!movimientoValido(pos + 1))
                                {
                                    pos = r.nextInt(9);
                                }
                                this.tab[pos] = 2;
                            }
                        }
                    }
                }
            }
        }
    }

    public void mueveIA1()
    {
        int[] esquinas = {0,2,6,8};
        int pos, turno;
        Random r = new Random();
        turno = turno();

        if (turno==2)
        {
            if (movimientoValido(5))
            {
                this.tab[4]=2;
            }
            else
            {
                pos = esquinas[r.nextInt(4)];
                this.tab[pos]=2;
            }
        }
        else
        {
            if (turno==4)
            {
                pos = posBloqueo();
                if (pos != -1)
                {
                    this.tab[pos] = 2;
                }
                else
                {
                    pos = posBloqueoEsquina();
                    if (pos != -1)
                    {
                        this.tab[pos] = 2;
                    }
                    else
                    {
                        pos = posEstrategica();
                        this.tab[pos] = 2;
                    }
                }
            }
            else
            {
                if (turno()==6)
                {
                    pos = posGanadora();
                    if (pos != -1)
                    {
                        this.tab[pos] = 2;
                    }
                    else
                    {
                        pos = posBloqueo();
                        if (pos != -1)
                        {
                            this.tab[pos] = 2;
                        }
                        else
                        {
                            pos = posEstrategica();
                            this.tab[pos] = 2;
                        }
                    }
                }
                else
                {
                    if (turno()==8)
                    {
                        pos = posGanadora();
                        if (pos != -1)
                        {
                            this.tab[pos] = 2;
                        }
                        else
                        {
                            pos = posBloqueo();
                            if (pos != -1)
                            {
                                this.tab[pos] = 2;
                            }
                            else
                            {
                                pos = r.nextInt(9);
                                while (!movimientoValido(pos + 1))
                                {
                                    pos = r.nextInt(9);
                                }
                                this.tab[pos] = 2;
                            }
                        }
                    }
                }
            }
        }
    }

    private int turno()
    {
        int i, turno;
        turno=1;

        for (i=0;i<this.tab.length;i++)
        {
            if (this.tab[i]!=0)
            {
                turno++;
            }
        }

        return turno;

    }

    private int posBloqueo() // si no existe devuelve -1
    {
        int pos, i;
        pos = -1;

        for (i=0;i<this.tab.length;i++)
        {
            Tablero temp = new Tablero();
            temp.setTab(copiaArray(this.tab));
            if (temp.movimientoValido(i + 1))
            {
                temp.mueveJugador1(i+1);
                if (temp.ganaJugador1())
                {
                    pos = i;
                    i = 9;
                }
            }
        }

        return pos;
    }

    private int posEstrategica()
    {
        int pos, i, j;
        pos = -1;

        for (i=0;i<this.tab.length;i++)
        {
            Tablero temp = new Tablero();
            temp.setTab(copiaArray(this.tab));
            if (temp.movimientoValido(i + 1))
            {
                temp.mueveJugador2(i+1);
                for (j=0;j<temp.tab.length;j++)
                {
                    if (temp.movimientoValido(j + 1))
                    {
                        temp.mueveJugador2(j+1);
                        if (temp.ganaJugador2())
                        {
                            pos = j;
                            j = 9;
                            i = 9;
                        }
                    }
                }
            }
        }

        return pos;
    }

    private int posGanadora() // devuelve -1 si no existe
    {
        int pos, i;
        pos = -1;

        for (i=0; i<this.tab.length;i++)
        {
            Tablero temp = new Tablero();
            temp.setTab(copiaArray(this.tab));

            if (temp.movimientoValido(i + 1))
            {
                temp.mueveJugador2(i+1);

                if (temp.ganaJugador2())
                {
                    pos = i;
                    i = 9;
                }
            }
        }
        return pos;
    }

    private int[] copiaArray(int [] a)
    {
        int i;
        int [] copia = new int[a.length];

        for (i=0;i<a.length;i++)
        {
            copia[i] = a[i];
        }

        return copia;
    }

    private int posBloqueoEsquina()
    {
        int[] esquinas = {0,2,6,8};
        int pos, i, j, gana;
        pos = -1;

        for (i=0;i<esquinas.length;i++)
        {
            gana = 0;
            Tablero temp = new Tablero();
            temp.setTab(copiaArray(this.tab));

            if (temp.movimientoValido(esquinas[i] + 1))
            {
                temp.mueveJugador1(esquinas[i] + 1);

                for (j=0;j< temp.tab.length;j++)
                {
                    if (j != 4)
                    {
                        Tablero temp2 = new Tablero();
                        temp2.setTab(copiaArray(temp.getTab()));
                        if (temp2.movimientoValido(j+1))
                        {
                            temp2.mueveJugador1(j+1);
                            if (temp2.ganaJugador1())
                            {
                                gana++;
                            }
                        }
                        if (gana == 2)
                        {
                            pos = esquinas[i];
                            j = 9;
                            i = 9;
                        }
                    }
                }
            }
        }

        return pos;
    }

}
