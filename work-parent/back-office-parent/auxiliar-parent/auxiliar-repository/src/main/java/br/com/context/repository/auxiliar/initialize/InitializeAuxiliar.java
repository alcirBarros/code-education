package br.com.context.repository.auxiliar.initialize;

import br.com.context.model.diasemana.enumerator.TipoDiaSemanaEnum;
import br.com.context.model.diasemana.model.TipoDiaSemana;
import br.com.context.model.escolaridade.model.TipoEscolaridade;
import br.com.context.model.estadocivil.enumerator.TipoEstadoCivilEnum;
import br.com.context.model.estadocivil.model.TipoEstadoCivil;
import br.com.context.model.tipocontato.enumerator.TipoContatoEnum;
import br.com.context.model.tipocontato.model.TipoContato;
import br.com.context.model.tipodadoclinico.model.TipoDadoClinico;
import br.com.context.model.tipodocumento.enumerator.TipoDocumentoEnum;
import br.com.context.model.tipodocumento.model.TipoDocumento;
import br.com.context.model.tipoendereco.enumerator.TipoEnderecoEnum;
import br.com.context.model.tipoendereco.model.TipoEndereco;
import br.com.context.model.tipoevento.enumerator.TipoEventoEnum;
import br.com.context.model.tipoevento.model.TipoEvento;
import br.com.context.model.tipogrupoanamnese.enumerator.TipoGrupoAnamneseEnum;
import br.com.context.model.tipogrupoanamnese.model.TipoGrupoAnamnese;
import br.com.context.model.tiponacionalidade.enumerator.TipoNacionalidadeEnum;
import br.com.context.model.tiponacionalidade.model.TipoNacionalidade;
import br.com.context.model.tiporacacor.enumerator.TipoRacaCorEnum;
import br.com.context.model.tiporacacor.model.TipoRacaCor;
import br.com.context.model.tiporesponsavel.enumerator.TipoResponsavelEnum;
import br.com.context.model.tiporesponsavel.model.TipoResponsavel;
import br.com.context.model.tiposexo.enumerator.TipoSexoEnum;
import br.com.context.model.tiposexo.model.TipoSexo;
import br.com.context.annotation.Development;
import br.com.context.repository.auxiliar.diasemana.TipoDiaSemanaRepository;
import br.com.context.repository.auxiliar.tipodadoclinico.TipoDadoClinicoRepository;
import br.com.context.repository.auxiliar.tipoendereco.TipoEnderecoRepository;
import br.com.context.repository.auxiliar.tiporesponsavel.TipoResponsavelRepository;
import br.com.context.repository.auxiliar.tiposexo.TipoSexoRepository;
import br.com.context.repository.auxiliar.escolaridade.TipoEscolaridadeRepository;
import br.com.context.repository.auxiliar.estadocivil.TipoEstadoCivilRepository;
import br.com.context.repository.auxiliar.tipocontato.TipoContatoRepository;
import br.com.context.repository.auxiliar.tipodocumento.TipoDocumentoRepository;
import br.com.context.repository.auxiliar.tipoevento.TipoEventoRepository;
import br.com.context.repository.auxiliar.tipogrupoanamnese.TipoGrupoAnamnseRepository;
import br.com.context.repository.auxiliar.tiponacionalidade.TipoNacionalidadeRepository;
import br.com.context.repository.auxiliar.tiporacacor.TipoRacaCorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;

@Order(1)
@Configuration
@Development
@Profile({"init"})
public class InitializeAuxiliar implements CommandLineRunner {

