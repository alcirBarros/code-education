package br.com.webservice.services.security.dispose.classe;

import br.com.domain.AcessoAtivo;
import br.com.domain.Escola;
import br.com.domain.Municipio;
import br.com.domain.Operador;
import br.com.domain.auxiliar.tipoensino.model.TipoEnsino;
import br.com.domain.auxiliar.tipoturno.model.TipoTurno;
import br.com.domain.integracao.consultaclassealunoporescola.model.ConsultaClasseAlunoPorEscola;
import br.com.domain.integracao.consultaclassealunoporescola.model.ConsultaClasseAlunoPorEscolaResponse;
import br.com.domain.integracao.consultaclassealunoporescola.model.MsgConsultaClasseAlunoPorEscola;
import br.com.domain.integracao.consultafichaaluno.model.ConsultaRA;
import br.com.domain.integracao.consultafichaaluno.model.ConsultarFichaAluno;
import br.com.domain.integracao.consultafichaaluno.model.ConsultarFichaAlunoResponse;
import br.com.domain.integracao.consultafichaaluno.model.FichaAluno;
import br.com.domain.integracao.consultaformacaoclasse.ConsultaClasse;
import br.com.domain.integracao.consultaformacaoclasse.ConsultaFormacaoClasse;
import br.com.domain.integracao.consultaformacaoclasse.ConsultaFormacaoClasseResponse;
import br.com.projeto.security.OperadorLogado;
import br.com.service.integracao.consultaclassealunoporescola.ConsultaClasseAlunoPorEscolaService;
import br.com.service.integracao.consultaformacaoclasse.ConsultaFormacaoClasseService;
import br.com.service.integracao.consultarfichaaluno.ConsultarFichaAlunoService;
import br.com.service.modulo.administracao.escola.EscolaService;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.PostConstruct;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Path("/private/classe")
public class ClasseWs {

    @Autowired
    private OperadorLogado operadorLogado;
    @Autowired
    private EscolaService escolaService;
    @Autowired
    private ConsultaClasseAlunoPorEscolaService consultaClasseAlunoPorEscolaService;
    @Autowired
    private ConsultaFormacaoClasseService consultaFormacaoClasseService;
    @Autowired
    private ConsultarFichaAlunoService consultarFichaAlunoService;

    @PostConstruct
    private void init() {

    }

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response get() {

        Operador operador = (Operador) operadorLogado.getUser();
        AcessoAtivo acessoAtivo = operador.getAcessoAtivo();
        Municipio municipio = acessoAtivo.getVinculoProfissional().getMunicipio();

        System.out.println(municipio.getNomeFantasia());

        List<Escola> escolaList = escolaService.findByMunicipio(municipio);

        List<EscolaPojo> escolaPojoList = new ArrayList<>();
        for (Escola escola : escolaList) {
            System.out.println(escola.getNomeFantasia());

            EscolaPojo escolaPojo = new EscolaPojo();
            escolaPojo.setCodigoEscola(escola.getCodigoEscola());
            escolaPojo.setNome(escola.getNomeFantasia());

            ConsultaClasseAlunoPorEscola consultaClasseAlunoPorEscola = new ConsultaClasseAlunoPorEscola();
            consultaClasseAlunoPorEscola.setInAnoLetivo("2019");
            consultaClasseAlunoPorEscola.setInCodEscola(escola.getCodigoEscola());
            consultaClasseAlunoPorEscola = consultaClasseAlunoPorEscolaService.consultaClasseAlunoPorEscola(consultaClasseAlunoPorEscola);
            ConsultaClasseAlunoPorEscolaResponse consultaClasseAlunoPorEscolaResponse = consultaClasseAlunoPorEscola.getConsultaClasseAlunoPorEscolaResponse();
            Set<MsgConsultaClasseAlunoPorEscola> msgConsultaClasseAlunoPorEscolaList = consultaClasseAlunoPorEscolaResponse.getMsgConsultaClasseAlunoPorEscolaList();

            for (MsgConsultaClasseAlunoPorEscola msgConsultaClasseAlunoPorEscola : msgConsultaClasseAlunoPorEscolaList) {

                ClassePojo classePojo = new ClassePojo();

                {
                    String outNrClasse = msgConsultaClasseAlunoPorEscola.getOutNrClasse();
                    classePojo.setNumeroClasse(outNrClasse);
                }

                {
                    String turma = msgConsultaClasseAlunoPorEscola.getOutTurma();
                    classePojo.setTurma(turma);
                }

                {
                    TipoEnsino tipoEnsino = msgConsultaClasseAlunoPorEscola.getTipoEnsino();
                    if (tipoEnsino != null && tipoEnsino.getId() != null) {
                        TipoEnsinoPojo tipoEnsinoPojo = new TipoEnsinoPojo();
                        tipoEnsinoPojo.setCodigo(tipoEnsino.getCodigo());
                        tipoEnsinoPojo.setDescricao(tipoEnsino.getDescricao());
                        classePojo.setTipoEnsinoPojo(tipoEnsinoPojo);
                    }
                }
                {
                    TipoTurno tipoTurno = msgConsultaClasseAlunoPorEscola.getTipoTurno();
                    classePojo.setTipoTurno(tipoTurno.getDisplay());
                }

                List<AlunoPojo> alunoList = aluno(classePojo);

                classePojo.getAlunoList().addAll(alunoList);

                escolaPojo.getClasseList().add(classePojo);
            }

            escolaPojoList.add(escolaPojo);
        }

        return Response.status(200).entity(escolaPojoList).build();
    }

