public class Atividade5 {
    public static void main(String[] args) {
        
        String tituloLivro = "O pequeno principe";
        String autor = "Sei la";
        int numPags = 999;
        char cat = 'f';

        String catDescricao;
 
        if (cat == 'F') {
            catDescricao = "Ficção";
        } else if (cat == 'N') {
            catDescricao = "Não-ficção";
        } else if (cat == 'T') {
            catDescricao = "Tecnologia";
        } else if (cat == 'H') {
            catDescricao = "História";
        } else {
            catDescricao = "cat inválida";
        }
 
        System.out.println("Livro cadastrado: \"" + tituloLivro + "\", de " + autor + ". Ele possui " + numPags + " páginas e pertence à "+  catDescricao );
    }
}
