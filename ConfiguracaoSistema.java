class ConfiguracaoSistema{
    final String idioma;
    final String fusoHorario;
    final String tema;
    final String tamanhoFonte;
    final String nomeEmpresa;
    private static ConfiguracaoSistema instance;

    public static ConfiguracaoSistema getInstance(ConfiguracaoSistema instance){
        if (ConfiguracaoSistema.instance == null) {
            ConfiguracaoSistema.instance = instance;
        }
        return instance;
    }
    

    public String getIdioma() {
        return idioma;
    }

    public String getFusoHorario() {
        return fusoHorario;
    }

    public String getTema() {
        return tema;
    }

    public String getTamanhoFonte() {
        return tamanhoFonte;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }


    ConfiguracaoSistema(Builder build){
        this.idioma = build.idioma;
        this.fusoHorario = build.fusoHorario;
        this.tema = build.tema;
        this.tamanhoFonte = build.tamanhoFonte;
        this.nomeEmpresa = build.nomeEmpresa;
    }

    public static class Builder{
        private String idioma;
        private String fusoHorario;
        private String tema;
        private String tamanhoFonte;
        private String nomeEmpresa; 

        public Builder(String nomeEmpresa) {
            this.nomeEmpresa = nomeEmpresa;
        }

        public Builder setIdioma(String idioma) {
            this.idioma = idioma;
            return this;
        }

        public Builder setFusoHorario(String fusoHorario) {
            this.fusoHorario = fusoHorario;
            return this;
        }

        public Builder setTema(String tema) {
            this.tema = tema;
            return this;
        }

        public Builder setTamanhoFonte(String tamanhoFonte) {
            this.tamanhoFonte = tamanhoFonte;
            return this;
        }

        public Builder setNomeEmpresa(String nomeEmpresa) {
            this.nomeEmpresa = nomeEmpresa;
            return this;
        }

        public ConfiguracaoSistema build() {
            return new ConfiguracaoSistema(this);
        }

    }
}