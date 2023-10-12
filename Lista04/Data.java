package Data;


public class Data {
	
	public static void main(String [] args) {

            Data data = new Data();
            	
            data.inicializaData(12, 4, 2023);
            data.imprimirData();
            data.imprimirDataExtenso();
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

    public void imprimirData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
    
    public void imprimirDataExtenso() {
    	String mesN = null;
    	if(mes == 1)
    		mesN = "Janeiro";
    	else if(mes == 2)
    		mesN = "Fevereiro";
    	else if(mes == 3)
    		mesN = "Março";
    	else if(mes == 4)
    		mesN = "Abril";
    	else if(mes == 5)
    		mesN = "Maio";
    	else if(mes == 6)
    		mesN = "Junho";
    	else if(mes == 7)
    		mesN = "Julho";
    	else if(mes == 8)
    		mesN = "Agosto";
    	else if(mes == 9)
    		mesN = "Setembro";
    	else if(mes == 10)
    		mesN = "Outubro";
    	else if(mes == 11)
    		mesN = "Novembro";
    	else if(mes == 12)
    		mesN = "Dezembro";
    	System.out.println(dia + " de " + mesN + " de " + ano);
    }

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
    
    
}


    

   

