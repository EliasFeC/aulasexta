public class Programa {
    public static void main(String[] args) {
        Universidade universidade = new Universidade();
        universidade.setNome("Una");
        universidade.setEndereço("Aimores");
        universidade.setCNPJ("xxxxxxxxxx");    
        universidade.setQtdeSalas(66);    

        System.out.printf("Universidade: " + universidade.getNome() + " Endereço: " + universidade.getEndereço() + " CNPJ: " +  universidade.getCNPJ() + " QtdeSalas: " +  universidade.getQtdeSalas());
    }
    
}
