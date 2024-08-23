public class Universidade {

    private static String Nome;
    public static char[] getNome;
    public String getNome() {
        return Nome;
    }
    public static void setNome(String nome) {
        Nome = nome;
    }
    
    private int CNPJ;
    public int getCNPJ() {
        return CNPJ;
    }
    public void setCNPJ(int cNPJ) {
        CNPJ = cNPJ;
    }

    private String Endereço;
    public String getEndereço() {
        return Endereço;
    }
    public void setEndereço(String endereço) {
        Endereço = endereço;
    }

    private Float QtdSala;
    public Float getQtdSala() {
        return QtdSala;
    }
    public void setQtdSala(Float qtdSala) {
        QtdSala = qtdSala;
    }
}
