package Data;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;


public class Ex16 {
	
	public static void main(String [] args) {

            Ex16 data = new Ex16();
            	
            data.inicializaData(29, 2, 2023);
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
    
    public String obterDiaDaSemana() {
        LocalDate data = LocalDate.of(ano, mes, dia);
        DayOfWeek diaDaSemana = data.getDayOfWeek();
        Locale locale = Locale.getDefault();
        return diaDaSemana.getDisplayName(TextStyle.FULL, locale);
        	
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

    public void mostraData() {
        System.out.println(dia + "/" + mes + "/" + ano);
        System.out.println(obterDiaDaSemana());
    }
}


    

   