    @Autowired
    private TipoContatoRepository tipoContatoRepository;
    @Autowired
    private TipoResponsavelRepository tipoResponsavelRepository;
    @Autowired
    private TipoEstadoCivilRepository tipoEstadoCivilRepository;
    @Autowired
    private TipoRacaCorRepository tipoRacaCorRepository;
    @Autowired
    private TipoNacionalidadeRepository tipoNacionalidadeRepository;
    @Autowired
    private TipoSexoRepository tipoSexoRepository;
    @Autowired
    private TipoDiaSemanaRepository tipoDiaSemanaRepository;
    @Autowired
    private TipoGrupoAnamnseRepository tipoGrupoAnamnseRepository;
    @Autowired
    private TipoDadoClinicoRepository tipoDadoClinicoRepository;
    @Autowired
    private TipoEscolaridadeRepository tipoEscolaridadeRepository;
    @Autowired
    private TipoEventoRepository tipoEventoRepository;
    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;
    @Autowired
    private TipoEnderecoRepository tipoEnderecoRepository;

    @Override
    public void run(String... args) throws Exception {

        {
            TipoDocumento tipoDocumento = new TipoDocumento();
            tipoDocumento.setTipoDocumentoEnum(TipoDocumentoEnum.CPF);
            tipoDocumento.setDescricao("CPF");
            tipoDocumento.setMask("999.999.999-99");
            tipoDocumentoRepository.save(tipoDocumento);
        }

        {
            TipoDocumento tipoDocumento = new TipoDocumento();
            tipoDocumento.setTipoDocumentoEnum(TipoDocumentoEnum.CNPJ);
            tipoDocumento.setDescricao("CNPJ");
            tipoDocumento.setMask("99.999.999/9999-99");
            tipoDocumentoRepository.save(tipoDocumento);
        }

        {
            TipoEvento tipoEvento = new TipoEvento();
            tipoEvento.setDescricao("E-mail");
            tipoEvento.setTipoEventoEnum(TipoEventoEnum.E_MAIL);
            tipoEventoRepository.save(tipoEvento);
        }

        {
            TipoContato tipoContato = new TipoContato();
            tipoContato.setDescricao("Telefone");
            tipoContato.setTipoContatoEnum(TipoContatoEnum.TELEFONE);
            tipoContato.setMask("(99) ?9999 - 99999");
            tipoContatoRepository.save(tipoContato);
        }

        {
            TipoContato tipoContato = new TipoContato();
            tipoContato.setDescricao("E-mail");
            tipoContato.setTipoContatoEnum(TipoContatoEnum.EMAIL);
            tipoContatoRepository.save(tipoContato);
        }

        {
            TipoContato tipoContato = new TipoContato();
            tipoContato.setDescricao("Outros");
            tipoContato.setTipoContatoEnum(TipoContatoEnum.OUTROS);
            tipoContatoRepository.save(tipoContato);
        }

        {
            TipoEndereco tipoEndereco = new TipoEndereco();
            tipoEndereco.setDescricao("CASA");
            tipoEndereco.setTipoEnderecoEnum(TipoEnderecoEnum.CASA);
            tipoEnderecoRepository.save(tipoEndereco);
        }

        {
            TipoEndereco tipoEndereco = new TipoEndereco();
            tipoEndereco.setDescricao("TRABALHO");
            tipoEndereco.setTipoEnderecoEnum(TipoEnderecoEnum.TRABALHO);
            tipoEnderecoRepository.save(tipoEndereco);
        }

        {
            TipoResponsavel tipoResponsavel = new TipoResponsavel();
            tipoResponsavel.setDescricao("Mãe");
            tipoResponsavel.setTipoResponsavelEnum(TipoResponsavelEnum.MAE);
            tipoResponsavelRepository.save(tipoResponsavel);
        }

        {
            TipoResponsavel tipoResponsavel = new TipoResponsavel();
            tipoResponsavel.setDescricao("Pai");
            tipoResponsavel.setTipoResponsavelEnum(TipoResponsavelEnum.PAI);
            tipoResponsavelRepository.save(tipoResponsavel);
        }
        {
            TipoResponsavel tipoResponsavel = new TipoResponsavel();
            tipoResponsavel.setDescricao("Tio");
            tipoResponsavel.setTipoResponsavelEnum(TipoResponsavelEnum.TIO);
            tipoResponsavelRepository.save(tipoResponsavel);
        }
        {
            TipoResponsavel tipoResponsavel = new TipoResponsavel();
            tipoResponsavel.setDescricao("Tia");
            tipoResponsavel.setTipoResponsavelEnum(TipoResponsavelEnum.TIA);
            tipoResponsavelRepository.save(tipoResponsavel);
        }
        {
            TipoResponsavel tipoResponsavel = new TipoResponsavel();
            tipoResponsavel.setDescricao("Irmão");
            tipoResponsavel.setTipoResponsavelEnum(TipoResponsavelEnum.IRMAO);
            tipoResponsavelRepository.save(tipoResponsavel);
        }
        {
            TipoResponsavel tipoResponsavel = new TipoResponsavel();
            tipoResponsavel.setDescricao("IRMA");
            tipoResponsavel.setTipoResponsavelEnum(TipoResponsavelEnum.IRMA);
            tipoResponsavelRepository.save(tipoResponsavel);
        }

        {
            TipoEstadoCivil tipoEstadoCivil = new TipoEstadoCivil();
            tipoEstadoCivil.setDescricao("Solteiro");
            tipoEstadoCivil.setTipoEstadoCivilEnum(TipoEstadoCivilEnum.SOLTEIRO);
            tipoEstadoCivilRepository.save(tipoEstadoCivil);
        }

        {
            TipoEstadoCivil tipoEstadoCivil = new TipoEstadoCivil();
            tipoEstadoCivil.setDescricao("Casado");
            tipoEstadoCivil.setTipoEstadoCivilEnum(TipoEstadoCivilEnum.CASADO);
            tipoEstadoCivilRepository.save(tipoEstadoCivil);
        }

        {

            TipoRacaCor tipoRacaCor = new TipoRacaCor();
            tipoRacaCor.setDescricao("Branca");
            tipoRacaCor.setCodigo("01");
            tipoRacaCor.setTipoRacaCorEnum(TipoRacaCorEnum.BRANCA);
            tipoRacaCorRepository.save(tipoRacaCor);
        }

        {

            TipoRacaCor tipoRacaCor = new TipoRacaCor();
            tipoRacaCor.setDescricao("Preta");
            tipoRacaCor.setCodigo("02");
            tipoRacaCor.setTipoRacaCorEnum(TipoRacaCorEnum.PRETA);
            tipoRacaCorRepository.save(tipoRacaCor);
        }
        {

            TipoRacaCor tipoRacaCor = new TipoRacaCor();
            tipoRacaCor.setDescricao("PARDA");
            tipoRacaCor.setCodigo("03");
            tipoRacaCor.setTipoRacaCorEnum(TipoRacaCorEnum.PARDA);
            tipoRacaCorRepository.save(tipoRacaCor);
        }
        {

            TipoRacaCor tipoRacaCor = new TipoRacaCor();
            tipoRacaCor.setDescricao("Amarela");
            tipoRacaCor.setCodigo("04");
            tipoRacaCor.setTipoRacaCorEnum(TipoRacaCorEnum.AMARELA);
            tipoRacaCorRepository.save(tipoRacaCor);
        }
        {

            TipoRacaCor tipoRacaCor = new TipoRacaCor();
            tipoRacaCor.setDescricao("Indígena");
            tipoRacaCor.setCodigo("05");
            tipoRacaCor.setTipoRacaCorEnum(TipoRacaCorEnum.INDIGENA);
            tipoRacaCorRepository.save(tipoRacaCor);
        }
        {

            TipoRacaCor tipoRacaCor = new TipoRacaCor();
            tipoRacaCor.setDescricao("Não Declarada");
            tipoRacaCor.setCodigo("06");
            tipoRacaCor.setTipoRacaCorEnum(TipoRacaCorEnum.NAO_DECLARADA);
            tipoRacaCorRepository.save(tipoRacaCor);
        }

        {
            TipoNacionalidade tipoNacionalidade = new TipoNacionalidade();
            tipoNacionalidade.setDescricao("Brasileiro");
            tipoNacionalidade.setCodigo("1");
            tipoNacionalidade.setTipoNacionalidadeEnum(TipoNacionalidadeEnum.BRASILEIRO);
            tipoNacionalidadeRepository.save(tipoNacionalidade);
        }

        {
            TipoNacionalidade tipoNacionalidade = new TipoNacionalidade();
            tipoNacionalidade.setDescricao("Estrangeiro");
            tipoNacionalidade.setCodigo("2");
            tipoNacionalidade.setTipoNacionalidadeEnum(TipoNacionalidadeEnum.ESTRANGEIRO);
            tipoNacionalidadeRepository.save(tipoNacionalidade);
        }
        {
            TipoNacionalidade tipoNacionalidade = new TipoNacionalidade();
            tipoNacionalidade.setDescricao("Brasileiro nacido no exterior");
            tipoNacionalidade.setCodigo("3");
            tipoNacionalidade.setTipoNacionalidadeEnum(TipoNacionalidadeEnum.BRASILEIRO_NACIDO_NO_EXTERIOR);
            tipoNacionalidadeRepository.save(tipoNacionalidade);
        }

        {
            TipoSexo tipoSexo = new TipoSexo();
            tipoSexo.setDescricao("Masculino");
            tipoSexo.setCodigo("M");
            tipoSexo.setTipoSexoEnum(TipoSexoEnum.MASCULINO);
            tipoSexoRepository.save(tipoSexo);
        }

        {
            TipoSexo tipoSexo = new TipoSexo();
            tipoSexo.setDescricao("Feminino");
            tipoSexo.setCodigo("F");
            tipoSexo.setTipoSexoEnum(TipoSexoEnum.FEMININO);
            tipoSexoRepository.save(tipoSexo);
        }

        {
            TipoSexo tipoSexo = new TipoSexo();
            tipoSexo.setDescricao("Sem declaração");
            tipoSexo.setCodigo("S");
            tipoSexo.setTipoSexoEnum(TipoSexoEnum.SEM_DECLARACAO);
            tipoSexoRepository.save(tipoSexo);
        }

        {
            TipoDiaSemana tipoDiaSemana = new TipoDiaSemana();
            tipoDiaSemana.setDescricao("Segunda-feira");
            tipoDiaSemana.setTipoDiaSemanaEnum(TipoDiaSemanaEnum.SEGUNDA_FEIRA);
            tipoDiaSemanaRepository.save(tipoDiaSemana);
        }
        {
            TipoDiaSemana tipoDiaSemana = new TipoDiaSemana();
            tipoDiaSemana.setDescricao("Terça-feira");
            tipoDiaSemana.setTipoDiaSemanaEnum(TipoDiaSemanaEnum.TERCA_FEIRA);
            tipoDiaSemanaRepository.save(tipoDiaSemana);
        }
        {
            TipoDiaSemana tipoDiaSemana = new TipoDiaSemana();
            tipoDiaSemana.setDescricao("Quarta-feira");
            tipoDiaSemana.setTipoDiaSemanaEnum(TipoDiaSemanaEnum.QUARTA_FEIRA);
            tipoDiaSemanaRepository.save(tipoDiaSemana);
        }

        {
            TipoDiaSemana tipoDiaSemana = new TipoDiaSemana();
            tipoDiaSemana.setDescricao("Quinta-feira");
            tipoDiaSemana.setTipoDiaSemanaEnum(TipoDiaSemanaEnum.QUINTA_FEIRA);
            tipoDiaSemanaRepository.save(tipoDiaSemana);
        }
        {
            TipoDiaSemana tipoDiaSemana = new TipoDiaSemana();
            tipoDiaSemana.setDescricao("Sexta-feira");
            tipoDiaSemana.setTipoDiaSemanaEnum(TipoDiaSemanaEnum.SEXTA_FEIRA);
            tipoDiaSemanaRepository.save(tipoDiaSemana);
        }
        {
            TipoDiaSemana tipoDiaSemana = new TipoDiaSemana();
            tipoDiaSemana.setDescricao("Sábado");
            tipoDiaSemana.setTipoDiaSemanaEnum(TipoDiaSemanaEnum.SABADO);
            tipoDiaSemanaRepository.save(tipoDiaSemana);
        }
        {
            TipoDiaSemana tipoDiaSemana = new TipoDiaSemana();
            tipoDiaSemana.setDescricao("Domingo");
            tipoDiaSemana.setTipoDiaSemanaEnum(TipoDiaSemanaEnum.DOMINGO);
            tipoDiaSemanaRepository.save(tipoDiaSemana);
        }

        {
            TipoGrupoAnamnese tipoGrupoAnamnese = new TipoGrupoAnamnese();
            tipoGrupoAnamnese.setDescricao("Dados Clínicos");
            tipoGrupoAnamnese.setTipoGrupoAnamneseEnum(TipoGrupoAnamneseEnum.DADO_CLINICO);
            tipoGrupoAnamnseRepository.save(tipoGrupoAnamnese);

            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Queixa Principal");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }

            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Sintomas Apresentado");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }
            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Quando se iniciou");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }

            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Eventos Traumáticos da Vida");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }

            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Eventos que Precipitaram ou Agravaram as crises");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }

            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Fez terapia anteriormente");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }

        }

        {
            TipoGrupoAnamnese tipoGrupoAnamnese = new TipoGrupoAnamnese();
            tipoGrupoAnamnese.setDescricao("Histórico");
            tipoGrupoAnamnese.setTipoGrupoAnamneseEnum(TipoGrupoAnamneseEnum.HISTORICO);
            tipoGrupoAnamnseRepository.save(tipoGrupoAnamnese);

            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Momento da Gestação");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }

            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Momentos da Infãncia");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }

            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Momentos da Fase Adolescente e Juventude");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }
            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Hábitos e Interesses");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }
        }
        {
            TipoGrupoAnamnese tipoGrupoAnamnese = new TipoGrupoAnamnese();
            tipoGrupoAnamnese.setDescricao("Observações");
            tipoGrupoAnamnese.setTipoGrupoAnamneseEnum(TipoGrupoAnamneseEnum.OBSERVACAO);
            tipoGrupoAnamnseRepository.save(tipoGrupoAnamnese);

            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Características Observadas (modo de Vestir, Cuidados de Higiene)");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }

            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Estado de Consciencia, Atenção, Confusão Mental, Relatos Coerentes ou não");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }

            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Expressões faciais, posturas, tons de voz, gestigulações");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }

            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Transtornos Psiquiatricos familiares");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }

            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Doençãs Importantes que teve");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }
            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Medicação que esta tomando");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }

            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Aplicação de teste ? Se sim, qual e o resultado");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }

            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Uso de Drogas ?");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }

            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Tentativa de suicidio ?");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }

            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Focos de intervenção psicoterapica");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }
        }
        {
            TipoGrupoAnamnese tipoGrupoAnamnese = new TipoGrupoAnamnese();
            tipoGrupoAnamnese.setDescricao("Relacionamento");
            tipoGrupoAnamnese.setTipoGrupoAnamneseEnum(TipoGrupoAnamneseEnum.RELACIONAMENTO);
            tipoGrupoAnamnseRepository.save(tipoGrupoAnamnese);

            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Mãe");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }

            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Pai");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }

            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Irmão(s)");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }
            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Filhos(s)");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }
            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Observações sobre dinâmica familiar atual");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }
            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Outros");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }
        }
        {
            TipoGrupoAnamnese tipoGrupoAnamnese = new TipoGrupoAnamnese();
            tipoGrupoAnamnese.setDescricao("Vida Adulta");
            tipoGrupoAnamnese.setTipoGrupoAnamneseEnum(TipoGrupoAnamneseEnum.VIDA_ADULTA);
            tipoGrupoAnamnseRepository.save(tipoGrupoAnamnese);

            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Relacionamento com parceiro(a)");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }

            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Vida sexual Atual");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }
            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Situação Financeira");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }
            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Aborto espontâneos/provocados");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }
            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Apoio Social disponível");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }
            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Outros transtornos atuais (Sono, Alimentação, Tiques, etc.)");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }
            {
                TipoDadoClinico tipoDadoClinico = new TipoDadoClinico();
                tipoDadoClinico.setDescricao("Principais lazeres, vida social");
                tipoDadoClinico.setTipoGrupoAnamnese(tipoGrupoAnamnese);
                tipoDadoClinicoRepository.save(tipoDadoClinico);
            }
        }
        {
            TipoEscolaridade tipoEscolaridade = new TipoEscolaridade();
            tipoEscolaridade.setDescricao("Fundamental - Incompleto");
            tipoEscolaridadeRepository.save(tipoEscolaridade);
        }

        {
            TipoEscolaridade tipoEscolaridade = new TipoEscolaridade();
            tipoEscolaridade.setDescricao("Fundamental - Completo");
            tipoEscolaridadeRepository.save(tipoEscolaridade);
        }

        {
            TipoEscolaridade tipoEscolaridade = new TipoEscolaridade();
            tipoEscolaridade.setDescricao("Médio - Incompleto");
            tipoEscolaridadeRepository.save(tipoEscolaridade);
        }

        {
            TipoEscolaridade tipoEscolaridade = new TipoEscolaridade();
            tipoEscolaridade.setDescricao("Médio - Completo");
            tipoEscolaridadeRepository.save(tipoEscolaridade);
        }

        {
            TipoEscolaridade tipoEscolaridade = new TipoEscolaridade();
            tipoEscolaridade.setDescricao("Superior - Incompleto");
            tipoEscolaridadeRepository.save(tipoEscolaridade);
        }

        {
            TipoEscolaridade tipoEscolaridade = new TipoEscolaridade();
            tipoEscolaridade.setDescricao("Superior - Completo");
            tipoEscolaridadeRepository.save(tipoEscolaridade);
        }

        {
            TipoEscolaridade tipoEscolaridade = new TipoEscolaridade();
            tipoEscolaridade.setDescricao("Pós-graduação (Lato senso) - Incompleto");
            tipoEscolaridadeRepository.save(tipoEscolaridade);
        }

        {
            TipoEscolaridade tipoEscolaridade = new TipoEscolaridade();
            tipoEscolaridade.setDescricao("Pós-graduação (Lato senso) - Completo");
            tipoEscolaridadeRepository.save(tipoEscolaridade);
        }

        {
            TipoEscolaridade tipoEscolaridade = new TipoEscolaridade();
            tipoEscolaridade.setDescricao("Pós-graduação (Stricto sensu, nível mestrado) - Incompleto");
            tipoEscolaridadeRepository.save(tipoEscolaridade);
        }

        {
            TipoEscolaridade tipoEscolaridade = new TipoEscolaridade();
            tipoEscolaridade.setDescricao("Pós-graduação (Stricto sensu, nível mestrado) - Completo");
            tipoEscolaridadeRepository.save(tipoEscolaridade);
        }

        {
            TipoEscolaridade tipoEscolaridade = new TipoEscolaridade();
            tipoEscolaridade.setDescricao("Pós-graduação (Stricto sensu, nível doutor) - Incompleto");
            tipoEscolaridadeRepository.save(tipoEscolaridade);
        }

        {
            TipoEscolaridade tipoEscolaridade = new TipoEscolaridade();
            tipoEscolaridade.setDescricao("Pós-graduação (Stricto sensu, nível doutor) - Completo");
            tipoEscolaridadeRepository.save(tipoEscolaridade);
        }
    }
}
