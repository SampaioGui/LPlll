package Data;


public class Ex15 {
	
	public static void main(String [] args) {

            Ex15 data = new Ex15();
            	
            data.inicializaData(30, 2, 2028);
            data.mostraData();
        }

    int dia, mes, ano;

    public void inicializaData(int umDia, int umMes, int umAno) {
        if (dataEValida(umDia, umMes, umAno)) {
            dia = umDia;
            mes = umMes;
            ano = umAno;
        } else {
            dia = 0;
            mes = 0;
            ano = 0;
        }


    }

    public boolean dataEValida(int umDia, int umMes, int umAno) {
        
    	if (umMes >= 1 && umMes <= 12) {
            if (umDia >= 1 && umDia <= diaMaxMes(umMes, umAno)) {
                return true;
            }
        }
        return false;
 }
    
    public int diaMaxMes(int umMes, int umAno) {
    	 if (umMes == 2) { 
    	        if (umAno % 4 == 0 && (umAno % 100 != 0 || umAno % 400 == 0)) {
    	            return 29; 
    	        } else {
    	            return 28; 
    	        }
    	    } else if (umMes == 4 || umMes == 6 || umMes == 9 || umMes == 11) {
    	        return 30; 
    	    } else {
    	        return 31; 
    	    }
    }

    private void mostraData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}


    

   

