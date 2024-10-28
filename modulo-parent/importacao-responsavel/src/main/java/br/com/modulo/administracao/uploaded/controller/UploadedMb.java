package br.com.modulo.administracao.uploaded.controller;

import br.com.configuracao.util.ArquivoUtil;
import br.com.modulo.administracao.registroimportacao.model.RegistroImportacao;
import br.com.modulo.administracao.registroimportacao.model.UploadedRegistro;
import br.com.modulo.administracao.registroimportacao.service.RegistroImportacaoService;
import br.com.modulo.administracao.uploadedfile.model.Uploaded;
import br.com.modulo.administracao.uploadedfile.service.UploadFileService;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("view")
public class UploadedMb {

    @Autowired
    private UploadFileService uploadFileService;


    @PostConstruct
    public void init() {

    }

    public void carregarTela() {
        try {

        } catch (Exception e) {
            e.printStackTrace();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Erro", e.getMessage()));
        }
    }

    public void inserir() {
    }

    public void salvar() {

    }

    public void alterar() {

    }

    public void visualizar() {
    }

    public void excluir() {

    }

    public void cancelar() {
    }

    public void processar() {

    }

    public void upload(FileUploadEvent event) {
        try {
            UploadedFile uploadedFile = event.getFile();
            File arquivo = ArquivoUtil.escrever(uploadedFile.getFileName(), uploadedFile.getContents());

            uploadFileService.arquivo("PLANILHA_IMPORTACAO", arquivo);
            
            
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Upload completo", "O arquivo " + arquivo.getName()));
        } catch (Exception e) {
            e.printStackTrace();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Erro", e.getMessage()));
        }
    }

    public void excluir(UploadedRegistro uploadedRegistro) throws IOException {

    }


}
