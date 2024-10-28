package br.com.webserviceclient.configuracao.jersey.client.template;

public interface RestTemplateImp {

    public enum Publico {
        STATUS("/status");

        private final String url;

        private Publico(String url) {
            this.url = url;
        }

        public String getUrl() {
            return url;
        }
    }

    public interface Administracao {

        public enum Escola {
            ESCOLA("/private/escola");

            private final String url;

            private Escola(String url) {
                this.url = url;
            }

            public String getUrl() {
                return url;
            }
        }
    }

    public interface Prodesp {

        public static final String QUALIFIER = "prodesp";

        public enum Security {
            TIPO_CONSULTA_FICHA_ALUNO("/private/tipoconsultafichaaluno"),
            AUTHORIZATION_PRODESP("/private/authorizationprodesp"),
            REALIZARMATRICULA_SEM_RA("/private/realizarmatriculasemra"),
            REALIZAR_MATRICULA_COM_RA("/private/realizarmatriculaInfocomra"),
            CONSULTAR_FICHA_ALUNO("/private/fichaaluno"),
            ALTERAR_COLETA_CLASSE("/private/alterarcoletaclasse"),
            INCLUIR_COLETA_CLASSE("/private/incluircoletaclasse"),
            CONSULTAR_COLETA_CLASSE("/private/consultarcoletaclasse"),
            CONSULTAR_ESCOLA_CIE("/private/consultarescolacie"),
            CONSULTAR_MATRICULAS_RA("/private/consultarmatriculasra"),
            CONSULTAR_QUADRO_RESUMO("/private/consultarquadroresumo"),
            EXCLUIR_MATRICULA("/private/excluirmatricula"),
            TROCAR_ALUNO_CLASSERA("/private/trocaralunoclassera"),
            ALTERAR_ENDERECO_FICHA_ALUNO("/private/alterarenderecofichaaluno"),
            ALTERAR_DADOS_PESSOAIS_FICHA_ALUNO("/private/alterardadospessoaisfichaaluno"),
            CONSULTA_CLASSE_ALUNO_POR_ESCOLA("/private/consultaclassealunoporescola"),
            ALTERAR_DOCUMENTOS_FICHA_ALUNO("/private/alterardocumentosfichaaluno"),
            EXCLUIR_COLETA_CLASSE("/private/excluircoletaclasse"),
            CONSULTA_FORMACAO_CLASSE("/private/consultaformacaoclasse"),
            STATUS("/private/fichaaluno/status");

            private final String url;

            private Security(String url) {
                this.url = url;
            }

            public String getUrl() {
                return url;
            }
        }
    }

    public interface Dispose {

        public enum Security {
            CLASSE("/private/classe");

            private final String url;

            private Security(String url) {
                this.url = url;
            }

            public String getUrl() {
                return url;
            }
        }
    }
}