    private List<AlunoPojo> aluno(ClassePojo classePojo) {

        ConsultaFormacaoClasse consultaFormacaoClasse = new ConsultaFormacaoClasse();
        consultaFormacaoClasse.setInNumClasse(classePojo.getNumeroClasse());
        consultaFormacaoClasse = consultaFormacaoClasseService.consultaFormacaoClasse(consultaFormacaoClasse);
        ConsultaFormacaoClasseResponse consultaFormacaoClasseResponse = consultaFormacaoClasse.getConsultaFormacaoClasseResponse();

        Set<ConsultaClasse> consultaClasseList = consultaFormacaoClasseResponse.getConsultaClasseList();

        List<AlunoPojo> alunoList = new ArrayList<>();
        for (ConsultaClasse consultaClasse : consultaClasseList) {
            classePojo.setTipoTurno(consultaClasse.getOutTurno());
            classePojo.setNumeroSala(consultaClasse.getOutNumSala());

            ConsultarFichaAluno consultarFichaAluno = new ConsultarFichaAluno();
            {
                String nomeAluno = consultaClasse.getNomeAluno();
                String numeroRa = consultaClasse.getRa();
                String digitoRA = consultaClasse.getDigitoRA();
                String alunoUf = consultaClasse.getUf();

                ConsultaRA consultaRA = new ConsultaRA();
                consultaRA.setInRA(numeroRa);
                consultaRA.setInDigitoRA(digitoRA);
                consultaRA.setInUF(alunoUf);
                consultarFichaAluno.setConsultaRA(consultaRA);
                consultarFichaAluno = consultarFichaAlunoService.consultarFichaAluno(consultarFichaAluno);
            }

            ConsultarFichaAlunoResponse consultarFichaAlunoResponse = consultarFichaAluno.getConsultarFichaAlunoResponse();
            FichaAluno fichaAluno = consultarFichaAlunoResponse.getFichaAluno();

            String nomeAluno = fichaAluno.getOutNomeAluno();
            String numeroRa = fichaAluno.getOutRA();
            String digitoRA = fichaAluno.getOutDigitoRA();
            String sexo = fichaAluno.getOutSexo();
            String cpf = fichaAluno.getOutCPF();
            String cor = fichaAluno.getOutCorRaca();
            String dataNascimento = fichaAluno.getOutDataNascimento();

            String quilombola = fichaAluno.getOutQuilombola();
            String bolsaFamilia = fichaAluno.getOutBolsaFamilia();
            String mobilidadeReduzida = fichaAluno.getOutMobilidadeReduzida();

            String email = fichaAluno.getOutEmail();
            String nacionalidade = fichaAluno.getOutNacionalidade();

            String uf = fichaAluno.getOutUF();
            String cidade = fichaAluno.getOutCidade();
            String endereco = fichaAluno.getOutEndereco();
            String numero = fichaAluno.getOutNumero();
            String bairro = fichaAluno.getOutBairro();
            String cep = fichaAluno.getOutCEP();
            String logradouro = fichaAluno.getOutLogradouro();
            String complemento = fichaAluno.getOutComplemento();

            String ufNascimento = fichaAluno.getOutUFNascimento();

            String numeroRg = fichaAluno.getOutNumRG();
            String ufRg = fichaAluno.getOutUFRG();

            String mae = fichaAluno.getOutNomeMae();
            String pai = fichaAluno.getOutNomePai();

            {
                AlunoPojo aluno = new AlunoPojo();
                aluno.setNome(nomeAluno);
                aluno.setNumeroRa(numeroRa);
                aluno.setDigitoRa(digitoRA);

                aluno.setSexo(sexo);
                aluno.setCpf(cpf);
                aluno.setCor(cor);
                aluno.setDataNascimento(dataNascimento);

                aluno.setQuilombola(quilombola);
                aluno.setBolsaFamilia(bolsaFamilia);
                aluno.setMobilidadeReduzida(mobilidadeReduzida);

                aluno.setEmail(email);
                aluno.setNacionalidade(nacionalidade);

                aluno.setUf(uf);
                aluno.setCidade(cidade);
                aluno.setEndereco(endereco);
                aluno.setNumero(numero);
                aluno.setBairro(bairro);
                aluno.setCep(cep);
                aluno.setLogradouro(logradouro);
                aluno.setComplemento(complemento);

                aluno.setUfNascimento(ufNascimento);

                aluno.setNumeroRg(numeroRg);
                aluno.setUfRg(ufRg);

                aluno.setMae(mae);
                aluno.setPai(pai);

                alunoList.add(aluno);
            }
        }

        return alunoList;
    }
}
