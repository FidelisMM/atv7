
package calculadormedia;

public class Aluno {
    private double media;
    private String m1;
    private String m2;
    
    public void setM1(String m1){
        this.m1 = m1;
    }
    public void setM2(String m2){
        this.m2 = m2;
    }
    
    public String getM1(){
        return m1;
    }
    
    public String getM2(){
        return m2;
    }
    
    public double getMedia(){
        return media;
    }

    public void calcularMedia0(){
        media = ((Double.parseDouble(m1))+(Double.parseDouble(m2)))/2;
    }
}
