    public class Buscaminas
{
    String [][] tablero;
    String [] resultados;
    
    public Buscaminas(){
        resultados = new String[10];
        tablero = new String[8][8];
        tablero[0][0] = "-";
        tablero[0][1] = "*";
        tablero[0][2] = "*";
        tablero[0][3] = "-";
        tablero[0][4] = "-";
        tablero[0][5] = "*";
        tablero[0][6] = "-";
        tablero[0][7] = "-";
        tablero[1][0] = "*";
        tablero[1][1] = "*";
        tablero[1][2] = "*";
        tablero[1][3] = "-";
        tablero[1][4] = "-";
        tablero[1][5] = "*";
        tablero[1][6] = "*";
        tablero[1][7] = "-";
        tablero[2][0] = "*";
        tablero[2][1] = "-";
        tablero[2][2] = "-";
        tablero[2][3] = "*";
        tablero[2][4] = "-";
        tablero[2][5] = "*";
        tablero[2][6] = "-";
        tablero[2][7] = "*";
        tablero[3][0] = "-";
        tablero[3][1] = "*";
        tablero[3][2] = "*";
        tablero[3][3] = "-";
        tablero[3][4] = "-";
        tablero[3][5] = "*";
        tablero[3][6] = "*";
        tablero[3][7] = "-";
        tablero[4][0] = "-";
        tablero[4][1] = "*";
        tablero[4][2] = "-";
        tablero[4][3] = "*";
        tablero[4][4] = "-";
        tablero[4][5] = "-";
        tablero[4][6] = "-";
        tablero[4][7] = "*";
        tablero[5][0] = "-";
        tablero[5][1] = "-";
        tablero[5][2] = "-";
        tablero[5][3] = "*";
        tablero[5][4] = "*";
        tablero[5][5] = "-";
        tablero[5][6] = "*";
        tablero[5][7] = "-";
        tablero[6][0] = "*";
        tablero[6][1] = "*";
        tablero[6][2] = "*";
        tablero[6][3] = "-";
        tablero[6][4] = "*";
        tablero[6][5] = "*";
        tablero[6][6] = "-";
        tablero[6][7] = "*";
        tablero[7][0] = "-";
        tablero[7][1] = "-";
        tablero[7][2] = "*";
        tablero[7][3] = "*";
        tablero[7][4] = "-";
        tablero[7][5] = "*";
        tablero[7][6] = "-";
        tablero[7][7] = "*";
    }
    
        public String[] UbicacionMinas(){
        int tmp = 0;
        for(int i = 1; i < 7; i++){
            for(int j = 1; j < 7; j++){
               if(tablero[i][j].equals("-")){
                if(tablero[i-1][j].equals("*")){
                    tmp++;
                }
                if(tablero[i+1][j].equals("*")){
                    tmp++;
                }
                if(tablero[i][j-1].equals("*")){
                    tmp++;
                }
                if(tablero[i][j+1].equals("*")){
                    tmp++;
                }
                if(tablero[i-1][j-1].equals("*")){
                    tmp++;
                }
                if(tablero[i+1][j+1].equals("*")){
                    tmp++;
                }
                if(tablero[i+1][j-1].equals("*")){
                    tmp++;
                }
                if(tablero[i-1][j+1].equals("*")){
                    tmp++;
                }
                if(tmp>=6){
                    for(int x = 0; x < resultados.length; x++){
                        if(resultados[x] == null){
                            resultados[x] = Integer.toString(i)+" , "+Integer.toString(j);
                            break;
                        }
                    }   
                }
                tmp = 0;
               }
            }
        }
        return resultados;
        }
}           