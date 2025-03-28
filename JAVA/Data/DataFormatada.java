package data;

public class DataFormatada {
    
    private int mesNumerico;
    private String mesExtenso;
    private int dia;
    private int ano;

    public DataFormatada(int mesNumerico, int dia, int ano) {
        this.mesNumerico = mesNumerico;
        this.mesExtenso = this.converteMesNumerico(mesNumerico);
        this.dia = dia;
        this.ano = ano;
    }
    
    public DataFormatada(String mesExtenso, int dia, int ano) {
        this.mesExtenso = mesExtenso;
        this.mesNumerico = this.converteMesExtenso(mesExtenso);
        this.dia = dia;
        this.ano = ano;
    }
    
    public DataFormatada(int dia, int ano){
        this.mesNumerico=this.converteMes(dia)[1];
        this.mesExtenso=this.converteMesNumerico(this.mesNumerico);
        this.dia=converteMes(dia)[0];
        this.ano=ano;
        
    }
    
    private String converteMesNumerico(int mes) {
        String lista[] = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", 
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        return lista[mes - 1];
    }
    
    private int converteMesExtenso(String mes) {
        String lista[] = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", 
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        for (int i = 0; i < lista.length; i++) {
            if (mes.equals(lista[i])) {
                return i + 1;
            }
        }
        return 0;
   
            }
     private int[] converteMes(int dia) {
    
     int valores[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] retorno = new int[2];
     for (int i = 0; i <12; i++) {      
         if (dia <=valores[i]) {
              retorno[0] = dia;
              retorno[1] = i+1;
              break;
         }
         dia -= valores[i]; 
        
     }
     return retorno; 
 }


    public String dataFormato01() {
        return this.dia + "/" + this.mesNumerico + "/" + this.ano + "\n";
    }
    
    public String dataFormato02() {
        return this.mesExtenso + " " + this.dia + ", " + this.ano + "\n";
    }
}
