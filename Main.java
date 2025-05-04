public class Main {
    public static void main(String[] args) {

        ConfiguracaoSistema configuracao = new ConfiguracaoSistema.Builder("Minha Empresa")
        .setIdioma("Português")
        .setFusoHorario("GMT-3")
        .setTema("Claro")
        .setTamanhoFonte("12")
        .build();
        
        ConfiguracaoSistema c = ConfiguracaoSistema.getInstance(configuracao);

        System.out.println("Configuração do Sistema:");
        System.out.println("Nome da Empresa: " + c.getNomeEmpresa());
        System.out.println("Idioma: " + c.getIdioma());
        System.out.println("Fuso Horário: " + c.getFusoHorario());
        System.out.println("Tema: " + c.getTema());
        System.out.println("Tamanho da Fonte: " + c.getTamanhoFonte());
    }
}