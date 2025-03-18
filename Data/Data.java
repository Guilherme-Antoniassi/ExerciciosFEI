
package data;


public class Data {


    public static void main(String[] args) {
       DataFormatada data1=new DataFormatada(2,27,2025);
       DataFormatada data2=new DataFormatada("Janeiro",27,2025);
       DataFormatada data3=new DataFormatada(218,2025);
       
       System.out.println(data1.dataFormato01());
        System.out.println(data1.dataFormato02());
        
               System.out.println(data2.dataFormato01());
               System.out.println(data2.dataFormato02());
               
                    System.out.println(data3.dataFormato01());
               System.out.println(data3.dataFormato02());
    }
    
}
