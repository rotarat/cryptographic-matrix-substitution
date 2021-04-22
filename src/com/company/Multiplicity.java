package com.company;

public class Multiplicity {
    public Symbol[] allowedSymbols;
    public int length;

    public Multiplicity()
    {
        this.length = 30;
        this.allowedSymbols = new Symbol[length];
        createM();
    }

    private void createM ()
    {
        for (int i = 0; i < length; i++)
        {
            allowedSymbols[i] = new Symbol();
            //bulgarian letters and their indexes
            switch (i)
            {
                case 0:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'А';
                    break;
                case 1:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'Б';
                    break;
                case 2:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'В';
                    break;
                case 3:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'Г';
                    break;
                case 4:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'Д';
                    break;
                case 5:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'Е';
                    break;
                case 6:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'Ж';
                    break;
                case 7:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'З';
                    break;
                case 8:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'И';
                    break;
                case 9:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'Й';
                    break;
                case 10:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'К';
                    break;
                case 11:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'Л';
                    break;
                case 12:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'М';
                    break;
                case 13:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'Н';
                    break;
                case 14:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'О';
                    break;
                case 15:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'П';
                    break;
                case 16:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'Р';
                    break;
                case 17:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'С';
                    break;
                case 18:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'Т';
                    break;
                case 19:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'У';
                    break;
                case 20:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'Ф';
                    break;
                case 21:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'Х';
                    break;
                case 22:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'Ц';
                    break;
                case 23:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'Ч';
                    break;
                case 24:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'Ш';
                    break;
                case 25:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'Щ';
                    break;
                case 26:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'Ъ';
                    break;
                case 27:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'Ь';
                    break;
                case 28:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'Ю';
                    break;
                case 29:
                    allowedSymbols[i].index = i;
                    allowedSymbols[i].symbol = 'Я';
                    break;
                default:
                    break;
            }
        }
    }

    public int findSymbolIndex (char symbol) {
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (allowedSymbols[i].symbol == symbol) {
                index = allowedSymbols[i].index;
            }
        }
        return index;
    }
}
